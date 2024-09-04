import java.util.Scanner;

public class Pratica09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Grade = scanner.next();
        switch (Grade) {
            case "A":
                System.out.println("Você é funcionário da categoria A.");
                System.out.println("Seu bônus:" + 2000);
                break;

            case "B":
                System.out.println("Você é funcionário da categoria B.");
                System.out.println("Seu bônus:" + 1000);
                break;

            case "C":
                System.out.println("Você é funcionário da categoria C.");
                System.out.println("Seu bônus:" + 500);
                break;

            default:
            System.out.println("Você é funcionário padrão.");
            System.out.println("Seu bônus:" + 100);
            break;

        }
    }
}
