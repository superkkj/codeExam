package codeExam.programmers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/70129#
public class binarayFor {


    public static void main(String[] args) throws IOException {

        int aCnt = 0;
        int[] answer = {};
        String s = "110010101001";
        int x = 0;
        while (!s.equals("1")) {
            aCnt += cntZero(s);
            s = s.replaceAll("0", "");
            s = toBinaray(s.length());
            x++;
        }


        answer = new int[2];
        answer[0] = x;
        answer[1] = aCnt;
    }

    private static int cntZero(String s) {
        char[] chars = s.toCharArray();
        int z = 0;
        for (char c : chars) {
            if (c == '0') {
                z++;
            }
        }
        return z;
    }

    private static String toBinaray(int number) {
        System.out.println("binary");
        List<Integer> list = new ArrayList<Integer>();
        while (number > 0) {
            list.add(number % 2);
            number = number / 2;
        }
        Collections.reverse(list);
        String collect = list.stream()
                .map(Object::toString)
                .collect(Collectors.joining());
        return collect;

    }

}
