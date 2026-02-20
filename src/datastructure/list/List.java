package datastructure.list;

public interface List <E> {
//	This method is used to adding nodes to the list
	public void add (E e);
//	This method is used to remove nodes for the list
	public void remove (E e);
//	This method is used to adding nodes in the Head of the List
	public void addHead(E e);
//	This method is used to remove nodes from the tail
	public void removeTail (E e);
//	This method is used to remove nodes from the head
	public void removeHead(E e);

}
