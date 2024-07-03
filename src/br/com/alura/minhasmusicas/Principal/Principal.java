package br.com.alura.minhasmusicas.Principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        //obj da classe Musica instanciado
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        //incrementa as reproduções da musica 1000 vezes
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        //incrementa as curtidas da musica 50 vezes
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        //obj da classe Podcast instanciado
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        //incrementa as reproduções da musica 5000 vezes
        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        //incrementa as curtidas do podcast 1000 vezes
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        /*
        * utiliza conceitos de encapsulamento + sobrescritas nas
        * classes Musica e Podcast + returns na classe
        * MinhasPreferidas
        */

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}
