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

  public String avaliaIMC(double imc) {
    if (imc < 18.5) {
      return "Você está abaixo do peso ideal.";
    } else if (imc >= 18.5 && imc <= 24.9) {
      return "Parabéns, você está em seu peso normal.";
    } else {
      return "Você está acima de seu peso (sobrepeso).";
    }
  }

  @Override
  public String toString() {
    //
    return " Nome da Pessoa: " + getNome() + "\n" + " Altura: " + getAltura() + "\n" + " Peso: " + getPeso() + "\n" + " Situação:" + avaliaIMC(imc());
  }
}

/*
 * 
 * if (imc() < 18.5) {
 * 
 * return "Você está abaixo do peso idea";
 * 
 * }else if (imc() >= 18.5 && imc() == 24.9) {
 * return"Parabéns, você está em seu peso normal.";
 * 
 * }else if(imc() >= 24.9){
 * return "Você está acima de seu peso (sobrepeso)";
 * }
 */