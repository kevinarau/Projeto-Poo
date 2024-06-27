package br.com.dio.Desafio;

public class Curso extends Conteudo {



private String CargaHoraria;


    @Override
    public double calcularXp() {
        return 0;
    }


    public String getCargaHoraria() {
        return CargaHoraria;
    }

    public void  setCarcaHoraria(int cargaHoraria) {
       int CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "Titulo='" + getTitulo() + '\'' +
                ", Descricao='" + getDescricao() + '\'' +
                ", CarcaHoraria=" + CargaHoraria +
                '}';
    }


}



