public class demo045 {
    public static void main(String[] args) {
        // Declare two numbers
        int num1 = 10, num2 = 20;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swap the numbers without using a third variable
        num1 = num1 + num2; // num1 now becomes 30
        num2 = num1 - num2; // num2 becomes 10 (original value of num1)
        num1 = num1 - num2; // num1 becomes 20 (original value of num2)

        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
