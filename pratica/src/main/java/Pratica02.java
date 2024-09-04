// entrada/saída de dados;

import java.util.Scanner;

public class Pratica02 {

    public static void main(String[] args){
        int valor = 15;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();
        System.out.println(valor);
    }
}
