package listaCircular;

public class CircleList {
	protected Node cursor;
	protected int size;

	public CircleList() {
		cursor = null;
		size = 0;
	}

	public void add(Node newNode) {
		if (cursor == null) {
			newNode.setNext(newNode);
			cursor = newNode;
		} else {
			newNode.setNext(cursor.getNext());
			cursor.setNext(newNode);			
		}
		advance();
		size++;
	}
	
	public Node remove() {
		Node oldNode = cursor;
		if (size == 1) {
			cursor = null;
		}
		else {		
			//indo até o anterior do cursor			
			for (int i = 0; i<size-1;i++) {
				advance();
			}
			cursor.setNext(oldNode.getNext()); 
			oldNode.setNext(null);
		}
		size--;
		return oldNode;
	}

	public void advance() {
		cursor = cursor.getNext();
	}

	public Node getCursor() {
		return cursor;
	}

	public int size() {
		return size;
	}

	public String toString() {
		if (cursor == null)
			return "[ ]";		
		advance();
		String s = "[..." + cursor.getElement();
		Node oldCursor = cursor;
		for (advance(); oldCursor != cursor; advance())
			s += ", " + cursor.getElement();
		return s + "...]";
	}

}
