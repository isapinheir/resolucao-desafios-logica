// Produto Simples
// 10/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int A, B, PROD;
        A = input.nextInt();
        B = input.nextInt();
        PROD = A * B;
        System.out.println("PROD = "+PROD);
    }
    
}