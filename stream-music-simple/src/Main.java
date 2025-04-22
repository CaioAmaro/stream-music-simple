import br.com.alura.model.Audio;
import br.com.alura.model.Musica;
import br.com.alura.model.Podcast;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Teste Audio \n");
		
		Audio audio = new Audio();
		
		audio.setTitulo("Teste");
		audio.setDuracao(180);
		audio.curtir();
		audio.reproduzir();
		
		audio.curtir();
		System.out.println(audio.toString());
		
		
		System.out.println("\nTeste Musica \n");
		
		Musica musica = new Musica();
		
		musica.setTitulo("Musica");
		musica.setDuracao(123);
		musica.curtir();
		musica.curtir();
		musica.curtir();
		musica.reproduzir();
		musica.reproduzir();
		System.out.println(musica.toString());
		
		System.out.println("\nTeste Podcast \n");
		
		Podcast podcast = new Podcast();
		
		podcast.setTitulo("Podcast");
		podcast.setDuracao(312);
		podcast.curtir();
		podcast.curtir();
		podcast.reproduzir();
		podcast.reproduzir();
		System.out.println(podcast.toString());
		
		
		
	}
}
