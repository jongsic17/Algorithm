import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String str = "";
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
        for(int i=0; i < strings.length; i++){
            for(int j=0; j < strings.length; j++){
               if(strings[i].charAt(n) < strings[j].charAt(n)){
                    str =  strings[i];
                    strings[i] = strings[j];
                    strings[j] = str;
                }else if(strings[i].charAt(n) == strings[j].charAt(n) && strings[i].compareTo(strings[j]) < 0){
                   str =  strings[i];
                    strings[i] = strings[j];
                    strings[j] = str;
               }
            }
        }
        
        return strings;
    }
}