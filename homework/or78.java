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
public class or78 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("Terim sayısı giriniz: ");
        int n=input.nextInt();
        double c=1;
        for(int k=1;k<n;k++){
            double c1;
            c1=4*k*k;
            c=c*c1/(c1-1);
        }
        double sonuc=2*c;
        System.out.println(sonuc);
    }
    
}
