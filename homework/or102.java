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
public class or102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner (System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = input.nextInt();
        for (int a=1;a<=n;a++){
            System.out.println(a);
            System.out.println(a+1);
        }
            
    }
    
}
