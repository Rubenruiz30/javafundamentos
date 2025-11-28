package datastructure;

public class FlexibleArray<T> {

    private T[] elements;
    private static final int initial_capacity = 5;
    private int size = 0;   
    private int expansion_factor = 40;

    public FlexibleArray() {
        elements = (T[]) new Object[initial_capacity];
    }

    public FlexibleArray(int capacity) {
        if (capacity <= 0) capacity = initial_capacity;
        elements = (T[]) new Object[capacity];
    }

    // Devuelve cuántos elementos reales hay
    public int size() {
        return size;
    }
    // Devuelve cuántos elementos reales hay
    public T[] ksdjfldsjkf() {
        return elements;
    }

    // Devuelve 1 elemento por índice
    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);
        return elements[index];
    }

    // Añade un elemento
    public void add(T element) {
        if (size == elements.length) {
            expandArray();
        }
        elements[size] = element;
        size++;
    }

    // Expande el array cuando está lleno
    private void expandArray() {
        T[] newArray = (T[]) new Object[elements.length + expansion_factor];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    // Elimina un elemento por índice
    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index);

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;
    }
}
