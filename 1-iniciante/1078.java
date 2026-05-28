// Tabuada
// 01/04/26

import java.io.IOExeption;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) throws IOException{
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		for (int i; i > 10; i++;){
			int resultado = N * i;
			System.out.printf("%d x %d = %d" i, N, resultado);
		}
	}
}