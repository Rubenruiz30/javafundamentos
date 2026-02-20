package datastructure.list;

/**
 * interface oriented development: we use interfaces to
 * abstract different solution
 * In a interface, you can declare method, but without
 * implementation, in other words, without method body,
 *  or only with method signature(firm). As each method
 *  could have multiples different implementation in different
 *  class
 *@author david
 *@author Rubén
 *20 feb 2026
 *@param <E>
 */
public class LinkedListimpl<E> implements List <E> {

	private static final char[] List = null;
	private static int length;
//	The references to the last element in the list

	private Node<E> last;
//	 The references o the first element of there list

	private Node<E> first;

	public void add(E e)  {
// 1	check the parameter if it valid
		if (e == null) {
			try {
				throw new Exception("you cannot pass anull node to the list");

			} catch (Exception e2) {
				
				// TODO: handle exception
			}
		}
		Node<E> node = new Node <E>(e);
//	2	 add the node to the tail of the list	
//	2.1	Check first if the head element is null
//		is the case of null, it means the list is empty
		if (first == null) {
//			The list is empty
			last = node;
			first = node;
			first.next = node;
		} else {
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
	public Node<E> remove(){
		
		last.data = (E) remove();
		
		return first;
		
	}
	

	public void printList() {

		Node<E> nodo = first;

		while (nodo != null) {
			System.out.println(nodo.data);
			nodo = nodo.next;
		}

	}

	
	@Override
	public void remove(Object e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addHead(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTail(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeHead(E e) {
		// TODO Auto-generated method stub
		
	}
}

class Node<E> {
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(E e) {
		// TODO Auto-generated constructor stub
		data = e;
	}

	// The data stored in a mode of the list
	public E data;
///each node needsto point to the next node, we use this variable to do it
	protected Node next;
}
