// Um-Dois-Três - III Maratona Beecrowd 22-26/05

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int numPalavras = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numPalavras; i++) {
            String palavraEscrita = input.nextLine();
            char[] palavra = palavraEscrita.toCharArray();
            int escrito = 0;

            if (palavra.length == 5) { 
                escrito = 3;
            } 
            else {
                int um = 0;
                if (palavra[0] == 'o') um++;
                if (palavra[1] == 'n') um++;
                if (palavra[2] == 'e') um++;

                if (um >= 2) {
                    escrito = 1;
                } else {
                    escrito = 2;
                }
            }
            System.out.println(escrito); 
        }
        input.close();
    }
}
