package queues;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public  class Queues {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            queue.add(i);
        }
        System.out.println("Elements: " + queue);

        int removed = queue.remove();
        System.out.println("Removed element " + removed);

        System.out.println("New Queue: " + queue);

        int headQueue = queue.peek();
        System.out.println("Head: " + headQueue);

        int queueSize = queue.size();
        System.out.println("Queue size: " + queueSize);
    }
}