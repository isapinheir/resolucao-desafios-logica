// Jogo Dos Copos - III Maratona Beecrowd 22-26/05

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int qtdmov = input.nextInt();
        char moeda = input.next().charAt(0);

        for (int i = 0; i < qtdmov; i++){
            int mov = input.nextInt();
            switch(mov){
            case 1:
                if (moeda == 'A')
                    moeda = 'B';
                else if (moeda == 'B')
                    moeda = 'A';
            break;
            case 2:
                if (moeda == 'B')
                    moeda = 'C';
                else if (moeda == 'C')
                    moeda = 'B';
            break;
            case 3:
                    if (moeda == 'A')
                        moeda = 'C';
                    else if (moeda == 'C')
                        moeda = 'A';
            break;
            }
        }
    System.out.println(moeda);
    }
}