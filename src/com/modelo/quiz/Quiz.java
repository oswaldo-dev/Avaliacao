package com.modelo.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

    Entrevistado entrevistado;
    Scanner resp;
    List<Perguntas> perguntas = new ArrayList<>();
    List<Entrevistado> listaEntrevistados = new ArrayList<>();

    public Quiz(){
        for (int i = 1; i <= 10; i++) {
            Perguntas pergunta = new Perguntas(i);
            perguntas.add(pergunta);
        }

        jogar();
    }

    private void jogar(){
        entrevistado = new Entrevistado();
        System.out.println("##### BEM VINDO AO QUIZ #####");
        System.out.println();
        System.out.println("Informe seu nome: ");
        Scanner n = new Scanner(System.in);
        entrevistado.setNome(n.nextLine());

        for (Perguntas pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            System.out.println();
            System.out.println(pergunta.getOpcaoA());
            System.out.println(pergunta.getOpcaoB());
            System.out.println(pergunta.getOpcaoC());
            System.out.println();
            System.out.println("Informe a resposta (1 a 3): ");
            resp = new Scanner(System.in);
            if(pergunta.getRespostaCerta() == Integer.parseInt(resp.nextLine())) {
                System.out.println("Você acertou!!");
                System.out.println();
                entrevistado.incrementaAcerto();
            } else {
                System.out.println("Você errou!!");
                System.out.println();
                entrevistado.incrementaErro();
            }
        }

        System.out.println("Nome: " + entrevistado.getNome());
        System.out.println("Acertos: " + entrevistado.getAcertos());
        System.out.println("Erros: " + entrevistado.getErros());
        System.out.println();
        listaEntrevistados.add(entrevistado);
        System.out.println("###### FIM DO JOGO #####");
        System.out.println("Deseja jogar novamente?(s/n)");
        resp = new Scanner(System.in);
        if (resp.nextLine().equals("s")) {
            jogar();
        } else {
            for (Entrevistado entrevistado : listaEntrevistados) {
                System.out.println(entrevistado.getNome());
                System.out.println("    Acertos : " + entrevistado.getAcertos());
                System.out.println("    Erros   : " + entrevistado.getAcertos());
                System.out.println("------------------------------------------");
            }
        }

    }
}
