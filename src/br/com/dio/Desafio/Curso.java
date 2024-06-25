package br.com.dio.Desafio;

public class Curso {
   private String Titulo;
    private String Descricao;
    private int CarcaHoraria;


    public Curso() {
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getCarcaHoraria() {
        return CarcaHoraria;
    }

    public void setCarcaHoraria(int carcaHoraria) {
        CarcaHoraria = carcaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", CarcaHoraria=" + CarcaHoraria +
                '}';
    }
}
