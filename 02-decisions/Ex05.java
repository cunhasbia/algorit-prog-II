/* 
    Pedir um mês do ano (01 a 12) e, de acordo com as condições a seguir, dizer: 01 (Férias), 02 a 06 (1º semestre letivo),
    07 (Recesso), 08 a 11 (2º semestre letivo), 12 (Férias). Utilize a estrutura switch-case.
*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Mes: ");
        int mes = leitor.nextInt();

        switch (mes) {
            case 1:
            case 12:
                System.out.println("Férias!");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("1º Semestre letivo");
                break;
            case 7:
                System.out.println("Recesso!");
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("2º Semestre letivo");
                break;
            default:
                System.out.println("Mês inválido!");
        }
    }
}