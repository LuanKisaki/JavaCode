package Pratica21;

public class Conta {
  private String contaCorrente;
  private double saldo;

  public Conta(String cc, double saldo) {
    this.contaCorrente = cc;
    this.saldo = saldo;
  }

  public String getContaCorrente() {
    return contaCorrente;
  }

  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }


  @Override
  public String toString() {
    return "Conta Corrente: " + this.contaCorrente + " | Saldo R$: " + this.saldo;
  }
}
