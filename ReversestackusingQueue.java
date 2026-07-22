import java.util.*;

public class ReversestackusingQueue {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        System.out.println("Original Stack: " + stack);

        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        System.out.println("Reversed Stack: " + stack);
    }
}