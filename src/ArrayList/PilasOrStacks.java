package ArrayList;

import java.util.Stack;

public class PilasOrStacks {

	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<Integer>();
		
		 System.out.println("Pila vacía: " + pila);
		 System.out.println("Está vacía? " + pila.isEmpty());
		 
		 //Add elements
		 pila.push(1);
		 pila.push(2);
		 pila.push(3);
		 pila.push(4);
		 pila.push(5);
		 
		 //To run the stack
		 for(Integer pilaElement : pila) {
			 System.out.println("This are the elements: " + pilaElement);
		 }
		 
		 //Show
		 System.out.println("Pila: " + pila);
		 System.out.println("Is pila empty??: " + pila.isEmpty());

		 //To delete the last element that we have added .pop()
		 pila.pop();
		 System.out.println("Pila: " + pila);
		 
		 // To search some element particulary .search()
		 System.out.println("Is the number 3??: " + pila.search(3)); //If the number is found return a positive number, the index, if it is not found return a -1
		 //The search method is not working exactly with objects
		 System.out.println("The last element added: " + pila.peek()); // The last element added without remove it
		 
		 
		 
		 
		 
		 
	}

}
