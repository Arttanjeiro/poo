import automovel.Automovel;
import formas.circulo.Circulo;
import formas.qudrado.Quadrado;
import formas.retangulo.Retangulo;

public class principal {
  
public static void main(String[] args) {
  

  Retangulo retangulo = new Retangulo(4, 6);
  Quadrado quadrado = new Quadrado(4, 6);
  Circulo circulo = new Circulo(5);


  System.out.println(retangulo.toString());
  System.out.println("--------------------------------");
  System.out.println(quadrado.toString());
  System.out.println("--------------------------------");
  System.out.println( circulo.toString());

  System.out.println("****************************************************************");

  Automovel automovel = new Automovel("Audi", 40000);

  System.out.println(automovel.toString());
}
}
