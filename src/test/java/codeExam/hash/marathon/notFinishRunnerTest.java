package codeExam.hash.marathon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

@SpringBootTest
class notFinishRunnerTest {

    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion  = {"josipa", "filipa", "marina", "nikola"};

    @Test
    void marathonTest() {

        HashMap<String,Integer> paticipant = new HashMap<>();


        for(String s : participant){
            paticipant.put(s,0);
        }

        for (String s : completion){
            paticipant.put(s, 1);
        }



        for(String s : participant){
            System.out.println(s);
            if(paticipant.get(s) == 0){
                System.out.println(s+"는 참여자 명단에 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.");
            }
        }

    }
}

