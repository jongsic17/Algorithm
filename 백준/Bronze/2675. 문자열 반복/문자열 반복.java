import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();

            for(int j =0; j < b.length(); j++){
                for(int k =0 ; k < a; k++){
                    sb.append(b.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}