//*4.Write a program to create user defined exceptions called HrsException, MinException and SecException.
//*  Create a class Time which contains data members hours, minutes, seconds and a method to take a time from user which throws the user defined exceptions 
//*f hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).

import java.util.Scanner;

//? Exception for hour
class InvalidHourException extends Exception {
    public InvalidHourException(String msg) {
        super(msg);
    }
}

//? Exception for minute
class InvalidMinuteException extends Exception {
    public InvalidMinuteException(String msg) {
        super(msg);
    }
}

//? Exception for second
class InvalidSecondException extends Exception {
    public InvalidSecondException(String msg) {
        super(msg);
    }
}

class Time {

    void acceptTime(int h, int m, int sec)
            throws InvalidHourException, InvalidMinuteException, InvalidSecondException {

        if (h > 24 || h < 0)
            throw new InvalidHourException("hour greater than 24");

        if (m > 60 || m < 0)
            throw new InvalidMinuteException("mintues greater than 60");

        if (sec > 60 || sec < 0)
            throw new InvalidSecondException("seconds greater than 60");
    }
}

public class TimeExceptionOutputDemo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Time t = new Time();

        System.out.println("Output 2: Caught the exception");

        // Hour exception
        try {
            System.out.print("Enter hours: ");
            int h = s.nextInt();
            t.acceptTime(h, 10, 10);
        } catch (InvalidHourException e) {
            System.out.println("Exception occurred:  " + e);
        } catch (Exception e) { }

        // Minute exception
        try {
            System.out.print("Enter minutes: ");
            int m = s.nextInt();
            t.acceptTime(10, m, 10);
        } catch (InvalidMinuteException e) {
            System.out.println("Exception occurred:  " + e);
        } catch (Exception e) { }

        // Second exception
        try {
            System.out.print("Enter seconds: ");
            int sec = s.nextInt();
            t.acceptTime(10, 10, sec);
        } catch (InvalidSecondException e) {
            System.out.println("Exception occurred:  " + e);
        } catch (Exception e){}
    }
}

