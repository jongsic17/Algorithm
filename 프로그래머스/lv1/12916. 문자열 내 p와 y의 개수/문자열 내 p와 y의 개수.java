import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Map<String, Integer> py = new HashMap<>();
        py.put("p",0);
        py.put("y",0);
        s = s.toLowerCase();
        for(String str : s.split("")){
            if (str.equals("p")){
                py.put("p", py.get("p") + 1);
            }else if(str.equals("y")){
                py.put("y", py.get("y") + 1);
            }
        }
        if (py.get("p") != py.get("y")){
            answer = false;
        }
        return answer;
    }
}