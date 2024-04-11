import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] s = new int[n];
        while(m > 0){
            st = new StringTokenizer(br.readLine());
            int a =  Integer.parseInt(st.nextToken());
            int b =  Integer.parseInt(st.nextToken());
            int c =  Integer.parseInt(st.nextToken());

            for(int i = a-1; i < b; i++){
                s[i] = c;
            }
            m--;
        }
        for(int i = 0 ; i < s.length; i++){
            System.out.print(s[i]+" ");
        }
    }
}
