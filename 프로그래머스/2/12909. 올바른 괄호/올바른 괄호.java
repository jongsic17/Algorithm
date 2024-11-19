import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(char ss : s.toCharArray()){
            if(ss == '('){
                stack.push(ss);
            }else if(!stack.isEmpty() && ss == ')' && stack.peek()=='(' ){
                stack.pop();
            }else{
                answer = false;
            }
        }
        if(stack.size() > 0){
            answer = false;
        }
        return answer;
    }
}