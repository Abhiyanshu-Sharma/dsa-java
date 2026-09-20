package LeetCode.Arrays;

public class LC_287_Find_Duplicate {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if(nums[i] < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
