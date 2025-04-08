package MyDoubleLinkedList;

public class DoubleLinkedList<T> {

	private	Node<T> head;
	private Node<T> tail;
	private Node<T> current;
	private int cont = 0;
	
	public void addHead(T data) {
		Node<T> node = new Node<>();
		node.setDado(data);
		
		if(head == null && tail == null) {
			head = node;
			tail = node;
		}else {
			node.setNext(head);
			node.setPrevious(null);
			head.setPrevious(node);
			head = node;
		}
		cont++;
	}
	
	public void addTail(T data) {
		Node <T> node = new Node<>();
		node.setDado(data);
		
		if(head == null && tail == null) {
			head = node;
			tail = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
			node.setNext(null);
			tail = node;
		}
		cont++;
	}
	
	public void removeTail() {
		
		
	}
	
	public Node<T> getPenultimate(Node<T> node) {
		
		if(node.getNext().equals(tail)) {
			return node;
		}else {
			return getPenultimate(node.getNext());
		}
		
		
	}
	
}
