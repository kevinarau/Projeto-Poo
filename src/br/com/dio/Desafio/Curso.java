package br.com.dio.Desafio;

import java.time.LocalDate;

public class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return 0;
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



