package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CinemaExceptionHandler {

    @ExceptionHandler(PurchaseException.class)
    public ResponseEntity<ErrorMessage> handlePurchaseException(PurchaseException ex){
        ErrorMessage message = new ErrorMessage(ex.getMessage());
        return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(WrongPasswordException.class)
    public ResponseEntity<ErrorMessage> handleWrongPasswordException(WrongPasswordException ex) {
        ErrorMessage message = new ErrorMessage(ex.getMessage());
        return new ResponseEntity<>(message, HttpStatus.UNAUTHORIZED);
    }
}
