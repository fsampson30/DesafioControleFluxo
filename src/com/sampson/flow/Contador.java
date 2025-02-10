package com.sampson.flow;

import com.sampson.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {

    public void executar(){
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametro2 = terminal.nextInt();

        int contador = calcularQuantidadeInteracoes(parametro1,parametro2);
        for (int i = 1; i<= contador; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }

    public int calcularQuantidadeInteracoes(int number1, int number2){
        if (number1 > number2) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
        return number2 - number1;
    }
}
