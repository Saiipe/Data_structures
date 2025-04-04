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
	
	boolean listEmpty() {
		
		if(head == null && tail == null) {
			return true;
		}else {
			return false;
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
	
	void clearList(T data) {
		Node<T> current = head;
		
		while(current != null) {
			Node<T> next = current.getNext();
			current.setNext(null);
			current = next;
		}
		
		head = null;
		tail = null;
	}
	
	Node<T> penultimateNode(Node<T> node){
		
		if(node.getNext().equals(tail)) {
			return node;
		}else {
			return penultimateNode(node.getNext());
		}
		
	}
	
	void removeHead() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		head = head.getNext();
		if(head == null) {
			tail = null;
			current =null;
		}
		
	}
	
	void removeTail() {
		current = head;
		
		if(current.getNext() != null) {
			Node<T> node = penultimateNode(head);
			tail = node;
			tail.setNext(null);
		}else {
			System.out.println("The list is empty.");
			head = null;
			tail = null;
			current = null;
		}	
	}
	
	
}
