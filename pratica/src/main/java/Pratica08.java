// Switch/case

import java.util.Scanner;

public class Pratica08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Você digitou 1");
                break;
            case 2:
                System.out.println("Você digitou 2");
                break;
            case 3:
                System.out.println("Você digitou 2");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}
