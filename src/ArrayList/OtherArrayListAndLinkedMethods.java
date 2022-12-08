package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OtherArrayListAndLinkedMethods {

	public static void main(String[] args) {
		
		
				//List done with ArrayList
				List<Persona> listaArray = new ArrayList<Persona>();
				listaArray.add(new Persona(1, "Rafael", 31));
				listaArray.add(new Persona(2, "Manuel", 16));
				listaArray.add(new Persona(3, "Jose", 34));
				listaArray.add(new Persona(4, "Pepe", 25));
				
				//List done with LinkedList
				LinkedList<Persona> listaLinked = new LinkedList<Persona>();
				listaLinked.add(new Persona(5, "María", 23));
				listaLinked.add(new Persona(6, "Valentina", 33));
				listaLinked.add(new Persona(7, "Amalia", 37));
				listaLinked.add(new Persona(8, "Antonia", 16));
				
				//List size .size()
				System.out.println("--------------What size has the list??----------");
				System.out.println("Size of ArrayList: " + listaArray.size());
				System.out.println("Size of LinkedList: " + listaLinked.size());
				
				//To get first and last object(ONLY TO LINKEDLIST) .getFirst() and .getLast()
				System.out.println("--------------First and last object----------");
				System.out.println("First object: " + listaLinked.getFirst().toString());
				System.out.println("Last object: " + listaLinked.getLast().toString());
				
				//To delete the whole list .clear()
				System.out.println("--------------Deleting Lists---------------");
				listaArray.clear();
				listaLinked.clear();
				
				//Check if the list is empty
				System.out.println("------------Some list is empty??---------------");
				System.out.println("ArrayList: " + listaArray.isEmpty());
				System.out.println("LinkedList: " + listaLinked.isEmpty());
				
				
				
				
				
				
				

	}

}
