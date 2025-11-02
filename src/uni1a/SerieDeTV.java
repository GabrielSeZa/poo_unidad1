/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    
    private List<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public void agregarTemporada(Temporada t) {
    	if (t != null) listaTemporadas.add(t);
    }
    
    public void quitarTemporada(Temporada t) {
    	listaTemporadas.remove(t);
    }
    
    public List<Temporada> getListaTemporadas() {
    	return Collections.unmodifiableList(listaTemporadas);
    }
    
    public int getTotalEpisodios() {
    	return listaTemporadas.stream().mapToInt(Temporada::getCantidadEpisodios).sum();
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Temporadas registradas:" + listaTemporadas.size());
        System.out.println("Listado:" + listaTemporadas);
        System.out.println("Total de episodios:" + getTotalEpisodios());
        System.out.println();
    }
}