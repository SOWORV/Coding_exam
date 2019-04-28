package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        System.out.println(q);
        int remove = q.remove();
        System.out.println("remove element "+remove);
        System.out.println(q);
        int peek = q.peek();
        System.out.println("head of queue "+peek);





    }

}
