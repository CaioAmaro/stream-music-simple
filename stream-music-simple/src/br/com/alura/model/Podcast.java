package br.com.alura.model;

public class Podcast extends Audio{
	private String apresentador;
	private String descricao;

	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}

	public String getApresentador() {
		return apresentador;
	}

	@Override
	public int getClassificacao() {
		if(this.getCurtida() > 500){
			return 10;
		}else{
			return 8;
		}
	}

	@Override
	public String toString() {
		return "Tipo: Podcast \n" +
				"Titulo: " + super.getTitulo() + "\n" +
				"Host: " + getApresentador() + "\n" +
				"Total de curtidas: " + super.getCurtida() + "\n" +
				"Total de Reproduções: " + super.getTotalReproducoes() + "\n";
	}
}
