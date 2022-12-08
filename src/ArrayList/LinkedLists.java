package ArrayList;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

	public static void main(String[] args) {
		
		
		List<Persona> lista = new LinkedList<Persona>(); 
		
		//Add persons to the list final
		Persona persona1 = new Persona(55, "Agapito", 56);
		lista.add(persona1);
		lista.add(new Persona(35, "Antonio", 28));
		lista.add(new Persona(53, "Nelsin", 27));
		lista.add(new Persona(44, "Carlos", 29));
		
		//Also in the LinkedList we can add element in the beginning of the list, they have not a determinated index
		lista.add(0, new Persona(1, "Add the first", 1)); // The only thing we have to do is add a new paremeter, the 0 to add as first element
		
		
		//Foreach, we use foreach to run the LinkedList because this does not have a index well determinated like in the case of ArrayList
		for(Persona person:lista) {
			System.out.println("LinkedList probe: " + person.getNombre());
		}
	}

}
