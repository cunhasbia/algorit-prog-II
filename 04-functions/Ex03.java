// Criar uma função com parâmetro capaz de verificar se um número é par ou ímpar.

import java.util.Scanner;

public class Ex03 {
    static boolean ehPar(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Numero: ");
        int n = leitor.nextInt();
        boolean par = ehPar(n);

        if (par) {
            System.out.println("O numero é par.");
        } else {
            System.out.println("O numero é impar.");
        }   
    }
}