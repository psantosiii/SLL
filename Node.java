public class Node {

	Object value;
	Node next;

	public Node(Object value) {
		this(value, null);
	}
	
	public Node(Object value, Node next) {
		this.value = value;
		this.next = next;
	}
	//getter
	public Object getValue() {
		return this.value;
	}
	//setter
	public void setValue(Object value) {
		this.value = value;
	}
	//getter
	public Node getNext() {
		return this.next;
	}
	//setter
	public void setNext(Node next) {
		this.next = next;
	}
}
