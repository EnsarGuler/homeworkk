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

public class or100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int t = 0;
        System.out.println("Kontrol edilecek sayıyı giriniz");
        int x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                t = t + i;
            }
        }
        if (t < 2 * x) {
            System.out.println(x + " eksik sayıdır ve eksiklik miktarı " + (2 * x - t) + "'dir.");
        } else {
            System.out.println(x + " Eksik sayı değildir");
        }
    }

}
