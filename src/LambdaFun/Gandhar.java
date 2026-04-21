package LambdaFun;

interface Gandhar {
    default void m1() {
        System.out.println("Hello World m1");
    }

    static void m2() {
        System.out.println("Hello World m2");
    }
}

class Arya implements Gandhar {

}

