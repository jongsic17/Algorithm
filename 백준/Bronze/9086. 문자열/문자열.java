import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =0 ; i< n; i++){
            String str = br.readLine();

            sb.append(str.charAt(0));
            sb.append(str.charAt(str.length()-1)+"\n");
        }
        System.out.println(sb);
    }
}
