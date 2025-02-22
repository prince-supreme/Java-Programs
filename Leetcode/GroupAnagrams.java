package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> lso = new ArrayList<>();
        boolean aarr[] = new boolean[strs.length];
        for (int i = 0; i < aarr.length; i++) {
            aarr[i] = false;
        }

        for (int i = 0; i < strs.length; i++) {
            if (aarr[i] == true) {
                continue;
            }
            List<String> ls = new ArrayList<>();
            char arr1[] = strs[i].toCharArray();
            Arrays.sort(arr1);
            String temp = new String(arr1);
            aarr[i] = true;

            ls.add(strs[i]);

            for (int j = i + 1; j < strs.length; j++) {
                char arr2[] = strs[j].toCharArray();
                Arrays.sort(arr2);
                String temp2 = new String(arr2);
                if (temp.equals(temp2)) {
                    aarr[j] = true;
                    ls.add(strs[j]);
                }
            }

            lso.add(ls);

        }

        return lso;
    }

    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(strs));

    }
}
