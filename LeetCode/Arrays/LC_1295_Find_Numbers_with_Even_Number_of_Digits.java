package LeetCode.Arrays;

    public class LC_1295_Find_Numbers_with_Even_Number_of_Digits {
        class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));

        System.out.println(digits2(-345678));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    // Function to check whether the number is even or not
    private static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }
}

    }
