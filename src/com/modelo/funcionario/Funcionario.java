package com.modelo.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    private String nome;
    private double salario;
    private int quantidadeDeFuncionarios;
    private double salarioNovo;
    private double bonus;
    private double desconto;


    public double getSalarioNovo() {
        return salarioNovo;
    }

    public void setSalarioNovo(double salarioNovo) {
        this.salarioNovo = salarioNovo;
    }

    public double getBonus() {
        if (getSalario() <= 1000) {
            bonus = getSalario() * 0.20;
        } else if (getSalario() < 2000) {
            bonus = getSalario() * 0.10;
        }
        return bonus;
    }

    public double getDesconto() {
        if (getSalario() > 2000) {
            desconto = getSalario() * 0.10;
        }
        return desconto;
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
