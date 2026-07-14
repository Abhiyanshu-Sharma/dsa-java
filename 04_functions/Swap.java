public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
         // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a, b);

        System.out.println(a + " " + b);

        String name = "Abhiyanshu Sharma";
        changeName(name);
        System.out.println(name);

    }

    static void changeName(String name) {
        name = "Kittu";
    }

    static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
        // this change will only be valid in this function scope only.
    }
}
