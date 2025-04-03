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
			current = node;
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
			current = node;
		}else {
			tail.setNext(node);
			tail = node;
			tail.setNext(null);
		}
		
	}
	
	
	
}
