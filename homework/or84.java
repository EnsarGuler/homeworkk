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
public class or84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("ilk uzunluk: ");
        int a=input.nextInt();
        double b;
        b=a*(1+Math.pow(5,(1/2))/2);
        System.out.println(a+"-"+b+"-"+b);
        
    }
    
}
