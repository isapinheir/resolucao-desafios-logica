// Cálculo Simples

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in); 

        int cod1 = input.nextInt();
        int num1 = input.nextInt();
        float val1 = input.nextFloat();
        int cod2 = input.nextInt();
        int num2 = input.nextInt();
        float val2 = input.nextFloat();
        
        float preco1 = (num1 * val1);
        float preco2 = (num2 * val2);
        float valorTotal = (preco1 + preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);
    }

}