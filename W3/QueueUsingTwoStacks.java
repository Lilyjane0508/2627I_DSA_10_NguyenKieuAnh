import java.util.*;

public class QueueUsingTwoStacks {
    private final Deque<Integer> q = new ArrayDeque<>();
    public void enqueue(int x) {q.addLast(x);}
    public int dequeue() {return q.removeFirst();}
    public int front() {return q.peekFirst();}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if (type == 1) queue.enqueue(sc.nextInt());
            else if (type == 2) queue.dequeue();
            else System.out.println(queue.front());
        }
    }
}