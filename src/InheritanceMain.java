class Animal {
    void eat(){
        System.out.println("Animal eats");
    }
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog Barks");
    }
    void character() {
        System.out.println("Dog is loyal Animal");
    }
}

class Puppy extends Dog {
    void appearance() {
        System.out.println("Puppy is cute");
    }
}

class People {
    People() {
        System.out.println("Person in created");
    }
}

class Student extends People {
    Student() {
        System.out.println("Student created");
    }
}

class Employee {
    int salary = 50000;
}

class Manager extends Employee {
    int salary = 80000;
}

class Vehicle {
    String brand;
    Vehicle (String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle {
    String model;
   Car (String brand, String model) {
       super(brand);
       this.model = model;
   }
}

class Shape {
    void draw() {
        System.out.println("Shape draws");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draws");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("Rectangle draws");
    }
}

public class InheritanceMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sound();
        Student s = new Student();
        Car c = new Car("Tata", "Punch");
        Puppy p = new Puppy();
        p.eat();
        p.character();
        p.appearance();
        Shape cir = new Circle();
        cir.draw();
        Shape rec = new Rectangle();
        rec.draw();
    }
}


