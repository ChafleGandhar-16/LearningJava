import java.util.Scanner;

class Student2
{
    int a;
    int b;
    void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = in.nextInt();
        System.out.print("Enter b: ");
         b = in.nextInt();
    }
    Student2 calculateData(Student2 obj1) {
        Student2 obj3 = new Student2();
        obj3.a =  obj1.a + a;
        obj3.b = obj1.b + b;
        return obj3;
    }
}


public class Classes1 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.acceptData();
        Student2 s2 = new Student2();
        s2.acceptData();
        System.out.println(s2.calculateData(s1).a +  " " + s2.calculateData(s1).b);// no need to pass s2 too, as naturally a and b of s2 must hold the values that were passed in acceptData
    }
}
