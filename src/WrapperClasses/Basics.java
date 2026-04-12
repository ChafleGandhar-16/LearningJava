package WrapperClasses;

public class Basics {
    public static void main(String[] args) {
        String s1 = "1234567";
        Integer b = 10;

        Integer x = Integer.valueOf(s1); //Converts into Wrapper objects
        int a = Integer.parseInt(s1); //Converts into primitives
        String s2 = b.toString(); //Converts into String
        String s3 = b + ""; //Can also be done this way

        String s4 = "HII";
        String s5 = new String("HII");
        System.out.println(s4.hashCode()); //Generate a unique code for that value
        System.out.println(s5.hashCode()); //both s4 and s5 will have the same value
        System.out.println(Integer.parseInt("1101", 2)); //Binary to int
        System.out.println(Double.isInfinite(1.0/0.0));
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Math.sqrt(-1));//For invalid mathematical operations we get NaN...not a number
        System.out.println(Double.isNaN(0.0/0.0));
        //Wrapper Objects are immutable. If the value is changed, the new Object is created with that value and previous is deleted

        Integer c = 127;
        Integer d = 127;
        System.out.println(c == d); //in between -128 to 127 the c and d in saved in the same memory
        Integer e = 128;
        Integer f = 128;
        System.out.println(f == e); //values beyond these ranges will return false

    }
}

