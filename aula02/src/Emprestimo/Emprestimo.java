package Emprestimo;

/**
 * Emprestimo
 */
public class Emprestimo {
  private String nomeCliente;
  private double salario;
  private double valor;
  private int parcelas;
  private double taxaJuros;

  public Emprestimo(String nomeCliente, double salario, double valor, int parcelas, double taxaJuros) {
    this.nomeCliente = nomeCliente;
    this.salario = salario;
    this.valor = valor;
    this.parcelas = parcelas;
    this.taxaJuros = taxaJuros;
  }

  public double getValor() {
    return valor;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public double getSalario() {
    return salario;
  }

  public int getParcelas() {
    return parcelas;
  }

  public double getTaxaJuros() {
    return taxaJuros;
  }

  public double calcularValorParcela() {
    /*
     * O método "Math.pow(1 + taxaJuros, -parcelas)" é utilizado para calcular o
     * fator de desconto que será aplicado na fórmula, de acordo com o número de
     * parcelas.
     */
    double valorParcela = (this.valor * this.taxaJuros) / (Math.pow(1 + this.taxaJuros, -this.parcelas));
    return valorParcela;
  }

  public boolean emprestimoAprovado() {
    double limiteParcela = getSalario() * 0.3;
    return calcularValorParcela() <= limiteParcela;
  }

  public String mostraTodasAsParcela() {
    double valores = this.valor;

    
    for (int i = 1; i <= this.parcelas; i++) {
      double mostrarTodaAsParcelas = getValor() * Math.pow((1 + this.taxaJuros), i);

      valores -= mostrarTodaAsParcelas;
      System.out.println("Parcela de " + i + " valor: R$ "
          + mostrarTodaAsParcelas + "\n");
    }
    return "Mostrando todos os valores da parcelas";
  }

  public String situacao(boolean verificarAprovacao) {

    return verificarAprovacao ? " Empréstimo aprovado!" : " Empréstimo não aprovado.";
  }

  @Override
  public String toString() {

    // TODO Auto-generated method stub
    return "\n" + " Nome do cliente:" + getNomeCliente() + "\n" + " Salario: " + getSalario() + "\n"
        + " Valor da  parcela final: R$: "
        + Math.round(calcularValorParcela() * 1000) / 100.0 + "\n" + situacao(emprestimoAprovado()) + "\n";

  }
}