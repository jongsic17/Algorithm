import java.util.*;
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] sound = {"aya","ye","woo","ma"};
        
        for(String str : babbling){
            String preWord = "";
            String word = "";
            for(String s: str.split("")){
                word += s;
                for(String n : sound){
                    if (word.equals(n) && !preWord.equals(n)){
                        word = "";
                        preWord = n;
                        break;
                    }
                }
            }
            if(word == ""){
                answer += 1;
            }
        }
        return answer;
    }
}