


import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] s = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int answer = 0;
        for(int k = 0; k < str.length(); k++) {
            char e = str.charAt(k);
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s[i].split("").length; j++) {
                    if (s[i].charAt(j) == e) {
                        answer += i+3;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
