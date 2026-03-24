package datastructure;

import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

import oopmodeling.Planet;

public class BuiltinDataStructure {

	public static void main(String[] args) {
		// create two objects of class {@link Planet}
		Planet planet1 = new Planet();
		Planet planet2 = new Planet(123, "Mars");

		// create an object of array with a fixed size of
		Planet[] pls = new Planet[2];

		pls[0] = planet1;
		pls[1] = planet2;
// create an object of array with fixed size of 5
		ArrayList<Planet> planets = new ArrayList<>();
// add an object to position 0
		planets.add(planet1);
// add an object to position 0
		planets.add(planet2);
// retrieve the value of position 
		planets.get(1);
// create an objtect of class 
		LinkedList<String> names = new LinkedList<String>();
		names.add("Pablo");
		names.add("Justo");
		names.get(1);
// less efficient then accessing elements in Array when using index
// last in fisrt out

		Stack<Integer> callstack = new Stack<>();
// add an element on the top of the stack object
		callstack.push(34);
		callstack.push(10);
// peek method is used to read the element on the top of the stack
		System.out.println(callstack.peek());
// remove the element from the top of the stack 
		System.out.println(callstack.pop());
		System.out.println(callstack.peek());
		Queue <Integer>queue = new ConcurrentLinkedQueue<>();
		queue.add(123);
		queue.add(12);
		queue.add(12300);
		System.out.println(queue.poll());
		
	}
}
