//*5.Create a user defined exception named CheckArgument to check the number of arguments passed through command line.
//*If the number of arguments is less than four then throw the Check Argument exception,
//*else print the addition of squares of all the four elements.


//? User Exception
class CheckArgument extends Exception {
    public CheckArgument(String msg) {
        super(msg);
    }
}

public class CheckArgumentDemo {

    static void checkArgs(String[] args) throws CheckArgument {

        if (args.length < 4) {   //* Input Arguments */
            throw new CheckArgument("Less than four arguments passed");
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int num = Integer.parseInt(args[i]);
            sum += num * num;
        }

        System.out.println("Addition of squares: " + sum);
    }

    public static void main(String[] args) {

        try {
            checkArgs(args);
        }
        catch (CheckArgument e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
