// Criar um programa que leia dois números do usuário e um operador (+, - , * , /) e mostre o resultado da operação na tela.

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("N1: ");
        float n1 = leitor.nextFloat();
        System.out.print("Operador: ");
        char op = leitor.next().charAt(0);
        System.out.print("N2: ");
        float n2 = leitor.nextFloat();
        float resultado = 0.0f;

        switch (op) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Operador invalido!");
        }

        System.out.println("Resultado = " + String.format("%.2f", resultado));
    }
}