/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author ensar
 */import java.util.Scanner;
public class or111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        int N,T1,T2,T3;
        System.out.println("Fibonacii Serisi");
        System.out.print("Terim Sayısı: ");
        N=input.nextInt();
        T1=1;
        T2=1;
        System.out.print("\n" +T1+"\t"+T2+"\t");
        
        for(int i=1;i<=N-2;i++) {
            T3=T1+T2;
            System.out.print(T3+"\t");
            T1=T2;
            T2=T3;
        }
                    
    }
    
}
