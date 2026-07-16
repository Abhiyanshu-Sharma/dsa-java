package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LC_01_Two_Sums {
    class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int found = target - nums[i];
            if(map.containsKey(found)) {
                ans[0] = map.get(found);
                ans[1] = i;
                return ans;
            }
                map.put(nums[i], i);
        }
                return ans;
    }
}
}
