import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int poketmonTpyeNumbers = nums.length / 2;
        LinkedHashMap<Integer, Integer> poketmons = new LinkedHashMap<>();
        int count = 1;
        for (int num : nums) {
            poketmons.merge(num, 1, Integer::sum);
        }

        answer = poketmons.size();

        if (poketmons.size() >= poketmonTpyeNumbers) {
            answer = poketmonTpyeNumbers;
        }
        return answer;
    }
}