package MyDoubleLinkedList;

public class Node<T> {

	private Node<T> Next;
	private Node<T> previous;
	private T dado;
	
	public Node<T> getNext() {
		return Next;
	}
	public void setNext(Node<T> next) {
		Next = next;
	}
	public Node<T> getPrevious() {
		return previous;
	}
	public void setPrevious(Node<T> previous) {
		this.previous = previous;
	}
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
		
}
