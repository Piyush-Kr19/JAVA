// 5. Write a Java program illustrating ClassCastException, i.e., RuntimeException

class Parent {
}

class Child extends Parent {
}

public class ClassCastDemo {
    public static void main(String[] args) {

        Parent p = new Parent();   // Parent object

        Child c = (Child) p;       // Invalid cast → RuntimeException
    }
}
