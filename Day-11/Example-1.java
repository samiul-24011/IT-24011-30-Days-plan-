import java.util.Queue;
import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        q.poll();

        for (int num : q) {
            System.out.println(num);
        }
    }
}
