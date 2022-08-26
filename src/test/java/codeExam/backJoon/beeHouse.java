package codeExam.backJoon;

import codeExam.codeExam.CodeExamApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CodeExamApplication.class)

public class beeHouse {

    @Test
    void test() {

        int result = 2;
        int start = 2;
        int end = 0;

        int startPlus = 6;
        int endPlust = 5;

        int input = 218;

        if (input == 1) {
            System.out.println(1);
            return;
        }


        for (int i = 0; i < 10; i++) {

            start = start + startPlus * i;
            end = start + endPlust + (startPlus * i);

            if (start <= input && input <= end) {
                System.out.println(result + i);
                break;
            }
        }
    }
}
