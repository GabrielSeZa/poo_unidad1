/**
 * Class Pelicula
 */
package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private List<Actor> elenco = new ArrayList<>();

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }
    
    public void setEstudio(String estudio) {
    	this.estudio = estudio;
    	
    }
    
    public void agregarActor(Actor actor) {
    	if (actor != null && !elenco.contains(actor)) {
    		elenco.add(actor);
    	}
    }
    
    public List<Actor> getElenco() {
    	return Collections.unmodifiableList(elenco);
    	
    }
    

   
    
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Elenco:" + elenco); 
        System.out.println();
    }
}