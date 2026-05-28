// Soma de ímpares consecutivos. Maratona Beecrowd 21-23/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
  
    int x = input.nextInt();
    int y = input.nextInt();
    int sum = 0;
    int min, max;

    if (x < y) { 
        min = x;
        max = y;
    } 
    else {
        min = y;
        max = x;
    }
  
    for(int i = min + 1; i < max; i++ ){
        if (i % 2 != 0) {
        sum += i;
        }
    }

    System.out.println(sum);

    }
}