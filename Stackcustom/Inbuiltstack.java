package Stackcustom;

import java.util.Stack; // file imported to use

public class Inbuiltstack {
    public static void main(String[] args) {
        // write code here
        Stack<Integer> stack = new Stack<>();

        // push elements in stack
        stack.push(98);
        stack.push(64);
        stack.push(23);
        stack.push(100);
        stack.push(234);

        // poping the element in the stack
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}