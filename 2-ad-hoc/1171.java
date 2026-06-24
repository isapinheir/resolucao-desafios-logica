// Frequência de Números
// 24/06/26

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[]args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x[] = new int[2001];
        int n = 0;
        int qtd = input.nextInt();

        for(int i = 0; i < qtd; i++){
            n = input.nextInt();
            x[n] += 1;
        }
        for(int i = 1; i < x.length; i++){
            if(x[i] != 0){
                System.out.printf("%d aparece %d vez(es)\n", i, x[i]);
            }
        }
    }
}