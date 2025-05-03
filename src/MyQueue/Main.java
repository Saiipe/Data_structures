package MyQueue;

public class Main {
    public static void main(String[] args) {

        MyQueue<String> queue = new MyQueue<>();
        queue.createQueue(5);

        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Current queue size: " + queue.getSize());

        System.out.println("\nAdding elements...");
        queue.addQueue("João");
        queue.addQueue("Maria");
        queue.addQueue("Ana");

        System.out.println("\nCurrent size: " + queue.getSize());
        System.out.println("First in queue: " + queue.getHead());

        System.out.println("\nQueue elements:");
        queue.showQueue();

        System.out.println("\nRemoving one element...");
        queue.removeQueue();

        System.out.println("\nQueue after removal:");
        queue.showQueue();

        System.out.println("\nFinal queue size: " + queue.getSize());
    }
}
