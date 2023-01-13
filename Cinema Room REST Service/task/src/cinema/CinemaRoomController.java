package cinema;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class CinemaRoomController {
    private CinemaRoom cinemaRoom = new CinemaRoom();

    @GetMapping("/seats")
    public CinemaRoom getSeats(){
        return cinemaRoom;
    }

    @PostMapping("/purchase")
    public Seat purchase(@RequestBody Ticket ticket) {
        boolean invalidRowRange = ticket.getRow() > 9 || ticket.getRow() < 1;
        boolean invalidColumnRange = ticket.getColumn() > 9 || ticket.getColumn() < 1;
        if (invalidRowRange || invalidColumnRange) {
            throw new PurchaseException("The number of a row or a column is out of bounds!");
        }
        int index = 9 * (ticket.getRow() - 1) + (ticket.getColumn() - 1);
        Seat selectedSeat = cinemaRoom.getAvailableSeats().get(index);
        if(selectedSeat.getTicket().isBooked()) {
            throw new PurchaseException("The ticket has been already purchased!");
        } else {
            selectedSeat.getTicket().setBooked(true);
            cinemaRoom.getStats().updateStats(selectedSeat.getTicket());
            return selectedSeat;
        }
    }

    @PostMapping("/return")
    public RefundTicket refund(@RequestBody Seat seat) {
       UUID refundSeatToken = seat.getToken();
       Ticket refundTicket = checkIfTokenExists(refundSeatToken);
       if(refundTicket == null) {
           throw new PurchaseException("Wrong token!");
       } else {
           cinemaRoom.getStats().updateStats(refundTicket);
           return new RefundTicket(refundTicket);
       }
    }

    public Ticket checkIfTokenExists(UUID uuid) {
        List<Seat> allSeats = cinemaRoom.getAvailableSeats();
        for(Seat s: allSeats) {
            if(s.getToken().compareTo(uuid) == 0 && s.getTicket().isBooked()) {
                s.getTicket().setBooked(false);
                return s.getTicket();
            }
        }
        return null;
    }

    @PostMapping("/stats")
    public Stats checkStats(@RequestParam(required = false) String password) {
        String checkPassword = "super_secret";
        if (checkPassword.equals(password)) {
            return cinemaRoom.getStats();
        } else {
            throw new WrongPasswordException("The password is wrong!");
        }
    }

}
