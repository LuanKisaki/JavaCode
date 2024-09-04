import java.util.Scanner;

public class Pratica13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        int quantidadeAlunos;

        System.out.println("Quantos Alunos você possui? ");
        quantidadeAlunos = scanner.nextInt();

        for (int aluno = 1; aluno <= quantidadeAlunos; aluno++) {
            System.out.println("_________________");
            System.out.println("Aluno " + aluno);
            System.out.println("Digite a nota 1: ");
            nota1 = scanner.nextDouble();
            System.out.println("Digite a nota 2: ");
            nota2 = scanner.nextDouble();
            media = (nota1 + nota2) / 2;

            System.out.println("Média: " + media);
        }
    }
}
