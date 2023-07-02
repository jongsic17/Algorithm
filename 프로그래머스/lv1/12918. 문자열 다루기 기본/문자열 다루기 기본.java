class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        if(str.length != 4 && str.length != 6) return false;
        for(int i = 0 ; i < str.length; i++){
            if(str[i] >= 'a' && str[i] <= 'z' || str[i] >= 'A' && str[i] <= 'Z'){
                return answer = false;
            }
        }
        return answer;
    }
}