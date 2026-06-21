// Experiências

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = 0, quant = 0, quantC = 0, quantR = 0, quantS = 0, quantTotal = 0;
        float percentualC = 0, percentualR = 0, percentualS = 0;

        N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            quant = input.nextInt();
            quantTotal += quant;
            char tipo = input.next().charAt(0);

            if (tipo == 'C')
                quantC += quant;
            if (tipo == 'R')
                quantR += quant;
            if (tipo == 'S')
                quantS += quant;
        }
        
        percentualC = ((float) quantC / quantTotal) * 100;
        percentualR = ((float) quantR / quantTotal) * 100;
        percentualS = ((float) quantS / quantTotal) * 100;

        System.out.printf("Total: %d cobaias\n", quantTotal);
        System.out.printf("Total de coelhos: %d\n", quantC);
        System.out.printf("Total de ratos: %d\n", quantR);
        System.out.printf("Total de sapos: %d\n", quantS);
        
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualC);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualR);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualS);
    }
}