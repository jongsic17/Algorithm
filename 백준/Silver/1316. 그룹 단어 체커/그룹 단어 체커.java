import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i=0; i < n; i++){
            String str = br.readLine();
            char[] s = str.toCharArray();
            boolean isContain = true;
            boolean[] isContains = new boolean[26];
            char str1 = s[0];
            isContains[str1-97] = true;
            for(int j = 1; j < s.length; j++){
                if(!(str1 == s[j])){
                    str1 = s[j];
                    if(isContains[(s[j]-97)]){

                        isContain = false;
                        break;
                    }else {

                        isContains[s[j]-97] = true;
                    }
                }
            }
            if(isContain == true){
                count+= 1;
            }
        }
        System.out.println(count);
    }
}