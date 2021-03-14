/* 
    Uma conta telefônica é composta dos seguintes custos:
    • assinatura: R$ 17,90
    • chamada local: R$ 0,04 por minuto
    • chamada para celular: R$ 0,20 por minuto
    • interurbanos
    Criar um programa que calcule o valor total a ser pago sabendo será fornecida a quantidade de minuto locais e para celular.
    O valor gasto em interurbanos foi de R$ 34,29. Apresentar na tela os custos e o valor total a ser pago.
*/

import java.util.Scanner;

public class Ex03 {
    public static final float ASSINATURA = 17.90f;
    public static final float LOCAL = 0.04f;
    public static final float CELULAR = 0.20f;
    public static final float INTERURBANO = 34.29f;

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Minutos Locais: ");
        int minlocal = leitor.nextInt();
        System.out.print("Minutor Celular: ");
        int mincelular = leitor.nextInt();

        float valorLocal = minlocal * LOCAL;
        float valorCelular = mincelular * CELULAR;
        float valorConta = ASSINATURA + valorLocal + valorCelular + INTERURBANO;

        System.out.println("*** Conta de Telefone ***");
        System.out.println("Assinatura = R$ " + ASSINATURA);
        System.out.println("Ligação Local = R$ " + valorLocal);
        System.out.println("Ligação Celular = R$ " + valorCelular);
        System.out.println("Interurbano = R$ " + INTERURBANO);
        System.out.println("Valor Total = R$ " + valorConta);
    }
}