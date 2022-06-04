package com.modelo.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz extends Perguntas{

    ArrayList<Perguntas> perguntas = new ArrayList<>();

    public Quiz(){
        System.out.println("##### BEM VINDO AO QUIZ #####");
        System.out.println();
        System.out.println("Informe seu nome: ");
        Scanner n = new Scanner(System.in);
        setNome(n.nextLine());

        setAcertos(0);
        setErros(0);
        for (int i = 1; i <= 10; i++) {
            Perguntas pergunta = new Perguntas(i);

            if(pergunta.getResposta() == pergunta.getRespostaCerta()) {
                System.out.println("Você acertou!!");
                System.out.println();
                setAcertos(getAcertos() + 1);
            } else {
                System.out.println("Você errou!!");
                System.out.println();
                setErros(getErros() + 1);
            }
            perguntas.add(pergunta);
        }

        System.out.println("Nome: " + getNome());
        System.out.println("Acertos: " + getAcertos());
        System.out.println("Erros: " + getErros());
        System.out.println();
        System.out.println("###### FIM DO JOGO #####");
    }
}
