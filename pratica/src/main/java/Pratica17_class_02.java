public class Pratica17_class_02 extends Pratica17_class_heranca{

  double salario;

  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }

  double getInss(){
    return salario*0.11;
  }

  double getSalarioLiquido(){
    return salario - getInss();
  }
}
