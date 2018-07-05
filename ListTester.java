public class ListTester {

	public static void main(String[] args) {
		SinglyLinkedList ssl = new SinglyLinkedList();
		ssl.add("hello World");
		ssl.add("i");
		ssl.add("like");
		ssl.add("Coding");
		ssl.add("Dojo");

		ssl.printValues();

		System.out.println();

		ssl.remove();
		ssl.add("& Waffles!");
		ssl.printValues();
	}

}
