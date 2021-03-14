/* 
    Modificar a função imprimirSituação do exemplo dado para retornar uma String. Se aluno aprovado,
    retornar "Aprovado". Caso contrário, retorna "Reprovado".
*/

public class Ex01 {
    static String imprimirSituacao(float nota) {
        String status;

        if (nota >= 6.0f) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }
        
        return status;
    }
    
    public static void main(String[] args) {
        String situacao = imprimirSituacao(6.7f);
        System.out.println(situacao);
    }
}