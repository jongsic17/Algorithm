import java.util.*;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int[] num = {};
        int i = 0 ;
        int sum = 0;
        int n = x;
        while(x>0){
            num = Arrays.copyOf(num, num.length + 1);
            num[i++] = x % 10;
            x = x / 10;
        }
        for(int j = 0; j < num.length; j++){
            sum += num[j];
        }
        if (n % sum != 0){
            answer = false;
            return answer;
        }

        return answer;
    }
}