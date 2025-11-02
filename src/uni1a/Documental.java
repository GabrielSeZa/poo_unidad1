/**
 * Class Documental
 */
package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Subclase Documental que extiende de ContenidoAudiovisual
public class Documental extends ContenidoAudiovisual {
    private String tema;
    
    private List<Investigador> investigadores = new ArrayList<>();

    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }
    

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    public void agregarInvestigador(Investigador i) {
    	if (i != null && !investigadores.contains(i)) {
    		investigadores.add(i);
    			
    	}
    }
    
    public void quitarInvestigador(Investigador i) {
    	investigadores.remove(i);
    }
    
    public List<Investigador> getInvestigadores() {
    	return Collections.unmodifiableList(investigadores);
    	
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores:" + investigadores); 
        System.out.println();
    }
}