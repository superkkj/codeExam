package codeExam.backjoon.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//https://www.acmicpc.net/problem/2941

//백준 문자열 분류 문제.

//예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
  //  dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
public class croatiaAlphabat {

    private static List<String> list = new ArrayList<>();


    public static void main(String[] args) {

        list.add("c=");
        list.add("c-");
        list.add("dz=");
        list.add("d-");
        list.add("lj");
        list.add("nj");
        list.add("s=");
        list.add("z=");

        long count = 0;


        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        for (int i = 0; i < list.size(); i++) {
            if (str.contains(list.get(i))) {
                count = count + countChar(str, list.get(i));
                //중복이 되도 미리 갯수를 셋기때문에 전부 컴마로 바꿔줌
                str = str.replace(list.get(i), ",");
            }
        }


        int length = str.replaceAll(",", "").length();

        System.out.println(count + length);

    }

    //문자열 안에서 중복된 문자 갯수를 찾아준다 보통 1을 반환해야겠지만
    //크로아티아 알파벳이 연속으로 나오는경우가 있기 때문에 따로 함수로 빼둠
    public static int countChar(String str, String str2) {
        int count = 0;

        String aa = str.replaceAll(str2, "*");

        for (int i = 0; i < aa.length(); i++) {
            if (aa.charAt(i) == '*') {
                count++;
            }
        }
        return count;

    }
}