class Person {
    int id;
    String name;

//    Person () {
//        Default Constructor
//    }

    Person(int id, String name) {
        this.id = id; //
        this.name = name;
    }
}

class Std extends Person {
    double percentage;
    int marks;
    Std (int id, String name, int marks, double percentage) { //It is duty of child class to call the parent class parameterized constructor if no default constructor is present
        super(id, name); //super is used to call the immediate parent constructor
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.marks = marks;
    };

    boolean calculate() {
        boolean result = (marks/600 == percentage);
        return result;
    }
}

class Show extends Std {
    int IQ;
    String address;
    Show(int id, String name, int marks, double percentage, int IQ, String address) {
        super(id, name, marks, percentage);
        this.IQ = IQ;
        this.address = address;
    }

    void showAllInfo() {
        System.out.println(name + " Lives in " + address + " ");
        System.out.println("IQ: " + IQ);
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage);
        System.out.println("Is percentage correct?: " + calculate());

    }
}
public class Inheritance {
    public static void main(String[] args) {
        Show s1 = new Show(18,"Gandhar", 472, 92.1, 120, "Wardha");
        Show s2 = new Show(57, "Parth", 400, 47.4, 20, "Yawatamal");
        s1.showAllInfo();
        s2.showAllInfo();

    }
}
