package codeExam.backjoon.math;

import java.util.Scanner;


//https://www.acmicpc.net/problem/2292




//입력
//        첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
//
//        출력
//        입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
//
//        예제 입력 1
//        13
//        예제 출력 1
//        3

public class beehouse {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int input = sc.nextInt();


        int result = 2;
        int start = 2;
        int end = 0;

        int startPlus = 6;
        int endPlust = 5;


        if (input == 1) {
            System.out.println(1);
            return;
        }


        for (int i = 0; i < input; i++) {

            start = start + startPlus * i;
            end = start + endPlust + (startPlus * i);

            if (start <= input && input <= end) {
                System.out.println(result + i);
                break;
            }
        }

    }
}
