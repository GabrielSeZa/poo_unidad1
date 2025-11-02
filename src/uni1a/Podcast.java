package uni1a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Podcast extends ContenidoAudiovisual {
	
	private String plataforma;
	private List<String> episodios;
	
	public Podcast(String titulo, int duracionEnMinutos, String genero, String plataforma) {
		super(titulo, duracionEnMinutos, genero);
		this.plataforma = plataforma;
		this.episodios = new ArrayList<>();
		
	}
	
	public String getPlataforma( ) {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public void agregarEpisodio(String nombreEpisodio) {
		if (nombreEpisodio != null && !nombreEpisodio.isEmpty()) {
			episodios.add(nombreEpisodio);
		}
	}
	
	public List<String> getEpisodios() {
		return Collections.unmodifiableList(episodios);
	}

	@Override
	public void mostrarDetalles() {
		// TODO Auto-generated method stub
		System.out.println("Detalles del Podcast:");
		System.out.println("ID:" + getId());
		System.out.println("Titulo:" + getTitulo());
		System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
		System.out.println("Genero: " + getGenero());
		System.out.println("Plataforma " + plataforma);
		System.out.println("Cantidad de episodios: " + episodios.size());
		System.out.println("Listado de episodios: " + episodios);
		System.out.println();

	}

}
