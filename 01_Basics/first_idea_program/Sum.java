import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1 = input.nextFloat();
        float n2 = input.nextFloat();

        float sum = n1 + n2;

        System.out.println("Sum = " + sum);

        input.close();
    }
}
