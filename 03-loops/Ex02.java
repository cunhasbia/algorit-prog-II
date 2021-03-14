/*
    Criar um algoritmo que efetua a leitura sucessiva de valores numéricos inteiros positivos ou negativos,
    finalizando a leitura quando for fornecido o número zero. Ao final, apresente a soma dos números
    positivos, a soma dos números negativos e a soma das duas parciais.
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int somaPos = 0;
        int somaNeg = 0;
        System.out.print("Numero: ");
        int n = leitor.nextInt();

        while (n != 0) {
            if (n > 0) {
                somaPos += n; // somaPos = somaPos + n;
            } else {
                somaNeg += n; // somaNeg = somaNeg + n;
            }

            System.out.print("Numero: ");
            n = leitor.nextInt();
        }

        int somaParciais = somaPos + somaNeg;

        System.out.println("Soma Positivos = " + somaPos);
        System.out.println("Soma Negativos = " + somaNeg);
        System.out.println("Soma Parciais = " + somaParciais);
    }
}