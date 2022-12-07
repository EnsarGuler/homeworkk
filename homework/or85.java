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
public class or85 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("Doğru parçası uzunluğu");
        int u= input.nextInt();
        double b;
        double a;
        b=u/(2+Math.pow(2,5));
        a=u-b;
        System.out.println(a+" ,  "+b);
    }
    
}
