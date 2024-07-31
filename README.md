


# Sistema de Gerenciamento de Cursos - Bootcamp POO!👀😎✌












### °Descrição


Este projeto foi desenvolvido como parte de um bootcamp de Programação Orientada a Objetos (POO) em Java. O sistema permite que alunos se inscrevam em cursos, acessem conteúdos diversos, como cursos e mentorias, e acompanhem seu progresso até a conclusão dos cursos.


Estrutura do Projeto
Classes Principais


### 1° Bootcamp

 
 
 

º Representa um bootcamp com um conjunto de conteúdos e desenvolvedores inscritos.

º Atributos: nome, descricao, dataInicial, dataFinal, devInscritos, conteudos.

º Métodos: Getters e setters para os atributos, além de equals() e hashCode().





### 2° Conteudo




º Classe abstrata que serve como base para todos os tipos de conteúdo do curso.

º Atributos: titulo, descricao.

º Método abstrato: calcularXp(), que deve ser implementado por subclasses para calcular a pontuação XP do conteúdo.





### 3° Cursos




º Subclasse de Conteudo que representa um curso com uma carga horária específica.

º Atributos: cargaHoraria.

º Método: Implementação do método calcularXp() para calcular a pontuação XP com base na carga horária.




### 4° mentoria





º Subclasse de Conteudo que representa uma mentoria com uma data específica.

º Atributos: data.

º Método: Implementação do método calcularXp() com uma pontuação XP fixa.




### 5° Desenvolvedor

 
 
 

º Representa um desenvolvedor (aluno) que se inscreve em um bootcamp.

º Atributos: nome, conteudoInscritos, conteudosConcluidos.

 º Métodos: inscreverBootcamp(Bootcamp bootcamp), progredir(), calcularXpTotal().


 
 

### 6° Sistema main
 
 
 

Classe principal que contém o método main para executar o sistema e demonstrar seu funcionamento com exemplos de cursos, mentorias e desenvolvedores.
