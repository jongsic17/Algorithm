import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String[] s = {"R","T","C","F","J","M","A","N"};
        int[] a = {0,0,0,0,0,0,0,0};
        
        for(int i = 0; i < survey.length; i++){
            String[] str = survey[i].split("");
            int num = 0;
            int count = 4 - choices[i];

            if(count > 0){ 
                num = 0;
            }else if(count < 0){
                num = 1;
                count *= -1;
            }
            for(int j = 0; j < s.length; j++){
                if(s[j].equals(str[num])){
                    a[j] += count;
                }
            }

        }
        
        for(int i = 0; i < s.length; i += 2){
            if(a[i] == a[i+1] ){ 
                if( s[i].compareTo(s[i+1]) > 0 ){
                    answer += s[i];
                }else if ( s[i].compareTo(s[i+1]) < 0){
                    answer += s[i];
                }
            }else if(a[i] < a[i+1]){
                answer += s[i+1];
            }else if(a[i] > a[i+1]){
                answer += s[i];
            }
            
        }

        return answer;
    }
}