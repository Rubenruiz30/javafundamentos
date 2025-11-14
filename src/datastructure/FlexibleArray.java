package datastructure;
/*
* This is a class that represent an extensible array
* An aaray has a fixed capacity, when ranching the end
* of the array, we have to expand it automaticaly*/
public class FlexibleArray <T> {
    private T[] elements;
    private static final int initial_capacity = 5;
//the variable to sotore how many elemets we have added to the array
    public FlexibleArray() {
        elements = (T[]) new Object[initial_capacity];
    }

    public FlexibleArray(int size) {
        elements = (T[]) new Object[size];
    }
    /*
     * add an element to the array at its last position
     * @param e
     * */

    public void add(T i){
       //paso 0: check if we have reached to the last position

        // if true, we have to expand the capacity of the array

        // paso 1: add the element to the last free position of the array
        for (int j = 0; j < elements.length; j++) {
            if (elements[j] == null) {
                elements[j] = i;
                return;
            }
        }

        }
        /*
         * remove an element to the array at its last position
         * @param i
         * */
        public void remove ( int i){

        }
        public int size(){


            return elements.length;
        }
    }

