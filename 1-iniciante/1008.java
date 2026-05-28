// Salário
// 05/03/26

import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        
        int numero = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        float salarioHora = input.nextFloat();
        float salarioTotal = (horasTrabalhadas * salarioHora);

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f\n", salarioTotal);
    }

}