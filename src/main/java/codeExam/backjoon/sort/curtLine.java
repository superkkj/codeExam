package codeExam.backjoon.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


// https://www.acmicpc.net/problem/25305

public class curtLine {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int cnt = sc.nextInt();
        int last = sc.nextInt();

        List<Integer> list = new ArrayList<>();


        for (int i =0; i<cnt; i++){
            list.add(sc.nextInt());
        }

        List<Integer> collect = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());


        System.out.println(collect.get(last-1));


    }




}
