package ArrayList;

public class Persona {

	private int id;
	private String nombre;
	private int edad;
	
	
	public Persona() {
		
	}


	public Persona(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}


	public int getId() {
		return id;
	}


	public void setId(int num) {
		this.id = num;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	//We are going to rewrite the to string method
	@Override
	public String toString() {
		return "Persona id: " + id + ", nombre: " + nombre + ", edad: " + edad + ".";
	}
}
