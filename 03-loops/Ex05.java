/*
    Criar um programa que leia dois números inteiros. Se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja,
    para o segundo valor não pode ser aceito o valor zero. Apresentar na tela o resultado da divisão do primeiro valor lido pelo segundo valor lido.
*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro Numero: ");
        int n1 = leitor.nextInt();
        int n2;

        do {
            System.out.print("Segundo Numero: ");
            n2 = leitor.nextInt();
            
            if (n2 == 0) {
                System.out.println("\tValor Inválido. Não pode ser zero!");
            }
        } while (n2 == 0);

        float divisao = (float) n1 / n2;
        
        System.out.println("Resultado = " + String.format("%.2f", divisao));
    }
}