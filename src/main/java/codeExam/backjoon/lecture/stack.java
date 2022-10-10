package codeExam.backjoon.lecture;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class stack {


    static Stack<Integer> stack = new Stack<>();
    static     StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {



//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;



//        int N = Integer.parseInt(String.valueOf(br.readLine()));
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String aa= null;

        for(int i=0; i<N; i++){
            aa = sc.next();

            if(aa.equals("push")){
                push(sc.next());
                continue;
            }else if(aa.equals("top")){
                top();
                continue;
            }else if(aa.equals("size")){
                size();
                continue;
            }else if(aa.equals("pop")){
                pop();
                continue;
            }
            else if(aa.equals("empty")){
                empty();
                continue;
            }
        }


        System.out.println(sb.toString());





    }

    private static void empty() {
        if (!stack.empty()){
            sb.append(0).append('\n');
        }else{
            sb.append(1).append('\n');
        }
    }

    private static void pop() {
        if(stack.size() == 0){
            sb.append(-1).append('\n');
        }else{
            sb.append(stack.get(stack.size()-1)).append('\n');
            stack.pop();
        }
    }

    private static void size() {
        if(stack.size() == 0){
            sb.append(0).append('\n');

        }else{
            sb.append(stack.size()).append('\n');
        }
    }

    private static void top() {
        if(stack.size() == 0){
            sb.append(-1).append('\n');

        }else{
            sb.append(stack.get(stack.size()-1)).append('\n');
        }
    }

    private static void push(String readLine) {
        int a = Integer.parseInt(readLine);
        stack.push(a);
    }
}
