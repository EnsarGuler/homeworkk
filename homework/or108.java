/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ensar
 */
import java.util.Scanner;

public class or108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        double m = input.nextDouble();
        System.out.println("Lütfen bir sayı giriniz: ");
        double n = input.nextDouble();
        double t = (double) Math.pow(n + 1, m);
        for (int i = 1; i <= n; i++) {
            int f1 = 1;
            int f2 = 1;
            int f3 = 1;
            for (int k = 1; k <= m + 1; k++) {
                f1 *= k;

            }
            for (int j = 1; j <= i; j++) {
                f2 *= j;

            }
            for (int h = 1; h <= m + 1 - i; h++) {
                f3 *= h;

            }
            int c = f1 / (f2 * f3);
            t += Math.pow((-1), i) * c * Math.pow(n + 1 - i, m);

        }
        System.out.println(t);

    }

}
