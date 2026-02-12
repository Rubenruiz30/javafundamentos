package datastructure.list;

public class List <E>{
	
	public class Mode  {
//		The data stored in a mode of the list
		private E e;
///each node needsto point to the next node, we use this variable to do it
		private Mode  next;
		}

//	The refernces to the last element in the list
	
	private Mode last;
//	 The refences o the first element of ther list
	
	private Mode first;

	public void add(Mode node) {
// 1	
		last.next = node;
	}
}
