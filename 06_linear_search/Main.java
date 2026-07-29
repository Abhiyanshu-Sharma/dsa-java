import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
	    int target = sc.nextInt();
        int ans = linearSearch(nums, target);
        int ans2 = linearSearch2(nums, target);
        boolean ans3 = linearSearch3(nums, target);


        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);

        sc.close();
    }

    // Search in the Array:
                        // Return the index if item found
                        // Otherwise if not found then return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int index = 0; index < arr.length; index++) {
            // check for element at every index if it is equals to target
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }

        return -1;
    }

    // Search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for(int element : arr) {
            if(element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    // Search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }

        for(int element : arr) {
            if(element == target) {
                return true;
            }
        }

        return false;
    }
}
