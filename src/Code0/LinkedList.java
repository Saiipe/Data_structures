package Code0;

public class LinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private Node<T> current;
	
	Node<T> getCurrent(){
		return current;
	}
	
	void addHead(T data) {
		Node<T> node = new Node<>();
		node.setData(data);
		if(head == null && tail == null) {
			head = node;
			tail = node;
		}else {
			node.setNext(head);
			head = node;
		}
	}
	
	void addTail(T data) {
		Node<T> node = new Node<>();
		node.setData(data);
	
		if(head == null && tail == null) {
			head = node;
			tail = node;
		}else {
			tail.setNext(node);
			tail = node;
			tail.setNext(null);
		}
		
	}
	
	boolean haveNext() {
		
		if(head == null) {
			return false;
		}else if(current == null) {
			current = head;
			return true;
		}else {
			boolean haveNext = current.getNext() != null ? true : false;
			current = current.getNext();
			return haveNext;
		}
		
	}
	void printList() {
		current = head;
		
		System.out.println("START LIST");
		while(current != null) {
			// For type object create toString method in your class.
			System.out.println(current.getData());
			current = current.getNext();
			
		}
		System.out.println("END LIST");
	}
	
	int sizeList() {
		current = head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.getNext();
			
		}
		return count;
	}
	
}
