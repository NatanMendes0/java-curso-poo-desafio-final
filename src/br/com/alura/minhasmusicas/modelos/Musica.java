package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album, cantor, genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //classifica a música a partir das reproduções.
    //músicas acima de 2000 reproduções são excelentes (nota 10), abaixo disso, são boas (nota 7).
    @Override
    public int getClassificacao() {
        if(this.getTotalReproducoes() > 2000){
            return 10;
        } else {
            return 7;
        }
    }
}
