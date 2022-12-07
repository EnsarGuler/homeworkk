
package homework;

import java.util.Scanner;

public class or89 {

    public static boolean asal(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (asal(n)) {
            if (asal(n + 2)) {
                System.out.print("Chen assalı");
            } else {
                System.out.println("Chen asalı değildir" + n);
            }
        } else {
            System.out.println("Chen asalı değildir" + n);
        }
    }

}
