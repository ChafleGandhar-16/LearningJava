package AbstractionAndInterface;

//In interface, all methods are by default public and abstract
//In interface, all variables are by default public, static and final
interface ExInterface {
    int x = 5; //-->public static final int x = 5; (by default)
    void msg1(); //-->public abstract void fun(); (by default)
    void msg2();
}

class ExImplement implements ExInterface {

    @Override
    public void msg1() {// must be public as msg1 is by default public in the interface

    }

    @Override
    public void msg2() {// must be public as msg2 is by default public in the interface

    }
}

public class Interface {
}

/**
Interface means a set of rules. In java, interface->'what to do' and class->'how to do'
Interface is a blueprint of a class that contains abstract methods
Why Interface?-> When multiple class need to follow the same rule but implement differently
Important Rules:
  Interface object cannot be created
  Use 'implements' keyword
  All methods must be overridden in the class
  In old java, interface had only abstract methods
  In modern java(java8+), interface can have multiple types of methods

  Parent      Child       p/not-p       keywords
 Interface   Interface  possible        extends
 Interface   Class      possible        implements
 Class       Interface  not possible       ----
 Class       Class      possible        extends

Types of methods:
  Abstract Method:
      void fun();
      No body. Public and abstract by default...must be overridden

  Default Method:
      default void fun() {
          System.out.println("Hello World");
      }
      has method body...not compulsory to override

  static method: java 8+
      static void fun() {
          some lines of code
      }
      can directly be called... i1.fun()
      used for utility. do not depend on object

  private method: java 9+
        interface i1 {
        private void regularcode() {
            //some lines of code
        }
        default void msg1() {
            regularcode();
            //different lines of code
        }
        default void msg2() {
            regularcode();
            //different lines of code
        }
    }
      When the same line of code needs to be used in the interface
      Used to avoid duplicate code inside interface

  private static method: java 9+
      just how a private method is a helper method for default methods, similarly
      private static method is a helper method for static methods


Diamond Problem
        interface i1 {
        default void fun() {
            //different lines of code
        }
    }
        interface i2 {
        default void fun() {
            //different lines of code
        }
    }
class Caller implements i1, i2 {
    public void fun () { //the compiler won't understand which method to call. hence, we make our own and tell which method to call
        i1.super.show();
    }
}

Interface         vs.         Abstract class
Define Rules                  Provide partial implementation/
                              abstraction

Allow abstract+default+       Allow abstract+concrete method
 static method

variable: public+static+      Any type allowed
final

Constructor:Not allowed       Allowed

Multiple inheritance:Allowed  Not Allowed

**/
