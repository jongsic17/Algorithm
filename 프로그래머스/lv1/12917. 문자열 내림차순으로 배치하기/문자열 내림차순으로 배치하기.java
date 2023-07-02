import java.util.*;
class Solution {
    public String sortFunction(char[] ch){
        String str = "";
        for(int j = 0; j < ch.length; j++){
            char temp = ' ';
            for(int k = 0; k < ch.length-1; k++){
                if(ch[k] < ch[k+1]){
                    temp = ch[k];
                    ch[k] = ch[k+1];
                    ch[k+1] = temp;
                }
            }
        }
        for(int i = 0; i < ch.length; i++){
            str += ch[i];
        }
        return str;
    }
    
    public String solution(String s) {
        String answer = "";
        String upperCase = "";
        String lowerCase = "";
        char[] ch = s.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if((ch[i] >= 'a') && ch[i] <= 'z'){
                lowerCase += ch[i];
            }else upperCase+= ch[i];
        }

        answer += sortFunction(lowerCase.toCharArray());
        answer += sortFunction(upperCase.toCharArray());

        return answer;
    }
}