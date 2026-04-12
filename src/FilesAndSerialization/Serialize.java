package FilesAndSerialization;

import java.io.*;

class Student1 implements Serializable {
    int id;
    String name;
    double percentage;

    public Student1(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }
}

public class Serialize {
    static void objOutput (Student1 obj) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\IntelliJ_Idea\\Student.dat"));
        oos.writeObject(obj);
        oos.close();
    }

    static Student1 objInput () throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\IntelliJ_Idea\\Student.dat"));
        Student1 obj = (Student1) ois.readObject();
        return obj;
    }

    public static void main(String[] args) throws Exception {
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\IntelliJ_Idea\\Student2.dat"));
        Student1 s1 = new Student1(1, "Gandhar", 88.67);
        Student1 s2 = objInput();
        System.out.println(s2.id + " " + s2.name + " " + s2.percentage);
        System.out.println(s2);
//        oos.writeObject(s1);
    }
}
