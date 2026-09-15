import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 37)));
        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0) {
            
            // Case 1
            if(matrix[row][col] == target) {
                return new int[] {row, col};
            }

            // Case 2
            if(matrix[row][col] < target) {
                row++;
            }else {
                col--;
            }
        }

        // Case 3
        return new int[] {-1 , -1};
    }
}
