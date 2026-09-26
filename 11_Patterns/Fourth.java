public class Fourth {
    public static void main(String[] args) {
        pattern4(5);
    }

    static void pattern4(int n) {
        for(int row = 1; row <= n; row++) {
            // for every row run the col
            for(int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // When one row is printed we need to add a newline
            System.out.println();
        }
     }
}
