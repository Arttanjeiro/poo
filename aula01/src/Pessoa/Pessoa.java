package Pessoa;

public class Pessoa {

  private String nome;
  private double peso;
  private double altura;


  public Pessoa(String nome, double peso, double altura) {
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public double getPeso() {
    return peso;
  }

  public double getAltura() {
    return altura;
  }

  public double imc() {
      double calculaImc = getPeso() / (getAltura() * getAltura());
    return calculaImc;

  }

  public String situacao() {
    return imc() < 18.5 ? "Você está abaixo do peso idea" : "Parabéns, você está em seu peso normal";

  }

  @Override
  public String toString() {
    //
    return " Nome da Pessoa: " + getNome() + "\n" + " Altura: " + getAltura() + "\n" + " Peso: " + getPeso();
  }
}

/*
 * 
 *  if (imc() < 18.5) {

      return "Você está abaixo do peso idea";

    }else if (imc() >= 18.5 && imc() == 24.9) {
      return"Parabéns, você está em seu peso normal.";

  }else if(imc() >= 24.9){
    return "Você está acima de seu peso (sobrepeso)";
  }
 */