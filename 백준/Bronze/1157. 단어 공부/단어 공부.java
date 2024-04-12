


import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max =0;
        boolean dis = true;
        String z = "";
        String str = br.readLine().toLowerCase();
        int[] s = new int[26];
        for(int i =0; i < str.length(); i++){
            s[str.charAt(i)-97] +=1 ;
        }
        for(int i =0 ; i < s.length; i++){
            if(max < s[i]){
                max = s[i];
                z = (char)(i+97)+"";
                dis = true;
            }else if(s[i] > 0 && max <= s[i]){
                dis = false;
            }
        }
        if(dis == true){
            System.out.print(z.toUpperCase());
        }else System.out.println("?");
    }
}