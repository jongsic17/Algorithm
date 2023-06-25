import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int j = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++){

            if (arr[i] % divisor == 0){
                answer = Arrays.copyOf(answer, answer.length + 1); 
                answer[j++] = arr[i];
            }
        }
        if(answer.length == 0){
            return new int[]{-1};
        }
        for(int k = 0; k < answer.length; k++){
            for(int n = k + 1; n < answer.length; n++){
                if(answer[k] > answer[n]){
                    temp = answer[k];
                    answer[k] = answer[n];
                    answer[n] = temp;
                }
            }
        }
        return answer;
    }
}