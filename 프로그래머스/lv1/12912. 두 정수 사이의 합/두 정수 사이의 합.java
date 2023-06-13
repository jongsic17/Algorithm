class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = -10000000;
        int min = 10000000;
        if (a>b){
            max = a;
            min = b;
        }else {
            max = b;
            min = a; }
        
        for (int i = min; i <= max; i++){
            answer += i;
        }
        return answer;
    }
}