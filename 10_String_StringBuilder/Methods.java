import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Abhiyanshu Sharma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.err.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Kunal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
