package LeetCode.String;

import java.util.Stack;

// Same as LC 1081

public class LC_0316_Remove_Duplicate_Letters {
    class Solution {
    public String removeDuplicateLetters(String s) {
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
LeetCode 316 - Remove Duplicate Letters

Approach:
- Store last occurrence of every character.
- Use a monotonic increasing stack.
- Maintain uniqueness using a boolean array.

Time Complexity: O(n)
Space Complexity: O(26)
*/