import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        HashMap<String,Integer> list =new HashMap<>();
        for(int i=0;i<want.length;i++){
            list.put(want[i],number[i]);
        }
        int answer=0;
        for(int i=0;i<discount.length-9;i++){
            HashMap<String,Integer> checkList=new HashMap<>();
            
            for(int j=i;j<i+10;j++){
                if(list.containsKey(discount[j])){
                    checkList.put(discount[j],checkList.getOrDefault(discount[j],0)+1);
                }
            }
            if(list.equals(checkList))
                answer++;
        }
        
        return answer;
    }
}