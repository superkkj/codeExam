package codeExam.backjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


//https://www.acmicpc.net/problem/2798
public class BlackJAck {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

//        int N = Integer.parseInt(String.valueOf(br.readLine()));
        int N = sc.nextInt();
        int max = sc.nextInt();
//        int max = Integer.parseInt(String.valueOf(br.readLine()));



        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        int aa = 0;

        for (int i = 0; i < list.size()-2; i++) {
            for (int j = i+1; j < list.size() - 1; j++) {
                for (int k = j+1; k < list.size() ; k++) {
                    aa = list.get(i) + list.get(j) + list.get(k);
                    if (aa > max) {
                        continue;
                    }else{
                        result.add(aa);
                    }
                }
            }
        }


        Collections.sort(result, Collections.reverseOrder());

        System.out.println(result.get(0));


    }
}
