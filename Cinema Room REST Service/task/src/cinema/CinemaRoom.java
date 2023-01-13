package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

public class CinemaRoom {

    @JsonProperty("total_rows")
    private int totalRows = 9;
    @JsonProperty("total_columns")
    private int totalColumns = 9;

    @JsonProperty("available_seats")
    private List<Ticket> availableTickets = new ArrayList<>(totalRows*totalColumns);

    @JsonIgnore
    private List<Seat> availableSeats = new ArrayList<>(totalRows*totalColumns);

    @JsonIgnore
    private Stats stats = new Stats(0, totalRows*totalColumns, 0);

    public CinemaRoom() {
        for(int r = 0; r < totalRows; r++) {
            int price = (r+1 <= 4) ? 10 : 8;
            for(int c = 0; c < totalColumns; c++) {
                availableSeats.add(new Seat(UUID.randomUUID(), new Ticket(r+1, c+1, price)));
                availableTickets.add(new Ticket(r+1, c+1, price));
            }
        }
    }


    public CinemaRoom(int totalRows, int totalColumns, List<Seat> availableSeats) {
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
        this.availableSeats = availableSeats;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }

    public List<Seat> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<Seat> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
