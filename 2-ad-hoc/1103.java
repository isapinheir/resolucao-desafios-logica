// Alarme Despertador
// 21/06/26

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        int h1, m1, h2, m2;

        while (true){
            h1 = input.nextInt();
            m1 = input.nextInt();
            h2 = input.nextInt();
            m2 = input.nextInt();

            if (h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) {
                break;
            }

            int inicio = (h1 * 60) + m1;
            int fim = (h2 * 60) + m2;
            
            int dormir = 0;

            if (fim > inicio) { // se o alarme for para o mesmo dia
                dormir = fim - inicio;
            } else { // se for para o dia seguinte
                dormir = (1440 - inicio) + fim;
            }

            System.out.println(dormir);
        }
        
        input.close();
    }
}
