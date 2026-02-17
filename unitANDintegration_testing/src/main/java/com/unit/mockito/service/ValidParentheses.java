/**
 * @author Naveen K Wodeyaar,
 * @Date 14-Feb-2026
 */
package com.unit.mockito.service;

import java.util.*;

class Solution5 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution5 sol = new Solution5();

        System.out.println(sol.isValid("()"));      // true
        System.out.println(sol.isValid("()[]{}"));  // true
        System.out.println(sol.isValid("(]"));      // false
        System.out.println(sol.isValid("([)]"));    // false
    }
}
