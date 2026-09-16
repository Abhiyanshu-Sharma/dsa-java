import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {-1, 7, -32, 0, 89};
        int[] arr2 = {3, 1, 5, 4, 2};
        bubbleSort(arr);
        bubbleSort(arr2);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n - 1 times
        for(int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for(int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j - 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted
            if(!swapped) {
                break;
            }
        }
    }
}
