// Criar um programa que leia um vetor de 10 posições de valores reais e apresente na tela o maior e o menor elemento do vetor.

import java.util.Scanner;

public class Ex01 {
    static void populaVetor(float[] v) {
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < v.length; i++) {
            System.out.print("V[" + i + "]: ");
            v[i] = leitor.nextFloat();
        }
    }

    public static void main(String[] args) {
        float[] v = new float[10];
        populaVetor(v);
        
        float min = v[0];
        float max = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
            if (v[i] > max) {
                max = v[i];
            }
        }

        System.out.println("Menor: " + min);
        System.out.println("Maior: " + max);
    }
}