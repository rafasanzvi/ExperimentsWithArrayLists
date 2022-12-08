package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEjecutable {

	public static void main(String[] args) {
		
		//Now, we are going to create an arrayList with persona object, working with the class Persona create before
		
		List<Persona> lista = new ArrayList<Persona> ();  // Of this way we have created the ArrayList lista with Persona class
		
		// Persona persona1 = new Persona(12, "Rafael", 31); // We could make the first persona like this, but the way under save a line of code
		
		lista.add(new Persona(12, "Rafael", 31)); //We have added the first persona in the same code line
		lista.add(new Persona(1, "Rafael David", 0));
		lista.add(new Persona(13, "Nazaret", 24));
		lista.add(new Persona(15, "Popino", 14));
		
		//To run the array we can use for or foreach 
		
		//Run for index
		for (int i = 0; i < lista.size(); i++) { //We should use size instead length with ArrayList
			System.out.println("Nombres: " + lista.get(i).getNombre()); // We use .get(i) instead [i]
			System.out.println("--------");
			System.out.println("Edad: " + lista.get(i).getEdad());
			System.out.println("--------");
			System.out.println("ID: " + lista.get(i).getId());
			System.out.println("--------");
		}
		
		//Run for elements using foreach
		for (Persona perso:lista ) {
			System.out.println("Prueba foreach: " + perso.getNombre());
		}
	}

}
