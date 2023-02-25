import Emprestimo.Emprestimo;
import LocadoraCarro.LocadoraCarro;

public class principal {

  public static void main(String[] args) {
    Emprestimo emprestimo    = new Emprestimo("Arthur", 3000, 1000, 10, 0.1);

    System.out.println(emprestimo.mostraTodasAsParcela());
    System.out.println(emprestimo.toString());

    System.out.println("************************** \n");
    
    LocadoraCarro locadoraCarro = new LocadoraCarro(12, 300,1500, 15);
     System.out.println(locadoraCarro.toString());
   
    }
  }
  

