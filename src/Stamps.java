import java.util.LinkedList;
import java.util.Queue;

public class Stamps {

        public static void main(String[] args) {
            // Create a queue
            Queue<Integer> q = new LinkedList<>();

            // add
            for (int i = 1; i <= 10; i++){
                q.add(i);
            }

            System.out.println("Original elements in queue: " + q);
            System.out.println();

            // remove
            int removable = q.remove();
            System.out.println("removed element is : " + removable);
            System.out.println("Current elements in queue: " + q);
            System.out.println();

            // peek
            int head = q.peek();
            System.out.println("peek head of queue : " + head);
            System.out.println("Current elements in queue: " + q);
            System.out.println();

            // size
            int size = q.size();
            System.out.println("size of queue : " + size);
            System.out.println("Current elements in queue: " + q);
            System.out.println();

        }


}
