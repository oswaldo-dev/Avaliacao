package com.modelo.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro extends Funcionario {

    private int quantidadeDeCadastro;
    List<Funcionario> funcionarios = new ArrayList<>();

    public Cadastro() {
        Funcionario f = new Funcionario();
        for (int i = 0; i < getQuantidadeDeFuncionarios(); i++) {
            System.out.println("Informe o nome do funcionário: ");
            Scanner n  = new Scanner(System.in);
            setNome(n.nextLine());
            System.out.println("Informe o salário desse funcionário: ");
            Scanner s = new Scanner(System.in);
            setSalario(Double.parseDouble(s.nextLine()));
        }

    }


    public int getQuantidadeDeCadastro() {
        return quantidadeDeCadastro;
    }

    public void setQuantidadeDeCadastro(int quantidadeDeCadastro) {
        this.quantidadeDeCadastro = quantidadeDeCadastro;
    }
}
