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
public class or104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            for (int k = 1; k <= 50; k++) {
                for (int j = 1; j <= 50; j++) {
                    if (i * i + k * k + j * j == 3 * i * k * j) {
                        System.out.println(i + "-" + k + "-" + j);
                    }
                }
            }
        }
    }

}
