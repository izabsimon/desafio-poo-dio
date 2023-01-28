import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Jva Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIza = new Dev();
        devIza.setNome("Iza");
        devIza.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Iza: " + devIza.getConteudoInscritos());

        devIza.progredir();
        devIza.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Iza: " + devIza.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Iza:" + devIza.getConteudoConcluidos());
        System.out.println("XP: " + devIza.calcularTotalXp());


        System.out.println("-----------");

        Dev devCirano = new Dev();
        devCirano.setNome("Cirano");
        devCirano.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Cirano: " + devCirano.getConteudoInscritos());
        devCirano.progredir();
        devCirano.progredir();
        devCirano.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Cirano: " + devCirano.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Cirano:" + devCirano.getConteudoConcluidos());
        System.out.println("XP: " + devCirano.calcularTotalXp());

    }
}

