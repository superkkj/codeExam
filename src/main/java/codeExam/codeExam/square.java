package codeExam.codeExam;

import java.math.BigInteger;

public class square {

    // 최대 공약수 문제.
    public long solution(int w, int h) {
        long answer = 1;

        BigInteger w1 = BigInteger.valueOf(w);
        BigInteger h1 = BigInteger.valueOf(h);

        int gcd = w1.gcd(h1).intValue();

        //최대 공약수만큼 도형이 반복되고 , 반복되는 도형안에 못쓰는 사각형 갯수는 각 변 / 최대공약수 를 더한다음 -1 ( 겹치는 부분을빼준다)
        answer = ((long)w*(long)h) - (((long)w/gcd + (long)h/gcd -1 ) * gcd);

        return answer;
    }



}
