package uni1a;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Subclase TransmisionEnVivo que hereda de ContenidoAudiovisual/
 * Representa una emision en vivo como conciertos, conferencias o eventos deportivos
 */

public class TransmisionEnVivo extends ContenidoAudiovisual {
	
	private String plataforma;
	private LocalDateTime fechaHora;
	private boolean interaccionActiva;
	private List<String> participantes;
	
	public TransmisionEnVivo(String titulo, int duracionEnMinutos, String genero,
			String plataforma, LocalDateTime fechaHora, boolean interaccionActiva) {
		
		super (titulo, duracionEnMinutos, genero);
		this.plataforma = plataforma;
		this.fechaHora = fechaHora;
		this.interaccionActiva = interaccionActiva;
		this.participantes = new ArrayList<>();
		
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public boolean isInteraccionActiva() {
		return interaccionActiva;
	}
	public void setInteraccionActiva(boolean interaccionActiva) {
		this.interaccionActiva = interaccionActiva;
	}
	
	public List<String> getParticipantes() {
		return Collections.unmodifiableList(participantes);
		
	}
	
	public void agregarParticipante(String nombre) {
		if (nombre != null && !nombre.isEmpty() && !participantes.contains(nombre)) {
			participantes.add(nombre);
			
		}
	}
	
	public void quitarParticipantes(String nombre) {
		participantes.remove(nombre);
	}

	@Override
	public void mostrarDetalles() {
		// TODO Auto-generated method stub
		
		System.out.println("Detalles de la Transmision en Vivo:");
		System.out.println("ID: " + getId());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Duracion estimada: " + getDuracionEnMinutos() + "minutos");
		System.out.println(" Genero: " + getGenero());
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Fecha y hora: " + fechaHora);
		System.out.println("Interaccion activa: " + (interaccionActiva ? "Si" : "No"));
		System.out.println("Participantes: " + participantes);
		System.out.println();

	}

}
