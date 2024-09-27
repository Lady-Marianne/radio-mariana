package com.aluracursos.radiomariana.principal;

import com.aluracursos.radiomariana.modelos.Cancion;
import com.aluracursos.radiomariana.modelos.MisFavoritos;
import com.aluracursos.radiomariana.modelos.Podcast;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion();
        cancion1.setTitulo("Shadowmaker");
        cancion1.setArtista("Lovebites");
        cancion1.setAlbum("Awakening From Abyss");
        cancion1.setGenero("Power Metal");

        Podcast podcast1 = new Podcast();
        podcast1.setPresentador("Francisco Gijón");
        podcast1.setTitulo("La Alta Noche");

        for (int i = 0; i < 5000 ; i++) {
            cancion1.reproducir();
        }
        for (int i = 0; i < 3400; i++) {
            cancion1.meGusta();
        }

        System.out.println("Canción: " + cancion1.getTitulo());
        System.out.println("Total de reproducciones: " + cancion1.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + cancion1.getTotalDeMeGusta());

        for (int i = 0; i < 3000 ; i++) {
            podcast1.reproducir();
        }
        for (int i = 0; i < 2500; i++) {
            podcast1.meGusta();
        }

        System.out.println("Podcast: " + podcast1.getTitulo());
        System.out.println("Total de reproducciones: " + podcast1.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + podcast1.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicionar(cancion1);
        favoritos.adicionar(podcast1);
    }
}