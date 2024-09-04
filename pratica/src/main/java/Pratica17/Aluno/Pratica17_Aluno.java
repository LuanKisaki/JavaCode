package Pratica17.Aluno;

import Pratica17.Pratica17_NotaMedia;
import Pratica17.Pratica17_Pessoa;

public abstract class Pratica17_Aluno extends Pratica17_Pessoa implements Pratica17_NotaMedia {

  private double notaTeste, notaProva;

  //    NotaTeste
    double getNotaTeste() {
    return notaTeste;
  }

  void setNotaTeste(double notaTeste) {
    this.notaTeste = notaTeste;
  }

  //       NotaProva
  double getNotaProva() {

    return notaProva;
  }

  void setNotaProva(double notaProva) {

    this.notaProva = notaProva;
  }

//  double getNotaTeste(double notaTeste){
//    return this.notaTeste;
//  }
//  void setNotaTeste(double notaTeste) {
//    this.notaTeste = notaTeste;
//  }

//  double getNotaProva(double notaProva) {
//    return this.notaProva;
//  }
//
//  void setNotaProva(double notaProva) {
//    this.notaProva = notaProva;
//  }

  //  Media

}
