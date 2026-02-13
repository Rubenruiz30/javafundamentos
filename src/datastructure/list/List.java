package datastructure.list;

public class List<E> {

//	The refernces to the last element in the list

	private Node<E> last;
//	 The refences o the first element of ther list

	private Node<E> first;

	public void add(Node<E> node) throws Exception {
// 1	check the parameter if it valid
		if (node == null) {
			throw new Exception("you cannot pass anull node to the list");
		}
//	2	 add the node to the tail of the list	
//	2.1	Check first if the head element is null
//		is the case of null, it means the list is empty
		if (first == null) {
//			The list is empty
			last = node;
			first = node;
			first.next = node;
		}
		else {
			last.next = node;
			last = node;

		}
		
	}

	public Node<E> getLast() {
		return last;
	}

	public Node<E> getFirst() {
		return first;
	}

}

class Node<E> {
	public Node(E e) {
		// TODO Auto-generated constructor stub
		data = e;
	}

	// The data stored in a mode of the list
	private E data;
///each node needsto point to the next node, we use this variable to do it
	protected Node next;
}