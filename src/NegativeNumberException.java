public class NegativeNumberException extends Exception{
    private int number;

    public NegativeNumberException(int number, String message) {
        super(message);
        this.number = number;
    }

    @Override
    public String toString() {
        return "NegativeNumberException: number = " + number + ", message = " + getMessage();
    }
}
