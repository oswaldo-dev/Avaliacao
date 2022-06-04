package com.modelo.login;

import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;

public class Login {

    String user = "username";
    String password = "123456";
    private String userInput;
    private String passwordInput;
    LocalTime horarioAtual = LocalTime.now();
    LocalTime bomDia = LocalTime.parse("05:59:59.999");
    LocalTime boaTarde = LocalTime.parse("11:59:59.999");
    LocalTime boaNoite = LocalTime.parse("17:59:59.999");
    LocalTime boaMadrugada = LocalTime.parse("23:59:59.999");

    public Login() {
        System.out.println("Informe seu username: ");
        Scanner u = new Scanner(System.in);
        setUserInput(u.nextLine());

        System.out.println("Informe sua senha: ");
        Scanner p = new Scanner(System.in);
        setPasswordInput(p.nextLine());

        validaHorario();
    }

    public void validaHorario() {
        if (Objects.equals(getUserInput(), getUser()) && Objects.equals(getPasswordInput(), getPassword())) {
            if (horarioAtual.isAfter(boaMadrugada)) {
                System.out.println("Boa madrugada, você se logou ao nosso sistema.");
            } else if (horarioAtual.isAfter(boaNoite)) {
                System.out.println("Boa noite, você se logou ao nosso sistema.");
            } else if (horarioAtual.isAfter(boaTarde)) {
                System.out.println("Boa Tarde, você se logou ao nosso sistema.");
            } else if (horarioAtual.isAfter(bomDia)) {
                System.out.println("Bom madrugada, você se logou ao nosso sistema.");
            }
        } else {
            System.out.println("Usuário e/ou senha incorretos.");
        }
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getPasswordInput() {
        return passwordInput;
    }

    public void setPasswordInput(String passwordInput) {
        this.passwordInput = passwordInput;
    }

    public String getUser() {
        return user;
    }


    public String getPassword() {
        return password;
    }

}
