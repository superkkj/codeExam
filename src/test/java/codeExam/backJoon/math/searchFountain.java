package codeExam.backJoon.math;


import codeExam.codeExam.CodeExamApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = CodeExamApplication.class)
public class searchFountain {


    @Test
    void name() {

        List<String> list = new ArrayList<>();
        int count = 0;


//        list.add(1 + "/" + 1);

        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                if (i % 2 != 0) {
                    list.add((i - j) + "/" + (j + 1));
                    count++;
                } else {
                    list.add((j + 1) + "/" + (i - j));
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(list.toString());
//        System.out.println(list. get(14-1));


    }


}
