// PUM
// 01/04/2026

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int numero = 1;

        for(int fil = 1; fil <= N; fil++){
            for(int i = 1; i <= 3; i++){
                System.out.printf("%d ",numero);
                numero++;
            }
            System.out.println("PUM");
            numero++;
        }
    }
}