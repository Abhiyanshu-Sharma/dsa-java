import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Q: Find the largest of the 3

        // 1st approach

        // int max = a;
        // if(b > max) {
        //     max = b;
        // }

        // if(c > max) {
        //     max = c;
        // }

        // 2nd approach

        // int max = 0;

        // if(a > b) {
        //     max = a;
        // } else {
        //     max = b;
        // }

        // if (c > max) {
        //     max = c;
        // }

        // 3rd approach

        int max = Math.max(c, Math.max(a,b));


        System.out.println(max);

        sc.close();
    }
}
