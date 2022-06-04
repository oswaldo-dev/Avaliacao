package com.modelo.quiz;


import java.util.Scanner;

public class Perguntas {
    private String nome;

    private int acertos;
    private int erros;
    private int resposta;
    private int respostaCerta;
    Scanner resp;

    public Perguntas() {

    }
    public Perguntas(int questao) {
        switch (questao) {
            case 1 -> {
                System.out.println("1) Quem foi o primeiro Português a chegar em solo brasileiro?");
                System.out.println();
                System.out.println("1 - Duarte Pacheco em 1498.");
                System.out.println("2 - Vasco da Gama em 1499.");
                System.out.println("3 - Pedro Álvares Cabral em 1500.");
                System.out.println();
                setRespostaCerta(1);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 2 -> {
                System.out.println("2) O que consistia o sistema de plantation?");
                System.out.println();
                System.out.println("1 - Plantação de cana de açúcar.");
                System.out.println("2 - Sistema de agricultura baseado no abastecimento interno.");
                System.out.println("3 - Latifúndio, monocultura, um único tipo de produto, mão de obra escrava e exportação.");
                System.out.println();
                setRespostaCerta(3);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 3 -> {
                System.out.println("3) Qual era o objetivo das expedições dos bandeirantes?");
                System.out.println();
                System.out.println("1 - Expansão de território.");
                System.out.println("2 - Escravizar indígenas.");
                System.out.println("3 - Procurar de minerais preciosos.");
                System.out.println();
                setRespostaCerta(2);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 4 -> {
                System.out.println("4) Qual foi o produto de destaque de produção no Brasil Colônia entre os séculos XVI e XVIII?");
                System.out.println();
                System.out.println("1 - Açúcar.");
                System.out.println("2 - Tabaco.");
                System.out.println("3 - Café.");
                System.out.println();
                setRespostaCerta(1);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 5 -> {
                System.out.println("5) Quem foi o primeiro presidente do Brasil?");
                System.out.println();
                System.out.println("1 - Floriano Peixoto");
                System.out.println("2 - Delfim Moreira.");
                System.out.println("3 - Marechal Deodoro da Fonseca.");
                System.out.println();
                setRespostaCerta(3);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 6 -> {
                System.out.println("6) Quem foi o primeiro presidente negro do Brasil?");
                System.out.println();
                System.out.println("1 - Campos Sales.");
                System.out.println("2 - Prudente de Morais.");
                System.out.println("3 - Nilo Procópio Peçanha.");
                System.out.println();
                setRespostaCerta(3);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 7 -> {
                System.out.println("7) Em que ano se iniciou a Guerra do Paraguai?");
                System.out.println();
                System.out.println("1 - 1860.");
                System.out.println("2 - 1850.");
                System.out.println("3 - 1864.");
                System.out.println();
                setRespostaCerta(3);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 8 -> {
                System.out.println("8) Qual dessas pessoas foi um grande líder abolicionista no Brasil?");
                System.out.println();
                System.out.println("1 - Fernão Dias Pais Leme.");
                System.out.println("2 - José Bonifácio.");
                System.out.println("3 - André Rebouças.");
                System.out.println();
                setRespostaCerta(3);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 9 -> {
                System.out.println("9) Qual evento teve influência na Inconfidência Mineira?");
                System.out.println();
                System.out.println("1 - Guerra da Sessão.");
                System.out.println("2 - A Independência dos Estados Unidos.");
                System.out.println("3 - A Morte de Luís XVI.");
                System.out.println();
                setRespostaCerta(2);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            case 10 -> {
                System.out.println("10) Qual foi o Estado brasileiro que aboliu a escravidão 4 anos antes da Lei Áurea?");
                System.out.println();
                System.out.println("1 - Rio de Janeiro.");
                System.out.println("2 - Rio Grande do Sul.");
                System.out.println("3 - Ceará.");
                setRespostaCerta(3);
                System.out.println("Informe a resposta (1 a 3): ");
                resp = new Scanner(System.in);
                setResposta(Integer.parseInt(resp.nextLine()));
            }
            default -> System.out.println("Você ultrapassou o número de questões.");
        }
    }

    public int getErros() {
        return erros;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    public int getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(int respostaCerta) {
        this.respostaCerta = respostaCerta;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
