// Seis números ímpares
// 01/04/2026

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();

        for (int i = 0; i < 12; i++){
            if (X % 2 != 0){
                System.out.printf("%d\n", X);
            }
        X++;
        }
    }
}