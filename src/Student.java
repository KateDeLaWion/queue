import java.util.LinkedList;
import java.util.Queue;

public class Student {

    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> q = new LinkedList<>();

        // add
        for (int i = 0; i < 5; i++){
            q.add(i);
            }

        System.out.println("Elements in queue: " + q);

        // remove
        int removable = q.remove();
        System.out.println("removed element is : " + removable);

        // peek
        int head = q.peek();
        System.out.println("peek head of queue : " + head);

        // size
        int size = q.size();
        System.out.println("size of queue : " + size);


    }

}
