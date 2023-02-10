package Aluno;

public class Aluno {
  
  String nomeAluno;
  float notaB1;
  float notaB2;
  
  public Aluno(String nomeAluno, float notaB1, float notaB2) {
    this.nomeAluno = nomeAluno;
    this.notaB1 = notaB1;
    this.notaB2 = notaB2;
  }

  public String getNomeAluno() {
    return nomeAluno;
  }
  public float getNotaB1() {
    return notaB1;
  }
  public float getNotaB2() {
    return notaB2;
  }

  public Float mediaAluno(int pesoB1 , int pesoB2){
    float media = ((getNotaB1() * pesoB1) + (getNotaB2() * pesoB2))/(pesoB1 + pesoB2);
    return media;
  }  

  public String situacaoAluno(){

    return mediaAluno( 5, 5) >= 6 ? "Aprovado" : "Reprovado";
  }

  @Override
  public String toString() {
   
    return " Nome do aluno: "  + getNomeAluno() + "\n" + " Nota do aluno: " + mediaAluno(5,5) + "\n" + " Situação do aluno: " + situacaoAluno();
  }
}
