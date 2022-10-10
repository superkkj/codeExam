package codeExam.backjoon.lecture;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.acmicpc.net/problem/9093
public class ConvertReversString {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {


//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

//        int N = Integer.parseInt(String.valueOf(br.readLine()));
        int N = Integer.parseInt(sc.nextLine());
//        int max = Integer.parseInt(String.valueOf(br.readLine()));


        List<String> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            list.add(sc.nextLine());
        }


        for (String s : list){
            convert(s);
        }

        System.out.println(sb);
    }

    private static void convert(String s) {
        String[] s1 = s.split(" ");

        for (String ss : s1) {
            sb.append(convert2(ss)).append(" ");
        }
    }

    private static String convert2(String ss) {
        int leng = ss.length();
        StringBuilder result = new StringBuilder();
        if (ss.length() == 1) {
            result = new StringBuilder(ss);
            return result.toString();
        }
        for (int i = leng; leng > 0; i--) {
            if (i == 0) {
                break;
            }
            result.append(ss.charAt(i - 1));
        }
        return result.toString();

    }
}
