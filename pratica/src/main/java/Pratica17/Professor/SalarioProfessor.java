package Pratica17.Professor;

import Pratica17.Pessoa;

public class SalarioProfessor extends Pessoa {

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
