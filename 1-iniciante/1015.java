// Distância entre dois pontos
// 24/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String []args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x = (x2 - x1);
		double y = (y2 - y1);
		x = (x * x);
		y = (y * y);

		double soma = (x + y);
		double distancia = Math.sqrt(soma);

		System.out.printf("%.4f\n", distancia);
    }
}