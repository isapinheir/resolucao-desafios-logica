// Fórmula de Bhaskara
// 21/03/26	

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
    	
    	double A = input.nextDouble();
    	double B = input.nextDouble();
    	double C = input.nextDouble();

    	double B2 = Math.pow(B, 2);
		double delta = (B2 - (4 * A * C));		

		double raiz = Math.sqrt(delta);
			if (B < 0)
				B = B * 1;
			else
				B = B * -1;

		double R1 = ((B + raiz) / (2 * A));
		double R2 = ((B - raiz) / (2 * A));

		if (delta <= 0 || A == 0 || B == 0 || C == 0){
			System.out.printf("Impossivel calcular\n");
		}
		else{
			System.out.printf("R1 = %.5f\n", R1);
			System.out.printf("R2 = %.5f\n", R2);
		}
		
	}
}