package br.com.dio.Desafio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("java");
        curso.setDescricao("bootcamp");
        curso.setCarcaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("bootcamp js");
        curso2.setCarcaHoraria(10);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("java ");
        mentoria1.setDescricao("java projeto");
        mentoria1.setData(LocalDate.now());





    }

}
