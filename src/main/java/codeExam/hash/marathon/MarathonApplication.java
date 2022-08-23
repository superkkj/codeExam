package codeExam.hash.marathon;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarathonApplication {

    public static void main(String[] args) {
        String answer = notFinishRunner.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println(answer + "는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.");

    }

}
