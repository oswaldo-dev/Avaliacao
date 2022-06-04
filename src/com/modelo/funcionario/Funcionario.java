package com.modelo.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    private String nome;
    private double salario;
    private int quantidadeDeFuncionarios;



    public Funcionario() {
        System.out.println("Informe quantos funcionários serão cadastrados: ");
        Scanner f = new Scanner(System.in);
        setQuantidadeDeFuncionarios(Integer.parseInt(f.nextLine()));
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setQuantidadeDeFuncionarios(int quantidadeDeFuncionarios) {
        this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
    }

    public int getQuantidadeDeFuncionarios() {
        return quantidadeDeFuncionarios;
    }
}
