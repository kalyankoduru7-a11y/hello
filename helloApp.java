public class helloApp {
    public static void main(String[] args) {

        // Assign name using ternary operator
        String name = (args.length > 0) ? args[0] : "World";

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}