package LeetCode.String;

import java.util.Stack;

// Same as 0316

public class LC_1081_Smallest_Subsequence_of_Distinct_Characters {
    class Solution {
        public String smallestSubsequence(String s) {
            int[] lastIndex = new int[26];
            boolean[] isDistinct = new boolean[26];

            Stack<Character> stack = new Stack<>();

            StringBuilder sb = new StringBuilder();

                // Last Position of each Character
                for(int i = 0; i < s.length(); i++) {
                    lastIndex[s.charAt(i) - 'a'] = i;
                }

                for(int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);

                    if(isDistinct[c - 'a'])
                        continue;

                    while(!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek() - 'a'] > i) {
                        isDistinct[stack.pop() - 'a'] = false;
                    }

                stack.push(c);
                isDistinct[c - 'a'] = true;
            }

            for(char ch : stack)
                sb.append(ch);

            return sb.toString();
        }   
    }
}

/*
Approach:
1. Store the last occurrence of every character.
2. Use a stack to maintain the lexicographically smallest subsequence.
3. Skip characters already present.
4. While the top of the stack is larger than the current character and appears again later, pop it.
5. Build the answer from the stack.

Time Complexity: O(n)
Space Complexity: O(26)
*/