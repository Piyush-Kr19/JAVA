// /Write a program in Java having three classes Apple, Banana and Cherry.
// Class Banana and Cherry are inherited from class Apple and each class has their own member function show.
// Using Dynamic Method Dispatch concept display all the show method of each class. 


// Superclass
class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

// Subclass 1
class Banana extends Apple {
    @Override
    void show() {
        System.out.println("This is Banana class show() method");
    }
} 

// Subclass 2
class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

// Main class
public class Fruits{
    public static void main(String[] args) {

        Apple ref;   // superclass reference

        ref = new Apple();
        ref.show();  // calls Apple show()

        ref = new Banana();
        ref.show();  // calls Banana show()

        ref = new Cherry();
        ref.show();  // calls Cherry show()
    }
}
