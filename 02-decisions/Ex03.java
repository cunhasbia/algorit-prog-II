/* 
    Criar um algoritmo que leia a altura e o sexo de uma pessoa (M ou F) e apresente o seu peso ideal, utilizando a seguinte fórmula:
    • para homens: (72.7 * altura) - 58
    • para mulheres: (62.1 * altura) - 44.7
*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Altura: ");
        float altura = leitor.nextFloat();
        System.out.print("Sexo (M ou F): ");
        char sexo = leitor.next().charAt(0);
        float pesoIdeal;

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7f * altura) - 58.0f;
        } else {
            pesoIdeal = (62.1f * altura) - 44.7f;
        }
        
        System.out.println("Peso Ideal = " + String.format("%.2f", pesoIdeal));
    }
}