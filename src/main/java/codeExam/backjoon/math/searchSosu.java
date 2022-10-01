package codeExam.backjoon.math;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// https://www.acmicpc.net/problem/1978
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

public class searchSosu {



        static int cnt = 0;

        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            int str = sc.nextInt();


            List<Integer> list = new ArrayList<>();


            for (int i = 0; i < str; i++) {
                list.add(sc.nextInt());
            }

            int size = list.size();
            for (int i = 0; i < size; i++) {

                checkSosu(list.get(i));
            }
            System.out.println(cnt);
        }

        private static void checkSosu(int num) {
            int val = 0;


            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    val++;
                }
            }

            if (val == 2) {
                cnt++;
            }
        }
}
