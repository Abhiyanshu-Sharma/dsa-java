package LeetCode.Math;

public class LC_1979_Find_Greatest_Common_Divisor_of_Array {
    class Solution {
        public int findGCD(int[] nums) {
            int max = nums[0];
            int min = nums[0];

            for(int num : nums) {
                if(num > max)
                    max = num;
                
                if(num < min)
                    min = num;
            }
        
            return gcd(min, max);
        }

    private int gcd(int a, int b) {
        while(b!=0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
}