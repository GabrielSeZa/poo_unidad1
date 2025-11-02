package poo;
import uni1a.*;
import java.time.LocalDateTime;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy");
        contenidos[3] = new Podcast("Ingenieria &  cafe", 42, "tecnologia", "Spotify");
        contenidos[4] = new TransmisionEnVivo("DevTalk Live Quito", 90, "Conferencia", "Twitch",
        		LocalDateTime.of(2025, 11, 3, 19, 0), true);
        // Relacion pelicula-Actor
        
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Sam Worthington"));
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Zoe Saldaña"));

        // Relacion SerieDeTV-Temporada
        
        ((SerieDeTV) contenidos[1]).agregarTemporada(new Temporada(1, 10, 2011));
        ((SerieDeTV) contenidos[1]).agregarTemporada(new Temporada(2, 10, 2013));
        
        // Relacion Documental-Investigaddor
        
        ((Documental) contenidos[2]).agregarInvestigador(
        	new Investigador("David Attenborough", "BBC Earth", "Astrofisica")	
        	);
        ((Documental) contenidos[2]).agregarInvestigador(
        	new Investigador("Jane Goodall", "Instituto Jane Goodall", "Primatologia"));
        
        //Relacion Podcast - Episodios
        
        ((Podcast) contenidos[3]).agregarEpisodio("EP01: Introduccion a la Ingenieria de Software");
        ((Podcast) contenidos[3]).agregarEpisodio("EP02: Patrones de diseño en la practica");
        
        // Relacion TransmisionEnVivo - Participantes 
        
        ((TransmisionEnVivo) contenidos[4]).agregarParticipante("Andres Morales");
        ((TransmisionEnVivo) contenidos[4]).agregarParticipante("Sofia Herrera");
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}