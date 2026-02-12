class ArgumentException extends Exception {
    ArgumentException(String msg) {
        super(msg);
    }
}



public class Command {
    public static void main(String[] args) throws ArgumentException {
        try {
            if (args.length < 4) {
                throw new ArgumentException("Exception");
            }
            int sum = 0;
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum = sum + num * num;
            }
            System.out.println(sum);
        }
        catch (ArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

