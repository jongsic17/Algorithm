import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] s = new int[30];
        for(int i = 0; i < 28; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            s[n-1] = 1;
        }
        for(int i =0; i < s.length;i++){
            if(s[i] == 0){
                sb.append(i+1+"\n");
            }
        }
        System.out.println(sb);
    }
}
