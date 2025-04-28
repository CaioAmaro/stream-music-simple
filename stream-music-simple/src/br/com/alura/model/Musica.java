package br.com.alura.model;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;

    public void setArtista(String artista){
        this.artista = artista;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        }else{
            return 8;
        }
    }

    @Override
    public String toString() {
        return "Tipo: Musica \n" +
               "Titulo: " + super.getTitulo() + "\n" +
               "Artista: " + getArtista() + "\n" +
               "Total de curtidas: " + super.getCurtida() + "\n" +
               "Total de Reproduções: " + super.getTotalReproducoes() + "\n";
    }
}
