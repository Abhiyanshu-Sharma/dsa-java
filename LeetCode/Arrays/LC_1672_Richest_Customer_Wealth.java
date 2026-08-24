package LeetCode.Arrays;

public class LC_1672_Richest_Customer_Wealth {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            
            for (int anInt : ints) {
                sum += anInt;
            }

            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
}
