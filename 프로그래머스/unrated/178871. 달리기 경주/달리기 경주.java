import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> player = new HashMap<>();
        
        for (int i = 0; i < players.length; i++){
            player.put(players[i], i);
        }
        
        for (String call : callings){
            int curRank = player.get(call);
            String prePlayer = players[curRank-1];
            
            players[curRank-1] = call;
            players[curRank] = prePlayer;

            player.put(call,curRank-1);
            player.put(prePlayer,curRank);
        }
  
        return players;
    }
}