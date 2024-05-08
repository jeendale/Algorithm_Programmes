import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
       HashMap<String,Integer> result =new HashMap<>();
       for(String name: completion){
            result.put(name,result.getOrDefault(name,0)+1);
       }
       for(String name: participant){
            if(result.getOrDefault(name,0)==0){
                return name;
            }
            result.put(name,result.get(name)-1);
       }
       return null;
       
    }
}