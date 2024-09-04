package Pratica17.Aluno;

public class Pratica17_AlunoEnsinoSuperior extends Pratica17_Aluno {

  //  Media
  public double getMedia() {
    return (getNotaTeste() + getNotaProva())/ 3;
  }
}
