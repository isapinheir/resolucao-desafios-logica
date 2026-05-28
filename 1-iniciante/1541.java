// Construindo Casas. II Maratona Beecrowd 20-21/04/26

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            while (sc.hasNextInt()) {
                int A = sc.nextInt();
                int B = sc.nextInt();
                int C = sc.nextInt();
                
                if (A == 0 && B == 0 && C == 0) {
                    break;
                }
                
                int lado = (int) Math.sqrt((A * B * 100.0) / C);
                System.out.println(lado);
            }
        } catch (Exception e) {
            
        } finally {
            sc.close();
        }
    }
}
