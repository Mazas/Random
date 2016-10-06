package tadas.ivanauskas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of primes ");
        int count2 = in.nextInt();
        int i = 1;
        int count = 0;
        while (count2 > 0) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
                count2--;
            } else {
                count = 0;
            }
            i++;
        }
    }
}

