package br.com.dio.Desafio;

public class Curso extends Conteudo {



private int CargaHoraria = 8;


    @Override
    public double calcularXp() {
        return XP_PADRAO + CargaHoraria;
    }


    public int getCargaHoraria() {
        return CargaHoraria ;
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



