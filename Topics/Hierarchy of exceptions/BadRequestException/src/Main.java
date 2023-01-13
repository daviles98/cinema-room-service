import java.io.IOException;

// update the class
class BadRequestException extends IOException {

    BadRequestException(String message) {
        super(message);
    }

}