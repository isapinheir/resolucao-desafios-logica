// Teste de seleção 1
// 18/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		int A, B, C, D, aceito;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		aceito = 0;
		
		if(B > C)
		if(D > A)
		if((C + D) > (A + B))
		if(C > 0 && D > 0)
		if(A % 2 == 0)
			aceito = 1;
		if(aceito == 1)
			System.out.printf("Valores aceitos\n");
		else
			System.out.printf("Valores nao aceitos\n");
	}
}