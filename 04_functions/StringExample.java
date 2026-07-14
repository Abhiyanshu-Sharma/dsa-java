import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String msg = greet();
        // System.out.println(msg);

        Scanner in  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String naam = in.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);

        in.close();
    }

    static String myGreet(String name) {
        String msg = "Hello" + name;

        return msg;
    }
    
    static String greet() {
        String greeting = "how are you?";
        return greeting;
    }
}
