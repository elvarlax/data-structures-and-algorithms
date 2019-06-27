package academy.learnprogramming.queueschallenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
        Using a stack and a queue, determine whether a string is a palindrome.
        Strings may contain punctuation and spaces.
        They should be ignored.
        */
        System.out.println(checkForPalindrome("abccba")); // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?")); // should return true
        System.out.println(checkForPalindrome("I did, did I?")); // should return true
        System.out.println(checkForPalindrome("hello")); // should return false
        System.out.println(checkForPalindrome("Don't nod")); // should return true
    }

    public static boolean checkForPalindrome(String string) {
        LinkedList<Character> queue = new LinkedList<>();
        LinkedList<Character> stack = new LinkedList<>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }
}
