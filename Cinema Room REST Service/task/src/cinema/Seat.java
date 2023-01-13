package cinema;
import java.util.UUID;

public class Seat {

    private UUID token;

    private Ticket ticket;

    public Seat() {}

    public Seat(UUID token, Ticket ticket) {
        this.token = token;
        this.ticket = ticket;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "token=" + token.toString() +
                ", ticket=" + ticket.toString() +
                '}';
    }
}
