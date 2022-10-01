package codeExam.backjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// basic 정렬 2번째
// 카운팅 정렬 응용 OR sort 정렬 사용하기.
// https://st-lab.tistory.com/106 참고

public class CollectionSort {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        List<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());


        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append('\n');
        }

        System.out.println(sb);
    }
}



//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    StringBuilder sb = new StringBuilder();
//
//    /*
//      -1000000 ~ 1000000
//      기준점 0 = index 100000 으로 생각
//    */
//    boolean[] arr = new boolean[2000001];
//
//    int N = Integer.parseInt(br.readLine());
//
//
//        for (int i = 0; i < N; i++) {
//        arr[Integer.parseInt(br.readLine()) + 1000000] = true;
//        }
//
//
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i]) {
//        sb.append((i - 1000000)).append('\n');
//        }
//        }
//        System.out.println(sb);
//        }
//        }
