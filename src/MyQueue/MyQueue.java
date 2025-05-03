package MyQueue;

public class MyQueue<T>{

	private T[] queue;
	private int head, tail, size;
	
	@SuppressWarnings("unchecked")
	public void createQueue(int capacity) {
		queue = (T[]) new Object[capacity];
		head = 0;
		tail = -1;
		size = 0;
		System.out.println("The Capacity the your queue is: " + capacity);
		
	}
	
	public int getSize() {
		return size;
	}
	
	public T getHead() {
		return queue[head];
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void addQueue(T object) {
		if(size < queue.length) {
			tail = (tail+1) % queue.length;

			queue[tail] = object;
			size++;
			
		}else {
			System.out.println("Queue is FULL");
		}
		
		
	}
	public void removeQueue() {
		
		if(!isEmpty()) {
			queue[head] = null;
			head = (head+1) % queue.length;
			size--;
		}else {
			System.out.println("Queue is Empty");
		}
	}
	
	public void showQueue() {
		if(!isEmpty()) {
			System.out.print("Fila: ");
			for(int i = 0; i < size; i++) {
				int index = (head+i) % queue.length;
				System.out.print(queue[index] + " ");
			}
		}else {
			System.out.println("The queue is Empty");
		}
		System.out.println();
	}
	
	
	
	
}
