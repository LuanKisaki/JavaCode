package Pratica17.Aluno;

public class Pratica17_AlunoEnsinoMedio extends Pratica17_Aluno {

  //  Media
  public double getMedia() {
//    return (notaTeste + notaProva)/ 2;
    return (getNotaTeste() + getNotaProva())/ 2;
  }
}
