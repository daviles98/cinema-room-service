package cinema;


public class PurchaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public PurchaseException(String msg) {
        super(msg);
    }
}
