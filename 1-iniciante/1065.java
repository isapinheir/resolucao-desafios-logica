// Pares entre cinco números. Maratona Beecrowd 21-23/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    int nPares = 0;

    for (int nVezes = 0; nVezes < 5; nVezes++) {

        int value = input.nextInt();

        if(value % 2 == 0){
            nPares++;
        }

    }

    System.out.printf("%d valores pares\n", nPares);
    
    }
}