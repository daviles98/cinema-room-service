package cinema;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Stats {

    @JsonProperty("current_income")
    private int currentIncome;

    @JsonProperty("number_of_available_seats")
    private int numberOfAvailableSeats;

    @JsonProperty("number_of_purchased_tickets")
    private int numberOfPurchasedTickets;

    public Stats() {
    }

    public Stats(int currentIncome, int numberOfAvailableSeats, int numberOfPurchasedTickets) {
        this.currentIncome = currentIncome;
        this.numberOfAvailableSeats = numberOfAvailableSeats;
        this.numberOfPurchasedTickets = numberOfPurchasedTickets;
    }

    public int getCurrentIncome() {
        return currentIncome;
    }

    public void setCurrentIncome(int currentIncome) {
        this.currentIncome = currentIncome;
    }

    public int getNumberOfAvailableSeats() {
        return numberOfAvailableSeats;
    }

    public void setNumberOfAvailableSeats(int numberOfAvailableSeats) {
        this.numberOfAvailableSeats = numberOfAvailableSeats;
    }

    public int getNumberOfPurchasedTickets() {
        return numberOfPurchasedTickets;
    }

    public void setNumberOfPurchasedTickets(int numberOfPurchasedTickets) {
        this.numberOfPurchasedTickets = numberOfPurchasedTickets;
    }

    public void updateStats(Ticket ticket) {
        this.currentIncome = ticket.isBooked() ? this.currentIncome + ticket.getPrice() : this.currentIncome - ticket.getPrice();
        this.numberOfAvailableSeats = ticket.isBooked() ? this.numberOfAvailableSeats-1 : this.numberOfAvailableSeats+1;
        this.numberOfPurchasedTickets = ticket.isBooked() ? this.numberOfPurchasedTickets+1 : this.numberOfPurchasedTickets-1;

    }
}
