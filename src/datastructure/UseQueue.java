package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */

		Queue<String> queue = new LinkedList<>();
		queue.add("Sayed");
		queue.add("Taseen");
		queue.add("Khan");

		System.out.println("Peek: " + queue.peek());

		System.out.println("Remove: " + queue.remove());

		System.out.println("Poll: " + queue.poll());

		System.out.println("Elements in queue: ");
		for (String name : queue) {
			System.out.println(name);
		}

		System.out.println("Elements in queue using Iterator: ");
		for (String s : queue) {
			System.out.println(s);
		}
	}
}
