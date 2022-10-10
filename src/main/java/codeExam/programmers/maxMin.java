package codeExam.programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/12939
public class maxMin {


    public String solution(String s) {

        List<Integer> list = new ArrayList<>();

        String answer = s;


        for(int i =0; i<answer.split(" ").length; i++){
            list.add(Integer.parseInt(answer.split(" ")[i]));
        }
        Collections.sort(list);

        answer = list.get(0) + " " + list.get(list.size()-1);
        return answer;
    }
}


//    public String getMinMaxString(String str) {
//        String[] tmp = str.split(" ");
//        int min, max, n;
//        min = max = Integer.parseInt(tmp[0]);
//        for (int i = 1; i < tmp.length; i++) {
//            n = Integer.parseInt(tmp[i]);
//            if(min > n) min = n;
//            if(max < n) max = n;
//        }
//
//        return min + " " + max;
//
//    }
