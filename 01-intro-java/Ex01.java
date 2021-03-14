/* Criar um programa que leia o valor correspondente ao salário mensal de um trabalhador e também o valor
do percentual de reajuste a ser atribuído ao salário. Apresente na tela o valor do novo salário. */

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Salario: ");
        float salario = leitor.nextFloat();
        System.out.print("Reajuste: ");
        float reajuste = leitor.nextFloat();
        float novoSalario = salario + (salario * reajuste / 100);
        
        System.out.println("Novo Salario = R$ " + novoSalario);
    }
}