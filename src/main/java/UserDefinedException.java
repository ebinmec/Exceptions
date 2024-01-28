class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        try {
            int number = -5;
            validateNumber(number);
            System.out.println("Number is valid: " + number);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }

    private static void validateNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
    }
}
