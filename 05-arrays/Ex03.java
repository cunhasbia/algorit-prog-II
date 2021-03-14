// Criar uma função para unir dois vetores de mesmo tamanho e mesmo tipo em um terceiro vetor com dobro do tamanho.

public class Ex03 {
    static int[] unir(int[] v1, int[] v2) {
        int[] resultado = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++) {
            resultado[i] = v1[i];
            resultado[i + v1.length] = v2[i];
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] v1 = {2, 4, 6, 8};
        int[] v2 = {1, 3, 5, 9};
        int[] v3 = unir(v1, v2);

        for (int i = 0; i < v3.length; i++) {
            System.out.print(v3[i] + " ");
        }
    }
}