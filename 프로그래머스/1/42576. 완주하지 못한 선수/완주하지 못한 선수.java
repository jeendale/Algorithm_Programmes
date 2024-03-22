import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> findKey =new HashMap<>();
        
        for(String str : completion){
            findKey.put(str,findKey.getOrDefault(str,0)+1);
        }
        
        for(String str: participant){
            if(findKey.getOrDefault(str,0)==0){
                return str;
            }
            findKey.put(str,findKey.get(str)-1);
        }
        return null;
    }
}