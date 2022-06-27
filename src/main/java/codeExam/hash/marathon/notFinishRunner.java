package codeExam.hash.marathon;

import java.util.Arrays;
import java.util.HashMap;

public class notFinishRunner {

    public static String solution(String[] participant, String[] completion) {

        // 완주 못한 선수 담을 변수.
        String answer = "";


        //참가자 키값  , value를 담을 해쉬맵선언
        HashMap<String, Integer> paticipant = new HashMap<>();


        //참가자들 값을 0으로 셋팅
        for (String s : participant) {
            paticipant.put(s, 0);
        }

        //완주한 자들을 값을 1로 셋팅
        for (String s : completion) {
            paticipant.put(s, 1);
        }


        // 완주를 못한 사람은 1로 셋팅되지 않기 때문에..
        for (String s : participant) {
            if (paticipant.get(s) == 0) {
                answer = s;
            }
        }

        return answer;
    }
}
