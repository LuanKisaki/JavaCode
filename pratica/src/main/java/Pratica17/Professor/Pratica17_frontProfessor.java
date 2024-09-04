package Pratica17.Professor;


import java.util.Scanner;

public class Pratica17_frontProfessor {
  public static void main(String[] args) {
//obs:criar um objeto com o mesmo nome da classe porém com a letra
//    inicial minúscula é um boa prática adotada pela comunidade
//    Aluno aluno = new Aluno();
    Pratica17_SalarioProfessor salarioProfessor = new Pratica17_SalarioProfessor();
    Scanner scanner = new Scanner(System.in);
//    Professor

    System.out.println("________ Professor _____________");
    salarioProfessor.setNome("Kisaki");
//    salarioProfessor.salario = 8500;
//    salarioProfessor.setSalario(8500);

    salarioProfessor.setNome(scanner.next());
    salarioProfessor.setSalario(scanner.nextInt());

    System.out.println("Nome do professor: "+salarioProfessor.getNome());
    System.out.println("Salário do professor: "+salarioProfessor.getSalario());
    System.out.println("Inss pago: "+salarioProfessor.getInss());
    System.out.println("Salário Liquído do professor: "+salarioProfessor.getSalarioLiquido());
  }
}
