package codeExam.backjoon.math;

import java.util.Scanner;


//https://www.acmicpc.net/problem/1193

public class searchFountain {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        boolean out = false;

        int count = 1;

        if (input == 1) {
            System.out.println(1 + "/" + 1);
        }
        if (input == 2) {
            System.out.println(1 + "/" + 2);
        }


        for (int i = 1; i < input; i++) {

            if (out) {
                break;
            }
            for (int j = 0; j < i; j++) {

                if (i % 2 != 0) {
                    if (count == input) {
                        System.out.println((i - j) + "/" + (j + 1));
                        out = true;
                        break;
                    }
                } else {
                    if (count == input) {
                        System.out.println((j + 1) + "/" + (i - j));
                        out = true;
                        break;
                    }
                }
                count++;
            }
        }
    }
}
