/*
    Use o laço while para ler 06 valores do usuário. Ao final do laço, imprimir:
    • Soma de todos os valores digitados que são pares;
    • Quantidade de valores digitados que são pares;
    • Média (decimal) de todos os valores digitados que são pares.
*/

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int i = 1;
        int n;
        int qtde = 0;
        int soma = 0;

        while (i <= 6) {
            System.out.print("Numero " + i + ": ");
            n = leitor.nextInt();

            if (n % 2 == 0) {
                soma += n; // soma = soma + n;
                qtde++; // qtde = qtde + 1;
            }

            i++; // i = i + 1;
        }

        float media = (float) soma / qtde;

        System.out.println("Soma = " + soma);
        System.out.println("Quantidade = " + qtde);
        System.out.println("Media = " + String.format("%.1f", media) );
    }
}