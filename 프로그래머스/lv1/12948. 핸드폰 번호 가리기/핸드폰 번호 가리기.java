class Solution {
    public String solution(String phone_number) {
        String answer = "";
        System.out.print(phone_number.length()-4);
        int count = 0;
        int i = 0;
        for(String s : phone_number.split("")){
            if(i < (phone_number.length()-4) ){
                answer += "*";
            }else answer += s;
            i++;
        }
        return answer;
    }
}