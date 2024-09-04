import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

        int valor;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        System.out.println("O resultado da divisão é: " + valor / 2);
        System.out.println("O resto da divisão é: " + valor % 2);

    }

    class IncreDecre {
        public static void main(String[] args) {

            int incre, decre;
            incre = 10;
            decre = 10;
            System.out.println(incre);
            System.out.println(decre);

            incre++;
            decre--;

            System.out.println(incre);
            System.out.println(decre);
        }
    }
}
