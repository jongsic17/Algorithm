


import java.io.*;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] s = {1,1,2,2,2,8};
        for(int i = 0; i < 6;i++){
            int x = Integer.parseInt(st.nextToken());
            s[i] = s[i]-x;
        }
        for(int i  =0 ; i < s.length; i++){
            System.out.print(s[i]+" ");
        }
    }
}