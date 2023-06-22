import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        long[] arr = {};
        int i = 0;
        long temp = 0;
        String s = "";
        
        while( n > 0){
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[i++] = n % 10;
            n = n / 10;            
        }
        
        for(int k = 0 ; k < arr.length; k++){
            for(int j = k; j < arr.length; j++){
                if (arr[k] < arr[j]){
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int l = 0; l < arr.length; l++){
            s += arr[l];
        }
        answer = Long.parseLong(s);

        return answer;
    }
}