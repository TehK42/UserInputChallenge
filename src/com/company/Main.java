package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum = 0;
        int count = 1;

        Scanner scan = new Scanner(System.in);

        while(count <= 10) {
            System.out.println("Enter number #" + count + ":");
            boolean valid = scan.hasNextInt();
            if(valid) {
                int num = scan.nextInt();
                sum += num;
//                System.out.println(sum);
                count++;
            } else {
                System.out.println("Invalid Value");
            }
            scan.nextLine();
        }
        scan.close();

        System.out.println("Sum = " + sum);
    }
}
