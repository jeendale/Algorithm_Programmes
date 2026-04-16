import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> result=new HashMap<>();
        for(String key:participant){
            result.put(key,result.getOrDefault(key,0)+1);
        }
        for(String key:completion){
            result.put(key,result.get(key)-1);
        }
        for(String key: participant){
            if(result.get(key)!=0){
                answer=key;
            }
        }
        return answer;
    }
}