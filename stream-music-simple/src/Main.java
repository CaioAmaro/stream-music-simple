import br.com.alura.model.Audio;
import br.com.alura.model.MinhaPreferidas;
import br.com.alura.model.Musica;
import br.com.alura.model.Podcast;

public class Main {
	public static void main(String[] args) {
		
		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("Forever");
		minhaMusica.setArtista("Kiss");

		for(int i = 0; i < 2000; i++){
			minhaMusica.reproduzir();
		}

		for(int i = 0; i < 50; i++){
			minhaMusica.curtir();
		}

		System.out.println(minhaMusica.toString());

		Podcast meupodcast = new Podcast();
		meupodcast.setTitulo("BolhaDev");
		meupodcast.setApresentador("Marcos mendes");

		for(int i = 0; i < 5000; i++){
			meupodcast.reproduzir();
		}

		for(int i = 0; i < 1000 ; i++){
			meupodcast.curtir();
		}

		System.out.println();

		System.out.println(meupodcast.toString());

		MinhaPreferidas minhaPreferidas = new MinhaPreferidas();

		minhaPreferidas.inclui(minhaMusica);
		minhaPreferidas.inclui(meupodcast);

	}
}
