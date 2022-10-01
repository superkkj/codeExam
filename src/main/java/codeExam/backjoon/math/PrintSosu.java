package codeExam.backjoon.math;

import java.util.Scanner;

//https://www.acmicpc.net/problem/11653
// 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

public class PrintSosu {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();
        if(str != 1){
            checkSosu(str);
        }
    }

    private static void checkSosu(int num) {


        for (int j = 2; j <= num; j++) {
            if (num % j == 0) {
                num = num/j;
                System.out.println(j);
                j= 1;

            }
        }

    }
}
