package Pratica17.Aluno;

public class AlunoEnsinoSuperior extends Aluno {

  //  Media
  public double getMedia() {
    return (getNotaTeste() + getNotaProva())/ 3;
  }
}
