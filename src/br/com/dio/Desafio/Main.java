package br.com.dio.Desafio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("java");
        curso.setDescricao("bootcamp");
        curso.setCarcaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("js");
        curso2.setDescricao("bootcamp js");
        curso2.setCarcaHoraria(20);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("java ");
        mentoria1.setDescricao("java projeto");
        mentoria1.setData(LocalDate.now());


       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp java Developer");
       bootcamp.setDescricao("Descricao Bootcamp java Developer");
       bootcamp.getConteudos().add(curso);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria1);

       Dev devKevin = new Dev();
       devKevin.setNome("kevin araujo");
       devKevin.IncreverBootcamp(bootcamp);
       System.out.println("conteudos inscritos kevin: " + devKevin.getConteudoInscritos());
       devKevin.progredir();
       devKevin.progredir();
       devKevin.progredir();

        System.out.println("-");
        System.out.println("conteudos inscritos kevin: " + devKevin.getConteudoInscritos());
        System.out.println("conteudos Concluidos kevin: " + devKevin.getConteudosConcluidos());
        System.out.println("XP: " + devKevin.calcularXpTotal());

        System.out.println("----------");



       Dev devCamila = new Dev();
       devCamila.setNome("Camila");
       devCamila.IncreverBootcamp(bootcamp);
       System.out.println("conteudos inscritos Camila: " + devCamila.getConteudoInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos Camila" + devCamila.getConteudoInscritos());
       System.out.println("conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP :" + devCamila.calcularXpTotal());
    }

}
