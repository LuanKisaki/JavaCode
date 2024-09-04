public class Pratica16 {
    public static void main(String[] args) {

//        opção 01
//        int matriz[][],i,j;
//        matriz = new int[2][2];

////      opção 02
////      int[][] matriz = new int[2][2];

//        matriz[0][0] = 1;
//        matriz[0][1] = 2;
//        matriz[1][0] = 3;
//        matriz[1][1] = 4;

//        System.out.println(matriz[0][0]);
//        System.out.println(matriz[0][1]);
//        System.out.println(matriz[1][0]);
//        System.out.println(matriz[1][1]);

        int matriz[][]= {{1,2},{3,4}};
        int i, j;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
