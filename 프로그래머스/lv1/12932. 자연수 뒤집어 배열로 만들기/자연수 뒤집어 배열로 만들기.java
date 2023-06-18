import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] arr = {};
        int arrLength = 0;
        int temp = 0;
        String s = String.valueOf(n);
        

        for(String str : s.split("")){
            arr = Arrays.copyOf(arr, arrLength + 1);
            arr[arrLength++] = Integer.parseInt(str);   
        }
        int[] answer = new int[arr.length];
        int count = 0;
        for(int i = arr.length-1; i >= 0; i--){
            answer[i] = arr[count++];
        }

        return answer;
    }
}