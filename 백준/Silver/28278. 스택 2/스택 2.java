import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < a; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(str.nextToken());

            switch (n){
                case 1:
                    int x = Integer.parseInt(str.nextToken());
                    stack.push(x);
                    break;
                case 2:
                    if(stack.isEmpty()){
                        sb.append("-1\n");
                        break;
                    }else {
                        sb.append(stack.pop()+"\n");
                        break;
                    }
                case 3:
                    sb.append(stack.size()+"\n");
                    break;
                case 4 :
                    if(stack.isEmpty()){
                        sb.append("1\n");
                        break;
                    }else {
                        sb.append("0\n");
                        break;
                    }
                case 5:
                    if(stack.isEmpty()){
                        sb.append("-1\n");
                        break;
                    }else {
                        sb.append(stack.peek()+"\n");
                        break;
                    }
            }
        }
            System.out.println(sb);
    }
}