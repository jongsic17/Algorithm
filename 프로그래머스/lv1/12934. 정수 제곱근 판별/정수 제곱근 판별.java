import java.util.*;
class Solution {
    public long solution(long n) {
        if(Math.sqrt(n) % 1 == 0){
            return Math.round(Math.pow(Math.sqrt(n)+1,2));
        }else return -1;
    }
}