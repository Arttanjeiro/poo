package formas.qudrado;

public class Quadrado {
  private double lado;
  private double altura;

  public Quadrado(double lado, double altura) {
    this.lado = lado;
    this.altura = altura;
  }

  public double getLado() {
    return lado;
  }

  public double getAltura() {
    return altura;
  }

  public double area(){
    double area ;
     area = Math.pow(getLado() , 2);
     return area;
  }

  public double perimetro(){
    double perimetro ;
    perimetro = 4 * getLado();
    return perimetro;
  }

  @Override
  public String toString() {
    return " Area do Quadrado: " + area() + "\n" + " Perimetro do Quadrado:" + perimetro();
  }

  
}
