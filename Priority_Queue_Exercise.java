import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Exercise{
    public static void main(String[] args){
        /* Priority Queue = A FIFO structure that serves elements
                            with the highest priorities first
                            before elements with lower priority
        */
        /* this is a normal queue */
        Queue<Double> queue = new LinkedList<>();
        /* adds elements in the queue */
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        /* prints the elements from the queue */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
        main2();
        main3();
        main4();
        main5();
    }
    public static void main2(){
        /* this is priority queue */
        Queue<Double> queue = new PriorityQueue<>();
        /* adds elements in the queue */
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        /* prints the elements from the queue in ascending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
    public static void main3(){
        /* this is priority queue */
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        /* adds elements in the queue */
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);
        /* prints the elements from the queue in descending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
    public static void main4(){
        /* this is priority queue */
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        /* adds elements in the queue */
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        /* prints the elements from the queue in ascending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
    public static void main5(){
        /* this is priority queue */
        Queue<String> queue = new PriorityQueue<>();
        /* adds elements in the queue */
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        /* prints the elements from the queue in descending order */
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();
    }
}