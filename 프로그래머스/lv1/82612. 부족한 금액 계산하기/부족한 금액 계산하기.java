import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int moneySpent = 0;
        for(int i = 0 ; i < count; i++){
            moneySpent += price;
            answer += moneySpent;
        }
        if(answer - money > 0){
            answer = answer - money;
        }else answer = 0;
        return answer;
    }
}