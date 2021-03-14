/* 
    Criar uma função que receba dois vetores A e B de mesma dimensão, e monte um vetor C, o qual deve ser composto, alternadamente,
    por um elemento do vetor A e outro do vetor B. Imprimir o vetor C.
*/

public class Ex04 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7, 9};
        int[] B = {2, 4, 6, 8, 0};
        int[] C = criarVetor(A, B);

        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }

    static int[] criarVetor(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i * 2] = A[i];
            C[i * 2 + 1] = B[i];
        }
        
        return C;
    }
}