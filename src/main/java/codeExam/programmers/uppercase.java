package codeExam.programmers;

public class uppercase {


    public String solution(String s) {

        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = convert(arr[i].toLowerCase().toCharArray());

        }

        if (s.substring(s.length() - 1, s.length()).equals(" ")) {

            arr[arr.length - 1] += " ";
        }
        return String.join(" ", arr);
    }

    private String convert(char[] toCharArray) {
        if (toCharArray.length != 0) {
            toCharArray[0] = Character.toUpperCase(toCharArray[0]);
        }
        return new String(toCharArray);
    }


//    class Solution {
//        public String solution(String s) {
//            String answer = "";
//            String[] sp = s.toLowerCase().split("");
//            boolean flag = true;
//
//            for(String ss : sp) {
//                answer += flag ? ss.toUpperCase() : ss;
//                flag = ss.equals(" ") ? true : false;
//            }
//
//            return answer;
//        }
//    }
}
