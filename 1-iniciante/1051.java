// Imposto de Renda. Maratona Beecrowd 21-23/03/26.

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        double renda, imposto;
        renda = input.nextDouble();
        imposto = 0;

        if (renda > 2000.01){

            if (renda > 4500){
                imposto += ((renda - 4500) * 0.28);
                renda = 4500;
            }
            if (renda > 3000.00 && renda < 4500.01){
                imposto += ((renda - 3000) * 0.18);
                renda = 3000;
            }
            if (renda > 1000.00 && renda < 3000.01){
                imposto += ((renda - 2000) * 0.08);
            }
            System.out.printf("R$ %.2f\n", imposto);
        }
        else{
            System.out.printf("Isento\n");

        }
    }
}