// if/else

import java.util.Scanner;

public class Pratica07 {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Digite o valor da nota1: ");
        nota1 = entradaDados.nextDouble();
        System.out.println("Digite o valor da nota2: ");
        nota2 = entradaDados.nextDouble();
        System.out.println("Digite o valor da nota3: ");
        nota3 = entradaDados.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O aluno está aprovado: " + media);
        } else {
            System.out.println("O aluno está reprovado: " + media);
        }
    }
}
