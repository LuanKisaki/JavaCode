import java.util.Scanner;

public class Pratica12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < 10; i++) {
            num++;
                System.out.print(num);
            if(num != 10){
                System.out.print(", ");
            }
        }
    }
}
