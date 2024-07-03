package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String apresentador, descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //classifica o Podcast pelas curtidas, 10 para excelente, 8 para bom
    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
