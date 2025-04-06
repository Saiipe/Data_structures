package MyDoubleLinkedList;

public class DoubleLinkedList<T> {

	private	Node<T> head;
	private Node<T> tail;
	private Node<T> current;
	private int Cont = 0;
	
	public void addHead(T data) {
		Node<T> node = new Node<>();
		node.setDado(data);
		
		if(head == null && tail == null) {
			head = node;
			tail = node;
		}else {
			node.setNext(head);
			head.setPrevious(node);
			head = node;
		}
		
		
	}
	
	
	
}
