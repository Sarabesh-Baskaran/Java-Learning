public class SpecialProblem {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int result = 10 / 0; // it will not print B, because it throw exception before that so it will go to catch statement
            System.out.println("B");
        } catch (ArithmeticException e) { //It print the C
            System.out.println("C");
        } finally {
            System.out.println("D"); //Then, execute the finally statement. And atlast after all try-catch block it prints E statement.
        }

        System.out.println("E");
    }
}