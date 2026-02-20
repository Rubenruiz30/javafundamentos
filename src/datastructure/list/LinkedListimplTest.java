package datastructure.list;

public class LinkedListimplTest {
	public static void main(String[] args) throws Exception {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1);
		System.out.println(obj2);
		LinkedListimpl<Integer> list = new LinkedListimpl<Integer>();
		System.out.println("The fist node of teh list is:" + list.getFirst());
		System.out.println("The last node of teh list is:" + list.getLast());

		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		list.add(30);
		list.printList();
		list.remove();
	}
}
