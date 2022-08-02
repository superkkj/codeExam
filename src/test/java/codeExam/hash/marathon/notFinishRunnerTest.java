package codeExam.hash.marathon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class notFinishRunnerTest {

//    String[] participant = {"mislav", "stanko", "mislav", "ana"};
//    String[] completion  = {"stanko", "ana", "mislav"};

//    String[] participant = {"leo", "kiki", "eden"};
//    String[] completion  = {"kiki", "eden"};

    String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] completion = {"josipa", "filipa", "marina", "nikola"};

    @Test
    void marathonTest() {

        HashMap<String, Integer> hashMap = new HashMap<>();


        for (String s : participant) {
            if (hashMap.get(s) != null) {
                System.out.println("중복:" + s);
                hashMap.put(s, hashMap.get(s) + 1);
            } else {
                hashMap.put(s, 1);
            }
        }


        for (String s : completion) {
            System.out.println("완주자:" + s);
            System.out.println("완주자:" + hashMap.get(s));
            hashMap.put(s, hashMap.get(s) - 1);
        }

        System.out.println("hash22:" + hashMap.toString());


        for (String s : participant) {
            if (hashMap.get(s) != 0) {
                System.out.println(s + "는 참여자 명단에 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.");
                break;
            }
        }

    }

    @Test
    void testest() {

        RunnableSample ru = new RunnableSample();

        ThreadSample th = new ThreadSample();

        new Thread(ru).start();
        th.start();

        System.out.println("@@@@@@@@@@@");


    }

    class RunnableSample implements Runnable {
        @Override
        public void run() {
            System.out.println("Runnable");
        }
    }

    class ThreadSample extends Thread {
        public void run() {
            System.out.println("Thread");
        }
    }
}

