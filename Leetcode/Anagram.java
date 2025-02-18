package Leetcode;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {

        int l1 = s.length();
        int l2 = t.length();
        if (l1 != l2) {
            return false;
        }
        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        String a = new String(char1);
        String b = new String(char2);

        for (int i = 0; i < char2.length; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagrama";
        boolean ans = isAnagram(a, b);
        System.out.println(ans);
    }

}