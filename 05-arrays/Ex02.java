/*
    Criar um programa que leia uma determinada quantia a ser retirada em um caixa eletrônico e apresente a quantidade mínima de cédulas equivalente.
    As cédulas são de 50, 20 e 10. Utilizar sempre que possível cédulas de maior valor. O valor da quantia a ser retirada deve ser múltiplo de 10.
    Guardar em um vetor a quantidade de cada cédula. Apresentar os dados do vetor de cédulas na tela.
*/

import java.util.Scanner;

public class Ex02 {
    static final int[] CEDULAS = {50, 20, 10};

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] quantidade = new int[CEDULAS.length];
        int valor;

        do {
            System.out.print("Quantia: ");
            valor = leitor.nextInt();
            if (valor % 10 != 0) {
                System.out.println("O valor tem que ser multiplo de 10!");
            }
        } while (valor % 10 != 0);

        for (int i = 0; i < CEDULAS.length; i++) {
            quantidade[i] = valor / CEDULAS[i];
            valor = valor % CEDULAS[i];
        }
        
        for (int i = 0; i < CEDULAS.length; i++) {
            System.out.print("R$ " + CEDULAS[i] + " = ");
            System.out.println(quantidade[i]);
        }
    }
}