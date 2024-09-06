package Pratica17.Aluno;

public class AlunoEnsinoMedio extends Aluno {

  //  Media
  public double getMedia() {
//    return (notaTeste + notaProva)/ 2;
    return (getNotaTeste() + getNotaProva())/ 2;
  }
}
