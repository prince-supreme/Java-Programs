package Queuecustom;

import java.util.LinkedList;
import java.util.Queue;

public class Inbuitqueue {
    public static void main(String[] args) {
        // it is a interface but stack is a class
        Queue<Integer> queue = new LinkedList<>();

        queue.add(24);
        queue.add(2);
        queue.add(45);
        queue.add(76);
        queue.add(98);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
