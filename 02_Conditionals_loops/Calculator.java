import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     int ans = 0;
     while(true) {
        System.out.println("Enter x pr X tp stop the program");
        System.out.print("Enter Operator: ");

        char op = sc.next().trim().charAt(0);

        System.out.println();

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            System.out.print("Enter 2 numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            if(op == '+') {
                ans = n1 + n2;
            }

            if(op == '-') {
                ans = n1 - n2;
            }

            if(op == '*') {
                ans = n1 * n2;
            }

            if(op == '/') {
                if(n2 != 0)
                ans = n1 / n2;
            }

            if(op == '%') {
                ans = n1 % n2;
            }

        } else if(op == 'x' || op == 'X') {
            System.out.println("Program stopped!");
            break;
        } else {
            System.out.println("Invalid Operation!");
        }

        System.out.println(ans);
     }
     
    }
}
