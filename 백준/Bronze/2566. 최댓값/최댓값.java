import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] max = new int[3];
        max[0] = -1;
        for(int i=0; i< 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                int a = Integer.parseInt(st.nextToken());
                if(max[0] < a){
                    max[0] = a;
                    max[1]= i+1;
                    max[2] = j+1;
                }
            }
        }
        System.out.println(max[0]+"\n"+max[1]+" " +max[2]);

    }
}