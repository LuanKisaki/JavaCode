// autoincrement pós e pré fixado

public class Pratica03 {
    public static void main(String[] args){
        int num1,num2;
        num1 = 2;
        num2 = 2;

        System.out.println(num1);
        System.out.println(num2);
        num1++;
        num2++;
        System.out.println(num1);
        System.out.println(num2);
        // prefixado
        System.out.println(++num1);
        System.out.println(++num2);
        // pos-fixado
        System.out.println(num1++);
        System.out.println(num2++);
    }
}
