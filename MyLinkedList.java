/**
 * A simple LinkedList.
 */
public class MyLinkedList {

	private class Node {
		private String data;
		private Node next;
	}

	private Node head;

	public MyLinkedList() {
		this.head = null;
	}

	/**
	 * Adds the element as the first element of the list.
	 * You don't need to implement this fully, just have something that is a start
	 * using the appropriate structure.
	 */
	public void addFirst(String element) {
		// Make a new node, with the element, then adjust head.
		Node newHead = new Node();
		newHead.data = element;
		newHead.next = this.head;
		this.head = newHead;
	}

	/**
	 * Removes the first element of the list.
	 * You don't need to implement this fully, must have something that is a start
	 * using the appropriate structure.
	 */
	public void removeFirst() {
		// If the head isn't null, then adjust head to point at its next.
		if (this.head != null) {
			this.head = this.head.next;
		}
	}

}