// Conversão de tempo
// 24/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        int evento = input.nextInt();
        int horas = (evento / 3600);
        int minutos = ((evento % 3600) / 60);
        int segundos = (evento % 60);

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }

}