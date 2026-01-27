// 6. Write a Java program illustrating chain exception.


class ChainException {

    static void method1() throws Exception {
        throw new Exception("Original exception");
    }

    static void method2() throws Exception {
        try {
            method1();
        } catch (Exception e) {
            throw new Exception("Chained exception", e);
        }
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

