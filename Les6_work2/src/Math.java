public class Math {
    /**
     * Class calculate.Math contains methods for arithmetic operations: addition, subtraction, multiplying and division
     *
     * @param num1
     * @param num2
     */
    @AnnotCalc(num1 = 20, num2 = 10)
    /**
     * To calculate the sum of two numbers
     * @param num1
     * @param num2
     */
    public void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    /**
     * To calculate the difference between two numbers
     *
     * @param num1
     * @param num2
     */
    public void sub(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    /**
     * To calculate the product of two numbers
     *
     * @param num1
     * @param num2
     */
    public void mult(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    /**
     * To calculate the quotient of two numbers
     *
     * @param num1
     * @param num2
     * @throws ArithmeticException if your second number is zero
     */
    public void div(int num1, int num2) {
        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
