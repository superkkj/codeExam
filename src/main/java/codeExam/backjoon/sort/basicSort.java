package codeExam.backjoon.sort;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


// https://www.acmicpc.net/problem/2750

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

// 버블정렬  시간 복잡도는 O(n²) 인접한 원소끼리 비교하여 교환하는 방식
// 선택정렬  시간 복잡도는 O(n²) 최솟값을 찾아서 맨 앞으로 이동하는 방식 메모리가 제한적인 경우에 사용하면 좋음
// 삽입정렬  시간 복잡도는 O(n²) 최고는 O(n) 앞에서부터 차례대로 이미 정렬된 부분과 비교하여 교환하는 방식
// 셋 중에 제일 빠르지만 배열이 길어질수록 효율성이 떨어짐 메모리가 제한적인 경우에 사용하면 좋음


public class basicSort {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Set<Integer> set = new HashSet<>();

        int str = sc.nextInt();

        for(int i=0; i<str; i++){
            set.add(sc.nextInt());
        }

        set.stream().sorted()
                .forEach(System.out::println);
    }
}
