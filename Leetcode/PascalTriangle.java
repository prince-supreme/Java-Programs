package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> lsp = new ArrayList<>();
        if (n == 0) {
            return lsp;
        }

        for (int i = 1; i <= n; i++) {
            List<Integer> lsc = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    lsc.add(1);
                    continue;
                } else if (j == i) {
                    lsc.add(1);
                    continue;
                } else {
                    lsc.add(lsp.get(i - 2).get(j - 2) + lsp.get(i - 2).get(j - 1));
                }
            }
            lsp.add(lsc);
        }
        return lsp;

    }

    public static void main(String[] args) {
        List<List<Integer>> lsp = generate(5);
        System.out.println(lsp);
    }
}
