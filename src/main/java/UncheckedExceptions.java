public class UncheckedExceptions {
    public static void main(String[] args) {
        try {
            int[] numbers = {0,1,2};
            int result = numbers[2] / 0 ;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
