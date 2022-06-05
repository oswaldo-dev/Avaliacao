package com.modelo.quiz;

public class Entrevistado {
    private String nome;

    private Integer acertos;

    private Integer erros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAcertos() {
        return acertos;
    }

    public Integer getErros() {
        return erros;
    }

    public Entrevistado(){
        this.acertos = 0;
        this.erros = 0;
    }

    public void incrementaAcerto(){
        this.acertos++;
    }

    public void incrementaErro(){
        this.erros++;
    }
}
