package Code0.view;

import Code0.model.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> lL = new LinkedList<>();
			
		for(int i = 0; i < 10; i++) {
			lL.addTail(i);
		}
		
		lL.sizeList();
	}
	
	
	
}
