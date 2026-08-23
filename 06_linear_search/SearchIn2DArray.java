import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int target = sc.nextInt();
        System.out.println();
        int[] ans = search(arr, target);

        System.out.println(Arrays.toString(ans));
        System.out.println("Max number in the array: " + max(arr));
        sc.close();
    }

    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
