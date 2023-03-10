package automovel;

public class Automovel {
  
  private String modelo;
  private double valorFabrica;

  public Automovel(String modelo, double valorFabrica) {
    this.modelo = modelo;
    this.valorFabrica = valorFabrica;
  }

  public String getModelo() {
    return modelo;
  }

  public double getValorFabrica() {
    return valorFabrica;
  }

  public double imposto(double percentual){
    if(percentual >= 12){
     return percentual = this.valorFabrica * 0.12;
    }else{
      return percentual = this.valorFabrica * 0.15;
    }



  }

  public double porcentagem(double percentual){
      return this.valorFabrica * percentual/100;

  }

  public double valorVeiculo() {

    return valorFabrica = imposto(5) + porcentagem(24);
  
  }
  
  @Override
  public String toString() {
    return " Modelo do carro: " + getModelo() + "\n" 
    + " Valor de fábrica: " + getValorFabrica() + "\n" + " Valor do imposto: " +
     imposto(10) + "\n" + " Porcentagem: " + porcentagem(24)  + "\n" 
    + " Valor total carro: "+ valorVeiculo();
     
  }
}
