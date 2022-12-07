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
public class or93 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("N sayısı giriniz: ");
        int n=input.nextInt();
        System.out.println("Cullen sayılar:");
        for (int i=1;i<n;i++)
            System.out.println(i*Math.pow(2,i)+1);
    }
    
}
