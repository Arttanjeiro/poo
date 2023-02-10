package Conta;

public class Conta {

  private String cliente;
  private double saldo;
  private double limite;

  public Conta(String cliente, double saldo, double limite) {
    this.cliente = cliente;
    this.saldo = saldo;
    this.limite = limite;
  }

  public String getCliente() {
    return cliente;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getLimite() {
    return limite;
  }



  public double deposito(double valor) {

    if (valor > 0) {
      this.saldo += valor;
      System.out.println("Deposito realizado com sucesso.");
    } else {
      System.out.println("Não é possivel depositar valor negativo. Tente novamente");
    }
    return valor;
  }

  public boolean sacar(double valor){
    if(this.saldo>= valor && valor > 0 ){
        this.saldo -= valor;
        System.out.println(" Saque de: " + valor + " realizado com sucesso");
        return true;
    }
    if(valor == 0){
      System.out.println(" Não é possivel sacar R$ 0,00. Tente novamente.");
      return false;
    }else{
      System.out.println("Saldo insuficiente.");
       return false;
    }
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
  return " Dados do cliente: " + getCliente()  + "\n" + " Saldo disponível: " + getSaldo();
  }

}
