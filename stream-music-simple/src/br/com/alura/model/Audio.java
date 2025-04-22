package br.com.alura.model;

public class Audio {
	private String titulo;
	private int duracao;
	private int totalReproducoes;
	private int curtida;
	private int classificacao;
	
	public void curtir() {
		System.out.println("Você curtiu " + titulo);
		this.curtida++;
	}
	
	public void reproduzir() {
		System.out.println("Você reproduziu " + titulo);
		this.totalReproducoes++;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getTotalReproducoes() {
		return totalReproducoes;
	}

	public int getCurtida() {
		return curtida;
	}

	@Override
	public String toString() {
		return "Audio [titulo=" + titulo + ", duracao=" + duracao + ", totalReproducoes=" + totalReproducoes
				+ ", curtida=" + curtida + ", classificacao=" + classificacao + "]";
	}
	
	
	
}
