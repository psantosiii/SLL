public class SinglyLinkedList {

	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void add(Object value) { //object to add int or strings

		Node next = new Node(value);
		Node runner = head;

		if (head == null) {
			head = next;
		} else {
			while (runner.next != null) {
				runner = runner.next;
			}

			runner.setNext(next);
		}
	}

	public void remove() {

		Node runner = head;

		while (runner.next != null) {

			if (runner.next.next == null) {
				runner.setNext(null);
			} else {
				runner = runner.next;

			}
		}
	}

	public void printValues() {
		Node runner = head;

		while (runner.next != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
		System.out.println(runner.value);
	}

}
