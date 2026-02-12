import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a, b;
            System.out.println("Enter number: ");
            a = sc.nextInt();
            System.out.println("Enter another number: ");
            b = sc.nextInt();
            int c = (a / b);
            System.out.println("Quotient is: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0 not possible");
        }
    }
}

