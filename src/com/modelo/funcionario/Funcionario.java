package com.modelo.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionario {

    private String nome;
    private double salario;
    private int quantidadeDeFuncionarios;

    int i;

    public Funcionario() {
        System.out.println("Informe quantos funcionários serão cadastrados: ");
        Scanner f = new Scanner(System.in);
        setQuantidadeDeFuncionarios(Integer.parseInt(f.nextLine()));
        List<Funcionario> funcionarios = new ArrayList<>(getQuantidadeDeFuncionarios());
        cadastraFuncionarios();
    }

    public void cadastraFuncionarios() {
        for (i = 0; i < getQuantidadeDeFuncionarios(); i++) {
            System.out.println("Informe o nome do funcionário: ");
            Scanner n  = new Scanner(System.in);
            setNome(n.nextLine());
            System.out.println("Informe o salário desse funcionário: ");
            Scanner s = new Scanner(System.in);
            setSalario(Double.parseDouble(s.nextLine()));
        }
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
