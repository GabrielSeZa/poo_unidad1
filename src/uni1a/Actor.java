package uni1a;

import java.util.Objects; 

public class Actor {
	private String nombre;
	
	public Actor(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override 
	public String toString() {
		return nombre;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Actor)) return false;
		Actor a = (Actor) o;
		return Objects.equals(nombre, a.nombre);
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

}
