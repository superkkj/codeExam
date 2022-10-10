package codeExam.backjoon.lecture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2309
public class sevenShort {

        static StringBuilder sb = new StringBuilder();

        public static void main(String[] args) throws IOException {


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Scanner sc = new Scanner(System.in);

//        int N = Integer.parseInt(String.valueOf(br.readLine()));
//        int N = Integer.parseInt(sc.nextLine());
//        int max = Integer.parseInt(String.valueOf(br.readLine()));


            List<Integer> list = new ArrayList<>();


            for (int i = 0; i < 9; i++) {
                list.add(sc.nextInt());
            }

            int sum = 0;
            for(int a : list){
                sum += a;
            }
            boolean stop = false;

            for(int i=0; i<list.size()-1; i++){
                if(!stop){
                    for(int j=i+1; j<list.size(); j++){
                        if(sum -(list.get(i)+list.get(j)) == 100){
                            list.remove(j);
                            list.remove(i);
                            stop = true;
                            break;
                        }
                    }
                }

            }

            Collections.sort(list);



            for(int a : list){
                System.out.println(a);
            }

        }


}
