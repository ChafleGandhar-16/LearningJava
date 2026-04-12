package T14String;

public class T14String {
    public static void main(String[] args) {
        String name = "Gandhar Chafle"; //String is a class of java
        System.out.println(name);
        String a = "Gandhar"; //Strings are immutable
        System.out.println(a);
        a = "Chafle"; //A new variable is created and 'a' is now pointing to "Chafle" instead of "Gandhar". The original string wasn't altered at all.
        System.out.println(a);
        String b = "Chafle"; //Both reference variables a and b are pointing to the same object (done by java for optimization)
        String x = "Cha" + "fle"; // x is also pointing to the same object
        // Comparison of Strings
        // 1. '==' checks if reference variables are pointing to the same object
        // This means that a ----> "Chafle" <---- b. Both a and b are pointing to the same "Chafle"
        System.out.println(a == b); //Gives true
        String c = "Gandhar";
        String d = new String("Gandhar"); //due to 'new', two different objects are created
        //2. '.equals()' checks if the values are same i.e. Gandhar is same are Gandhar
        System.out.println(c == d); //Gives false
        System.out.println(c.equals(d)); //Gives true

        System.out.println(c.length()); //gives the length of c
        System.out.println(c.concat(a)); //concatenation
        System.out.println(c + a); // concatenation can also be done this way
        System.out.println(c.isEmpty()); //checks is the string is empty
        String e = "   ";
        System.out.println(e.isEmpty());
        System.out.println(e.isBlank()); //ignores the white space and gives true
        System.out.println(("      Hello    !!    ".trim())); //removes the start and end spaces
        System.out.println(("ABcd").toLowerCase());
        System.out.println(("ABcd").toUpperCase());
        System.out.println(String.valueOf(20) + String.valueOf(30)); //converts different types of values into string
        System.out.println(("Fuck Face").replace("F", "L"));
        String f = "How are you Brother";
        System.out.println(f.contains("Brother")); //true
        System.out.println(f.contains("you Brother")); //true
        System.out.println(f.contains("How you")); //false
        System.out.println(f.contains("how")); //false
        System.out.println(f.toLowerCase().contains("how")); //true
        System.out.println(f.endsWith("her")); //true
        System.out.println(f.charAt(2)); //w
        char g = 'x';
        System.out.println((int)g); //120
        System.out.println(("ABC").equalsIgnoreCase("abc")); //true

    }
}
