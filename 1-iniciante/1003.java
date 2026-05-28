// Soma Simples
// 10/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int A, B, SOMA;
        A = input.nextInt();
        B = input.nextInt();
        SOMA = A * B;
        System.out.println("SOMA = "+SOMA);
    }
    
}