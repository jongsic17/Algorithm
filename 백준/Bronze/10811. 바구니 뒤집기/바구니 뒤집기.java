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
        for (int i = 0; i < n; i++) {
            s[i] = i + 1;
        }
        
        for(int i=0; i< m; i++){
            int temp = 0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            for(int j=b; j > a; j--){
                    temp =  s[a];
                    s[a] = s[j];
                    s[j] = temp;
                    a++;
            }
        }
        for(int i=0; i< n; i++){
            System.out.print(s[i]+" ");
        }
    }
}