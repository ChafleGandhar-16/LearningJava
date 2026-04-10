public class T4StringFunction {
    public static void main(String[] args) {
        String greeting = greet();
        System.out.println(greeting);
        String name = "Gandhar";
        changeName(name); //no change happens to the original object
    }
    //Scoping: scope of a variable means that variable is only available inside that function, not outside that function
    static String greet () {
        String greeting = "How are you?";
        return greeting;
    }
// java has only pass by value
    static void changeName (String naaw) { //name and naaw are both pointing towards "Gandhar"
        naaw = "Omkar"; //a new object is being created and now naaw is pointing towards "Omkar"
    }
}
