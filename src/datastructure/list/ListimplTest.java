package datastructure.list;

public class ListimplTest {
	public static void main(String[] args) throws Exception {
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1);
		System.out.println(obj2);
		Listimpl<Integer> list = new Listimpl<Integer>();
		System.out.println("The fist node of teh list is:" + list.getFirst());
		System.out.println("The last node of teh list is:" + list.getLast());

		list.add(new Node(10));
		list.add(new Node(20));
		list.add(new Node(40));
		list.add(new Node(50));
		list.add(new Node(30));
		list.printList();
		list.remove();
	}
}
