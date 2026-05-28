// Bem-vindos e Bem-vindas ao Inverno! II Maratona Beecrowd 20-21/04/26

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T1 = sc.nextInt();
        int T2 = sc.nextInt();
        int T3 = sc.nextInt();
        
        if (T2 > T1) {
            if (T3 > T2) {
                if ((T3 - T2) >= (T2 - T1)) {
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            } else {
                System.out.println(":(");
            }
        } else if (T2 < T1) {
            if (T3 < T2) {
                if ((T2 - T3) >= (T1 - T2)) {
                    System.out.println(":(");
                } else {
                    System.out.println(":)");
                }
            } else {
                System.out.println(":)");
            }
        } else {
            if (T3 > T2) {
                System.out.println(":)");
            } else {
                System.out.println(":(");
            }
        }
        
        sc.close();
    }
}
