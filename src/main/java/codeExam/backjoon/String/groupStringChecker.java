package codeExam.backjoon.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


//그룹 단어 체커
//https://www.acmicpc.net/problem/1316

//그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
//       예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
//       aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

//     단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
public class groupStringChecker {

    private static List<String> list = new ArrayList<>();
    private static HashMap<Character, Integer> map = new HashMap<>();
    private static int count = 0;
    private static int notCount = 0;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int str = sc.nextInt();
        if (str > 100) {
            throw new IllegalArgumentException("100보다 크면 안돼요");
        }


        for (int i = 0; i < str; i++) {
            list.add(sc.next());
        }


        for (String s : list) {
            findDuplicate(s);
            map.clear();
        }

        System.out.println(str - count);

    }


    private static void findDuplicate(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                if (map.get(chars[i]) + 1 != i) {
                    count++;
                    break;
                } else {
                    map.replace(chars[i], i);
                }
            } else {
                map.put(chars[i], i);
            }
        }
    }

}