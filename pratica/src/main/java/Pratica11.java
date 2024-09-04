import java.util.Scanner;

public class Pratica11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("--------------------------");
            System.out.println("Criando um menu principal.");
            System.out.println("Selecione uma das opções abaixo.");
            System.out.println("1-Aluno.");
            System.out.println("2-Professor.");
            System.out.println("3-Coordenador.");
            System.out.println("0-Sair.");

            System.out.println("Qual opção você deseja?");
            option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Encerrando o programa.");
                break;
            }
            switch (option) {
                case 1:
                    System.out.println("Você selecionou a opção Aluno.");
                    break;
                case 2:
                    System.out.println("Você selecionou a opção Professor.");
                    break;
                case 3:
                    System.out.println("Você selecionou a opção Coordenador.");
                    break;
                default:
                    System.out.println("Você selecionou uma opção inválida.");
                    break;
            }
        }
        while (true);
        System.out.println("Fim");
    }
}

