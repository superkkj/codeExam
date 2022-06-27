package codeExam.hash.marathon;

import java.util.Arrays;
import java.util.HashMap;

public class notFinishRunner {

    public static String solution(String[] participant, String[] completion) {
        String answer = "";


        Arrays.sort(participant);
        Arrays.sort(completion);

        HashMap<String, Integer> paticipant = new HashMap<>();


        for (String s : participant) {
            paticipant.put(s, 0);
        }

        for (String s : completion) {
            paticipant.put(s, 1);
        }


        for (String s : participant) {
            if (paticipant.get(s) == 0) {
                answer = s;
            }
        }

        return answer;
    }
}
