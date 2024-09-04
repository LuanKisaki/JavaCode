import java.util.Scanner;

public class Pratica14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String matricula, nome, situacao, turma;
        double teste, prova, media;

        System.out.println("Digite a turma: ");
        turma = scanner.next();

        for (int i = 0; i < 3; i++) {
            System.out.println("______________");

            System.out.println("Digite a matricula: ");
            matricula = scanner.next();
            System.out.println("");

            System.out.println("Digite o nome: ");
            nome = scanner.next();
            System.out.println("");

            System.out.println("Agora digite o teste: ");
            teste = scanner.nextDouble();
            System.out.println("");

            System.out.println("Digite a prova: ");
            prova = scanner.nextDouble();
            System.out.println("");

            media = (teste + prova)/2;

            System.out.println("Média: "+ media);
        }
    }
}
