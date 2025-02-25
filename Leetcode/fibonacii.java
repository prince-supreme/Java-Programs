package Leetcode;

class fibonacii {
    public static void fibonaci(int n) {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int c;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        fibonaci(5);
    }
}
