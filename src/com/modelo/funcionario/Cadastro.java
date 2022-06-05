package com.modelo.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro extends Funcionario {
    List<Funcionario> funcionarios = new ArrayList<>();

    private int qtdefuncionarios;

    Scanner input;

    public int getQtdefuncionarios() {
        return qtdefuncionarios;
    }

    public void setQtdefuncionarios(int qtdefuncionarios) {
        this.qtdefuncionarios = qtdefuncionarios;
    }

    public Cadastro() {
        System.out.println("Informe quantos funcionários serão cadastrados: ");
        input = new Scanner(System.in);
        setQtdefuncionarios(Integer.parseInt(input.nextLine()));

        cadastra();

        System.out.println("##### LISTA DE FUNCIONÁRIOS #####");

        percorreLista();

    }

    public void cadastra() {
        for (int i = 0; i < getQtdefuncionarios(); i++) {
            Funcionario funcionario = new Funcionario();
            System.out.println("Informe o nome do funcionário: ");
            input  = new Scanner(System.in);
            funcionario.setNome(input.nextLine());
            System.out.println("Informe o salário desse funcionário: ");
            input = new Scanner(System.in);
            funcionario.setSalario(Double.parseDouble(input.nextLine()));
            bonificacao(funcionario);
            funcionarios.add(funcionario);
        }
    }

    public void percorreLista(){
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            if (funcionario.getSalario() > 2000) {
                System.out.println("Desconto: " + (funcionario.getSalario() - funcionario.getSalarioNovo()));
            } else if (funcionario.getSalario() < 2000){
                System.out.println("Bônus: " + (funcionario.getSalarioNovo() - funcionario.getSalario()));
            } else if (funcionario.getSalario() == 2000) {
                System.out.println("Não é bonificado!!");
            }
            System.out.println("Salário líquido: " + funcionario.getSalarioNovo());
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println();
        }

    }

    public void bonificacao(Funcionario funcionario) {
        if (funcionario.getSalario() <= 1000) {
            funcionario.setSalarioNovo(funcionario.getSalario() + funcionario.getBonus());
        } else if (funcionario.getSalario() < 2000) {
            funcionario.setSalarioNovo(funcionario.getSalario() + funcionario.getBonus());
        } else if (funcionario.getSalario() > 2000) {
            funcionario.setSalarioNovo(funcionario.getSalario() - funcionario.getDesconto());
        } else if (funcionario.getSalario() == 2000) {
            funcionario.setSalarioNovo(funcionario.getSalario());
        }
    }
}
