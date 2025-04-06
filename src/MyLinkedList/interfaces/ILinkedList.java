package MyLinkedList.interfaces;

public interface ILinkedList<T> {

	void addHead(T data);
	void addTail(T data);
	boolean listEmpty();
	boolean haveNext();
	void printList();
	int sizeList();
	void clearList(T data);
	void removeHead();
	void removeTail();
	
}
