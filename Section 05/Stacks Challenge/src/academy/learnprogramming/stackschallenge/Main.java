package academy.learnprogramming.stackschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
        Using a stack, determine whether a string is a palindrome.
        Strings may contain punctuation and spaces.
        They would be ignored.

        Examples:
            1. "I did, did I?" is a palindrome
            2. "Racecar" is a palindrome
            3. "hello" is not a palindrome
        */
        System.out.println(checkForPalindrome("abccba")); // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?")); // should return true
        System.out.println(checkForPalindrome("I did, did I?")); // should return true
        System.out.println(checkForPalindrome("hello")); // should return false
        System.out.println(checkForPalindrome("Don't nod")); // should return true
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder original = new StringBuilder(string.length());
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                original.append(c);
                stack.push(c);
            }
        }

        StringBuilder reversed = new StringBuilder(stack.size());

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return original.toString().equals(reversed.toString());
    }
}
