import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantity of rows: ");
        int h = input.nextInt();
        System.out.println("Quantity of columns: ");
        int w = input.nextInt();
        System.out.println("A constant number a: ");
        int a = input.nextInt();

        double S = 0;

        if ((h > 0) && (w > 0)) {
            int[][] B = new int[w][h];
            for (int i = 0; i < B.length; i++){
                int bl = B[i].length;
                for (int j = 0; j < bl; j++) {
                    B[i][j] = (int) (Math.random() * 10);
                }
            }
            System.out.println("Initial matrix:");
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println(" ");
            }
            int[][] C = B.clone();
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[i].length; j++) {
                    C[i][j] *= a;
                }
            }
            System.out.println("\nFirst step done:\n");
            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    System.out.print(C[i][j] + " ");
                }
                System.out.println(" ");
            }

            for (int i = 0; i < C.length; i++) {
                int cl = C[i].length;
                for (int j = 0; j < cl; j++){
                    S += C[i][j];
                }
                S /= cl;
                System.out.println("The average of the row " + i + " is " + S);
            }
        }
    }
}