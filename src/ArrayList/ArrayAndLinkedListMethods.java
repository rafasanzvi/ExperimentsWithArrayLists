package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndLinkedListMethods {

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
		
		
		//Remove in ArrayList
		listaArray.remove(1); // If we know the index
		
		//Remove in LinkedList
		String nameToRemove = "Valentina";
		for(Persona personaRemove:listaLinked) {
			if(personaRemove.getNombre().equals(nameToRemove)) {
				listaLinked.remove(personaRemove);
				break; //Stop running, because the list is now broken and it needs to be reorganized
			}
		}
		
		//AFTER REMOVING
		//Running through foreach
		System.out.println("----------ARRAYLIST-----------");
		for(Persona persArrayList:listaArray) {
			System.out.println("From ArrayList: " + persArrayList.getNombre());
		}
		System.out.println("----------LINKEDLIST-----------");
		for(Persona persLinked:listaLinked) {
			System.out.println("From LinkedList: " + persLinked.getNombre());
		}

	}

}
