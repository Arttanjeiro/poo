package formas.retangulo;

public class Retangulo {

  private double lado;
  private double altura;
  
  public Retangulo(double lado, double altura) {
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
    return getAltura() * getLado();
  }
  
  public double perimetro(){
    return 2 * (getAltura() + getLado());
  }

  @Override
  public String toString() {
    return " Area do Retangulo: " + area() + "\n" + " Perimetro do Retangulo:" + perimetro();
  }

}