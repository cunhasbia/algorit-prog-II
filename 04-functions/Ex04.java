// Criar uma função capaz de calcular o resultado para a função matemática abaixo (a função deve receber "x" e retornar a resposta).

import java.util.Scanner;

public class Ex04 {
    static int f (int x) {
        int resultado;

        if (x < -1) {
            resultado = Math.abs(x + 2);
        } else if (x <= 2) {
            resultado = ((int) Math.pow(x, 2)) - 4;
        } else {
            resultado = 2 * x - 1;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor de X: ");
        int x = leitor.nextInt();
        int resultado = f(x);
        
        System.out.println("Resultado = " + resultado);
    }
}