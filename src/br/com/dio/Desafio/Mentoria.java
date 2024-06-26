package br.com.dio.Desafio;

import java.time.LocalDate;

class Mentoria extends Conteudo {


    private LocalDate Data;

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


    public LocalDate getData() {
        return Data;
    }

    public void setData(LocalDate data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "Titulo='" + Titulo + '\'' +
                ", Descricao='" + Descricao + '\'' +
                ", Data=" + Data +
                '}';
    }

}



