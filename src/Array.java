import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        try {
        for (int i=0;i<5;i++) {
            System.out.println("Enter number: ");
            arr[i] = sc.nextInt(); }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
