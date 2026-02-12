import java.util.Scanner;
class HrsException extends Exception {
    HrsException(String msg) {
        super(msg);
    }
}
class MinsException extends Exception {
    MinsException(String msg) {
        super(msg);
    }
}
class SecsException extends Exception {
    SecsException(String msg) {
        super(msg);
    }
}

public class Time {
    void test(int x,int y,int z) throws HrsException,MinsException,SecsException {
        if (x>24 || x<0) {
            throw new HrsException("Hours exception");
        }
        if (y>60 || y<0) {
            throw new MinsException("Minutes exception");
        }
        if (z>60 || z<0) {
            throw new SecsException("Seconds Exception");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours: ");
        int h = sc.nextInt();
        System.out.println("Enter minutes: ");
        int m = sc.nextInt();
        System.out.println("Enter seconds: ");
        int s = sc.nextInt();
        Time t = new Time();
        try {
            t.test(h,m,s);
        }
        catch (HrsException e) {
            System.out.println(e.getMessage());
        }
        catch (MinsException e) {
            System.out.println(e.getMessage());
        }
        catch (SecsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Execution complete");
        }

        }
}

