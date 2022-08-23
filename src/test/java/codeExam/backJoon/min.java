package codeExam.backJoon;

import codeExam.codeExam.CodeExamApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = CodeExamApplication.class)
class min {


    @Test
    void testest() {

        int a = 11;

        if (a % 5 == 0) {
            System.out.println(a / 5);
        } else if ((a % 5) < 5) {
            if (3 >= a || a < 15) {
                System.out.println(a / 3);
            } else if (a > 15) {
                System.out.println(a / 5 + (a % 5) / 3);
            } else {
                System.out.println(-1);
            }
        } else {
            System.out.println(-1);
        }

    }

}

