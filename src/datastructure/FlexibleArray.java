package datastructure;

/*
* This is a class that represent an extensible array
* An aaray has a fixed capacity, when ranching the end
* of the array, we have to expand it automaticaly*/
public class FlexibleArray<T> {
	private T[] elements;
	private static final int initial_capacity = 5;
	private int size = 0;
	private int expansion_facor = 40;

//the variable to sotore how many elemets we have added to the array
	public FlexibleArray() {
		elements = (T[]) new Object[initial_capacity];
	}

	public int size() {

		return elements.length;
	}

	public FlexibleArray(int size) {
		if (size <= 0) {

			size = initial_capacity;
		}
		elements = (T[]) new Object[size];
	}
	/*
	 * add an element to the array at its last position
	 * 
	 * @param e
	 */

	public void add(T element) {

		// paso 0: check if we have reached to the last position

		// if true, we have to expand the capacity of the array
		if (size == elements.length) {
			T[] newArray = (T[]) new Object[elements.length + expansion_facor];
			// copy the elements that from the old array to the new one
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = elements[i];
			}

			elements = newArray;
		}

		// paso 1: add the element to the last free position of the array
		elements[size] = element;
		size++;
	}

	/*
	 * remove an element to the array at its last position
	 * 
	 * @param i
	 */
	public void remove(int i) {
		elements[i] = null;
		for (int j = 0; j < 5; j++) {

		}
		size--;
	}
}