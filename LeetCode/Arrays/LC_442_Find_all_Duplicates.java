package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC_442_Find_all_Duplicates {
    public List<Integer> findDuplicates(int[] nums) {
         int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans.add(nums[index]);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int f, int s) {
        int t = arr[f];
        arr[f] = arr[s];
        arr[s] = t;
    }
}
