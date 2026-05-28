// Quadrado de pares
// 01/04/2026

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i < N; i++){
            if(i % 2 == 0){
                double quadrado;
                quadrado = Math.pow(i, 2);
                System.out.printf("%d^2 = %.0f\n", i, quadrado);
            }
        }
    }
}