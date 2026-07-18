package LeetCode.Recursion;

public class LC_0231_isPowerOfTwo {
    class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}
}
