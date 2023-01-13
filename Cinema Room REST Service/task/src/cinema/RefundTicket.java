package cinema;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefundTicket {

    @JsonProperty("returned_ticket")
    private Ticket refundedTicket;

    public RefundTicket() {
    }

    public RefundTicket(Ticket refundedTicket) {
        this.refundedTicket = refundedTicket;
    }
}
