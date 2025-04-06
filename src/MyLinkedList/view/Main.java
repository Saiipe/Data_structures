package MyLinkedList.view;

import MyLinkedList.model.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> lL = new LinkedList<>();
			
		for(int i = 0; i < 10; i++) {
			lL.addTail(i);
		}
		
		lL.sizeList();
	}
	
	
	
}
