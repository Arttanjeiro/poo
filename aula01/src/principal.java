/* Essa atividade é pra fazer uma class que tem todos os atributos do aluno, como media do 
 * aluno e situação do aluno e dados         ;
 */

import Pessoa.Pessoa;

public class principal {

  public static void main(String[] args) {
    /*
     * System.out.println("Media dos alunos");
     * Aluno aluno1 = new Aluno(" Arthur", 7, 7);
     * Aluno aluno2 = new Aluno(" Lucas Mathues", 5, 5);
     * 
     * System.out.println(aluno1.toString());
     * System.out.println("**************");
     * System.out.println(aluno2.toString());
     * 
     * System.out.println("*****************************");
     * System.out.println("\n");
     */

    /*
     * System.out.println(" Conta bancario");
     * Conta conta1 = new Conta("Arthur", 200, 200);
     * 
     * conta1.deposito(0);
     * conta1.sacar(200);
     * System.out.println(" **********************************************");
     * System.out.println( conta1.toString());
     * 
     * System.out.println("*****************************");
     * System.out.println("\n");
     */

    System.out.println("Calcula o IMC da pessoa");
    Pessoa pessoa1 = new Pessoa("Arthur", 75, 1.94);
    System.out.println(pessoa1.toString());
    System.out.println(pessoa1.imc());
    

  }
}
