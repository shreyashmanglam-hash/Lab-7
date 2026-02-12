import java.util.Scanner;
class NegativeException extends Exception {
    NegativeException(String msg) {
        super(msg);
    }
}

public class Negative {
    void ProcessInput(int x) throws NegativeException {
        if (x<0) {
            throw new NegativeException("Caught the exception");
        }
        System.out.println(2*x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        try {
            Negative obj = new Negative();
            obj.ProcessInput(n);
        }
        catch (NegativeException e) {
            System.out.println(e.getMessage());
        }
    }
}
