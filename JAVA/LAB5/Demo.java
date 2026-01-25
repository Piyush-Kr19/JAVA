/*2.Define an interface Motor with a data member capacity and two methods such as run and consume.
Define a Java class ‘Washing machine’ which implements this interface and write the code to 
check the value of the interface data member thru an object of the class.*/


interface Motor{
    int capacity = 10;

    void run ();
    void consume();
}

class WashingMachine implements Motor{
    
    @Override
    public void run(){
        System.out.println("Washing Machine is running");
    }

    @Override
    public void consume(){
        System.out.println("Washing Machine is consuming power");
    }
}

public class Demo {
    public static void main(String[] args) {
        Motor m = new WashingMachine();
        m.run();
        m.consume();
        System.out.println("Motor capacity: " + Motor.capacity);
    }
}