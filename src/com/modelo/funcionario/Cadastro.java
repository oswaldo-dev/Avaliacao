package com.modelo.funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadastro extends Funcionario {
    List<Funcionario> funcionarios = new ArrayList<>();

    public Cadastro() {
        System.out.println("Informe quantos funcionários serão cadastrados: ");
        Scanner f = new Scanner(System.in);
        setQuantidadeDeFuncionarios(Integer.parseInt(f.nextLine()));

        cadastra();

        System.out.println("##### LISTA DE FUNCIONÁRIOS #####");

        percorreLista();

    }

    public void cadastra() {
        for (int i = 0; i < getQuantidadeDeFuncionarios(); i++) {
            Funcionario j = new Funcionario();
            System.out.println("Informe o nome do funcionário: ");
            Scanner n  = new Scanner(System.in);
            j.setNome(n.nextLine());
            System.out.println("Informe o salário desse funcionário: ");
            Scanner s = new Scanner(System.in);
            j.setSalario(Double.parseDouble(s.nextLine()));
            bonificacao(j);
            funcionarios.add(j);
        }
    }

    public void percorreLista(){
        for (Funcionario y : funcionarios) {
            System.out.println("Funcionário: " + y.getNome());
            System.out.println("Salário: " + y.getSalario());
            if (y.getSalario() > 2000) {
                System.out.println("Desconto: " + (y.getSalario() - y.getSalarioNovo()));
            } else if (y.getSalario() < 2000){
                System.out.println("Bônus: " + (y.getSalarioNovo() - y.getSalario()));
            } else if (y.getSalario() == 2000) {
                System.out.println("Não é bonificado!!");
            }
            System.out.println("Salário líquido: " + y.getSalarioNovo());
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println();
        }
    }

    public void bonificacao(Funcionario x) {
        if (x.getSalario() <= 1000) {
            x.setSalarioNovo(x.getSalario() + x.getBonus());
        } else if (x.getSalario() < 2000) {
            x.setSalarioNovo(x.getSalario() + x.getBonus());
        } else if (x.getSalario() > 2000) {
            x.setSalarioNovo(x.getSalario() - x.getDesconto());
        } else if (x.getSalario() == 2000) {
            x.setSalarioNovo(x.getSalario());
        }
    }
}
