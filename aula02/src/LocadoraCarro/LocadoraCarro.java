package LocadoraCarro;

public class LocadoraCarro {
  private double duracaoHoras;
  private double valorHoras;
  private double valorDiaria;
  private double valorImposto;

  public LocadoraCarro(double duracaoHoras, double valorHoras, double valorDiaria, double valorImposto) {

    this.duracaoHoras = duracaoHoras;
    this.valorHoras = valorHoras;
    this.valorDiaria = valorDiaria;
    this.valorImposto = valorImposto;

  }

  public double getDuracaoHoras() {
    return duracaoHoras;
  }

  public double getValorHoras() {
    return valorHoras;
  }

  public double getValorDiaria() {
    return valorDiaria;
  }

  public double getValorImposto() {
    return valorImposto;
  }

  public double calcularValorImposto(double valor) {
    if (valor <= 200) {

      return this.valorImposto = valor * 0.2;
    } else {

      return this.valorImposto = valor * 0.15;
    }

  }

  /**
   * O java.lang.Math.ceil() retorna o valor duplo que é maior ou igual ao
   * argumento e é igual ao inteiro matemático mais próximo.
   */
  public double calcularValorTotal() {

    double valorTotal = 0;
    if (this.duracaoHoras <= 12) {
      valorTotal = this.duracaoHoras * this.valorHoras;

    } else {
      valorTotal = Math.ceil(this.duracaoHoras / 24) * this.valorDiaria;

    }

    this.valorImposto = calcularValorImposto(valorTotal);
    return valorTotal += getValorImposto();
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return " Valor por hora R$:" + getValorHoras() + "\n" + " Valor por diária R$:" + getValorDiaria() + "\n"
        + " Valor do imposto R$:" + getValorImposto() + "\n" + " Valor total da locação: R$:" + calcularValorTotal();
  }
}
