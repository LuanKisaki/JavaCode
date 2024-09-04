package Pratica17.Professor;

import Pratica17.Pratica17_Pessoa;

public class Pratica17_SalarioProfessor extends Pratica17_Pessoa {

  private double salario;

  double getSalario() {
    return salario;
  }
  void setSalario(double salario) {
    this.salario = salario;
  }

  double getInss(){
    return salario*0.11;
  }

  double getSalarioLiquido(){
    return salario - getInss();
  }

}
