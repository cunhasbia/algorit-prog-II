/* 
    Criar um algoritmo que leia o ano atual e o ano de nascimento de uma pessoa. Apresentar na tela uma mensagem que
    diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Ano atual: ");
        int anoAtual = leitor.nextInt();
        System.out.print("Ano de nascimento: ");
        int anoNasc = leitor.nextInt();

        if (anoAtual - anoNasc >= 16) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Não pode votar!");
        }
    }
}