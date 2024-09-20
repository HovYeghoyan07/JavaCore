package homework.medicalCenter11;

public class TimeNotAllowedException extends Exception {
    public TimeNotAllowedException() {
    }

    public TimeNotAllowedException(String message) {
        super(message);
    }
}