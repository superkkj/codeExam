package codeExam.hash.marathon;

import java.util.Arrays;
import java.util.HashMap;

public class notFinishRunner {

    public static String solution(String[] participant, String[] completion) {

        // 완주 못한 선수 담을 변수.
        String answer = "";

        HashMap<String,Integer> hashMap = new HashMap<>();

        //해쉬맵에 담지만 중복인 사람은 +1 씩 증가시켜준다.
        for(String s : participant){
            if(hashMap.get(s) != null){
                hashMap.put(s,hashMap.get(s) + 1);
            }else {
                hashMap.put(s,1);
            }
        }


        //완주한사람들은 기본 테이블에 -1 씩해줘서 값을 0으로 만든다.
        for (String s : completion){
            hashMap.put(s, hashMap.get(s) -1);
        }


        // 0이 아닌사람은 완주하지못한것으로 판정
        for(String s : participant){
            if(hashMap.get(s) != 0){
                answer = s;
                break;
            }
        }

        return answer;
    }
}
