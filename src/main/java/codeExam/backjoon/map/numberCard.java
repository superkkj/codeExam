package codeExam.backjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// https://www.acmicpc.net/problem/10815
// 이분탐색법으로 풀수잇음
public class numberCard {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();

        List<Integer> list = new ArrayList<>();

//        int N = Integer.parseInt(String.valueOf(br.readLine()));
        int N = sc.nextInt();


        for (int i = 0; i < N; i++) {
            map.put(sc.nextInt(),i);
        }

        int M = sc.nextInt();

        for (int i = 0; i < M; i++) {
            if(map.get(sc.nextInt()) != null){
                list.add(1);
            }else{
                list.add(0);
            }
        }
//        int max = Integer.parseInt(String.valueOf(br.readLine()));








        for (int a : list){
            System.out.print(a+ " ");
        }



    }
}
