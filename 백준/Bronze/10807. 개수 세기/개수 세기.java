import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        StringBuilder sb = new StringBuilder();
        int[] s = new int[n];
        int answer = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            s[i] = Integer.parseInt(st.nextToken());
        
        }
        int a = Integer.parseInt(br.readLine());
        for(int i =0; i < s.length;i++){
            if(s[i] == a){
                answer += 1;
            }
        }
        
        System.out.println(answer);
    }
}
