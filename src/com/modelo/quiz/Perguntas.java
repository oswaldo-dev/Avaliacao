package com.modelo.quiz;


import java.util.Scanner;

public class Perguntas {

    private String pergunta;

    private String opcaoA;

    private String opcaoB;

    private String opcaoC;
    private int respostaCerta;

    public Perguntas(int questao) {
        switch (questao) {
            case 1 -> {
                setPergunta("1) Quem foi o primeiro Português a chegar em solo brasileiro?");
                setOpcaoA("1 - Duarte Pacheco em 1498.");
                setOpcaoB("2 - Vasco da Gama em 1499.");
                setOpcaoC("3 - Pedro Álvares Cabral em 1500.");
                setRespostaCerta(1);
            }
            case 2 -> {
                setPergunta("2) O que consistia o sistema de plantation?");
                setOpcaoA("1 - Plantação de cana de açúcar.");
                setOpcaoB("2 - Sistema de agricultura baseado no abastecimento interno.");
                setOpcaoC("3 - Latifúndio, monocultura, um único tipo de produto, mão de obra escrava e exportação.");
                setRespostaCerta(3);
            }
            case 3 -> {
                setPergunta("3) Qual era o objetivo das expedições dos bandeirantes?");
                setOpcaoA("1 - Expansão de território.");
                setOpcaoB("2 - Escravizar indígenas.");
                setOpcaoC("3 - Procurar de minerais preciosos.");
                setRespostaCerta(2);
            }
            case 4 -> {
                setPergunta("4) Qual foi o produto de destaque de produção no Brasil Colônia entre os séculos XVI e XVIII?");
                setOpcaoA("1 - Açúcar.");
                setOpcaoB("2 - Tabaco.");
                setOpcaoC("3 - Café.");
                setRespostaCerta(1);
            }
            case 5 -> {
                setPergunta("5) Quem foi o primeiro presidente do Brasil?");
                setOpcaoA("1 - Floriano Peixoto");
                setOpcaoB("2 - Delfim Moreira.");
                setOpcaoC("3 - Marechal Deodoro da Fonseca.");
                setRespostaCerta(3);

            }
            case 6 -> {
                setPergunta("6) Quem foi o primeiro presidente negro do Brasil?");
                setOpcaoA("1 - Campos Sales.");
                setOpcaoB("2 - Prudente de Morais.");
                setOpcaoC("3 - Nilo Procópio Peçanha.");
                setRespostaCerta(3);
            }
            case 7 -> {
                setPergunta("7) Em que ano se iniciou a Guerra do Paraguai?");
                setOpcaoA("1 - 1860.");
                setOpcaoB("2 - 1850.");
                setOpcaoC("3 - 1864.");
                setRespostaCerta(3);
            }
            case 8 -> {
                setPergunta("8) Qual dessas pessoas foi um grande líder abolicionista no Brasil?");
                setOpcaoA("1 - Fernão Dias Pais Leme.");
                setOpcaoB("2 - José Bonifácio.");
                setOpcaoC("3 - André Rebouças.");
                setRespostaCerta(3);
            }
            case 9 -> {
                setPergunta("9) Qual evento teve influência na Inconfidência Mineira?");
                setOpcaoA("1 - Guerra da Sessão.");
                setOpcaoB("2 - A Independência dos Estados Unidos.");
                setOpcaoC("3 - A Morte de Luís XVI.");
                setRespostaCerta(2);
            }
            case 10 -> {
                setPergunta("10) Qual foi o Estado brasileiro que aboliu a escravidão 4 anos antes da Lei Áurea?");
                setOpcaoA("1 - Rio de Janeiro.");
                setOpcaoB("2 - Rio Grande do Sul.");
                setOpcaoC("3 - Ceará.");
                setRespostaCerta(3);
            }
        }
    }


    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOpcaoA() {
        return opcaoA;
    }

    public void setOpcaoA(String opcaoA) {
        this.opcaoA = opcaoA;
    }

    public String getOpcaoB() {
        return opcaoB;
    }

    public void setOpcaoB(String opcaoB) {
        this.opcaoB = opcaoB;
    }

    public String getOpcaoC() {
        return opcaoC;
    }

    public void setOpcaoC(String opcaoC) {
        this.opcaoC = opcaoC;
    }

    public int getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(int respostaCerta) {
        this.respostaCerta = respostaCerta;
    }

}
