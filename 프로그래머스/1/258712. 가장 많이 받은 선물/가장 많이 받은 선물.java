import java.util.*;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> result = new HashMap<>();
        int[][] g = new int[friends.length][3];  // 준 선물, 받은 선물, 선물 지수 표
        int[][] gift = new int[friends.length][friends.length];  // 주고 받은 사람 표 
        
        // 친구 목록 사전으로 변환
        for(int i = 0; i < friends.length ;i++){
            map.put(friends[i], i);         
            result.put(friends[i],0);
        }

        // 사전으로 변환 한 친구목록 이름을 통해서 인데스 값 찾기, 인덱스 값을 통해서 주고 받은 사람 표 작성
        for(int i =0; i < gifts.length; i++){
            String[] s = gifts[i].split(" ");
            String first = s[0];
            String second = s[1];
            gift[map.get(first)][map.get(second)] += 1;
            
        }
        System.out.println(Arrays.deepToString(gift));

        
        // 0 준 선물, 1 받은 선물, 2 선물 지수 표 작성
        for(int i = 0 ; i< gift.length; i++){
            for(int j = 0 ; j < gift.length; j++){
                g[i][0] += gift[i][j]; 
                g[i][1] += gift[j][i]; 
            }
            g[i][2] = g[i][0] - g[i][1]; 
            
        }
       
        System.out.println(Arrays.deepToString(g));
        
        // 확인 용 출력
        for(int i = 0; i < gift.length; i++){
            for(int j =0 ; j < gift.length; j++){
                System.out.print(gift[i][j] + " ");
            }   
            System.out.println("");
        }
        
        
        // 예외 처리 및 결과
        
        // 선물을 주고 받은 기록
        // 주고 받은 수가 같다
        // 두사람의 선물지수도 같으면 x
        for(int i = 0; i < gift.length; i++){
            for(int j =0 ; j < gift.length; j++){
                if(gift[i][j] > gift[j][i]){  // 더 많이 줬을 경우
                    result.put(friends[i],result.get(friends[i])+1);
                }else if (gift[i][j] == gift[j][i]){ // 서로 주고 받지 않았을 경우 선물 지수 비교
                    if(g[i][2] > g[j][2]){
                        result.put(friends[i],result.get(friends[i])+1);
                    }
                }
            }
        }        
        System.out.println(result);
        answer = Collections.max(result.values());
        return answer;
    }
}