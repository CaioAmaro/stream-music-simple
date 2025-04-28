package br.com.alura.model;

public class MinhaPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos! " + audio.getClassificacao());
        }else{
            System.out.println(audio.getTitulo() + " também é um dos que todo mundo está curtindo " + audio.getClassificacao());
        }
    }
}
