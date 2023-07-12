package CCIV;

import java.util.Stack;

public class QueueWithTwoStacks {
    public static class MyQueue<T> {
        private final Stack<T> stackNewestOnTop = new Stack<>();
        private final Stack<T> stackOldestOnTop = new Stack<>();

        public void enqueue(T value) {
            stackNewestOnTop.push(value);
        }

        public T dequeue() {
            shiftStacks();
            return stackOldestOnTop.pop();
        }

        public T peek() {
            shiftStacks();
            return stackOldestOnTop.peek();
        }

        public boolean isEmpty() {
            return stackNewestOnTop.isEmpty() && stackOldestOnTop.isEmpty();
        }

        private void shiftStacks() {
            if (stackOldestOnTop.isEmpty()) {
                while (!stackNewestOnTop.isEmpty()) {
                    stackOldestOnTop.push(stackNewestOnTop.pop());
                }
            }
        }
    }

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(5);
        myQueue.enqueue(10);
        myQueue.enqueue(15);

        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Peeked element: " + myQueue.peek());
        System.out.println("Is queue empty? " + myQueue.isEmpty());
    }
}
