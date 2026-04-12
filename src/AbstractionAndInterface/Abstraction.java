package AbstractionAndInterface;

class A {
    void fun1() {
       System.out.println("AbstractionAndInterface.A");
    }
    static void fun2() {
        System.out.println("AbstractionAndInterface.A");
    }
}

class B extends A {

    void fun1() { //Overrides fun1 method from class AbstractionAndInterface.A
        System.out.println("AbstractionAndInterface.B");
    }
    static void fun2() { //Is hided by fun2 from class AbstractionAndInterface.A
        System.out.println("AbstractionAndInterface.B");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.fun1();
        obj1.fun2();
    }
}
