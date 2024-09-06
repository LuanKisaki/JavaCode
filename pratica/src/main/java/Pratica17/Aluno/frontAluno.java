package Pratica17.Aluno;


import java.util.Scanner;

public class frontAluno {
  public static void main(String[] args) {
//obs:criar um objeto com o mesmo nome da classe porém com a letra
//    inicial minúscula é um boa prática adotada pela comunidade
//    Aluno aluno = new Aluno();
    Scanner scanner = new Scanner(System.in);
    AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
    AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();

//    Não é seguro configurar o "objeto.nome" diretamente fora da classe
//    para isso, na classe ("Aluno") se usa o this.
//    para referir-se ao objeto que só então pode ser acessado.

//    objeto.nome = "Luan";
//    objeto.notaTeste = 9;
//    objeto.notaProva = 9.5;

//     Aluno

    System.out.println("________ Aluno _____________");
    System.out.println("______ Ensino Médio ___________");
//    alunoEnsinoMedio.setNome("Luan");
//    alunoEnsinoMedio.setNotaTeste(9);
//    alunoEnsinoMedio.setNotaProva(6);

    alunoEnsinoMedio.setNome(scanner.next());
    alunoEnsinoMedio.setNotaTeste(scanner.nextInt());
    alunoEnsinoMedio.setNotaProva(scanner.nextInt());

    System.out.println("Nome do aluno médio: "+ alunoEnsinoMedio.getNome());
    System.out.print("Nota do teste: "+ alunoEnsinoMedio.getNotaTeste()+" |");
    System.out.println("Nota da prova: "+ alunoEnsinoMedio.getNotaProva()+".");

    System.out.println("Média do aluno médio: "+ alunoEnsinoMedio.getMedia());

    System.out.println("______ Ensino Superior ___________");
//    alunoEnsinoSuperior.setNome("Luan");
//    alunoEnsinoSuperior.setNotaTeste(9);
//    alunoEnsinoSuperior.setNotaProva(6);
    alunoEnsinoSuperior.setNome(scanner.next());
    alunoEnsinoSuperior.setNotaTeste(scanner.nextInt());
    alunoEnsinoSuperior.setNotaProva(scanner.nextInt());

    System.out.println("Nome do aluno superior: "+ alunoEnsinoSuperior.getNome());
    System.out.print("Nota do teste: "+ alunoEnsinoSuperior.getNotaTeste()+" |");
    System.out.println("Nota da prova: "+ alunoEnsinoSuperior.getNotaProva()+".");

    System.out.println("Média do aluno superior: "+ alunoEnsinoSuperior.getMedia());

    }
}
