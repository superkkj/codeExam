package codeExam.codeExam;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;
import java.util.HashMap;

@SpringBootTest
class SquareTest {

    @Test
    void 정사각형일때() {

        int x = 6;
        int y = 6;
        int z = x*y - x;
        System.out.println("count :"+ z);

    }

    @Test
    void 최대공약수() {

        int w = 8;
        int h = 12;

        BigInteger w1 = BigInteger.valueOf(w);
        BigInteger h1 = BigInteger.valueOf(h);
        int gcd = w1.gcd(h1).intValue();

        System.out.println(gcd);

    }


    @Test
    void solution() {

        long answer = 1;
        int w = 8;
        int h = 12;

        BigInteger w1 = BigInteger.valueOf(w);
        BigInteger h1 = BigInteger.valueOf(h);

        int gcd = w1.gcd(h1).intValue();

        //최대 공약수만큼 도형이 반복되고 , 반복되는 도형안에 못쓰는 사각형 갯수는 각 변 / 최대공약수 를 더한다음 -1 ( 겹치는 부분을빼준다)
        answer = (w*h) - ((w/gcd + h/gcd -1 ) * gcd);
        System.out.println(answer);

    }



    //
    public void solution(int w, int h) {

            long answer = 1;

            if(w == h){
                answer = w*h - w;
            }else{
                if(h%2 == 0){
                    answer = w*h - w*2;
                }else{
                    answer =  w*h - ((w*2) +1);
                }
            }

        System.out.println(answer);

    }


}

