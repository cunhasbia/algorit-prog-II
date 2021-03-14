// Dado um número, verificar se ele é maior que 100. Se for, o algoritmo deve somar 150 a esse número. No final, imprimir o resultado da soma.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Numero: ");
        int numero = leitor.nextInt();

        if (numero > 100) {
            int soma = numero + 150;
            System.out.println("Soma = " + soma);
        }
    }
}