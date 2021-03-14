// Criar uma função com dois parâmetros numéricos capaz de verificar qual número é o maior e retorná-lo.

import java.util.Scanner;

public class Ex02 {
    static int maior (int n1, int n2) {
        int maior = n1;

        if (n2 > n1) {
            maior = n2;
        }

        return maior;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Primeiro Numero: ");
        int n1 = leitor.nextInt();
        System.out.print("Segundo Numero: ");
        int n2 = leitor.nextInt();
        
        int maior = maior(n1, n2);
        
        System.out.println("Maior = " + maior);
    }
}