import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0;
        HashMap<String,Integer> list =new HashMap<>();
        
        for(int i=0;i<want.length;i++){
            list.put(want[i],number[i]);
        }
        
        for(int i=0;i<discount.length-9;i++){
            if(!list.containsKey(discount[i])){
                continue;
            }
                
            HashMap<String,Integer> tenDayList=new HashMap<>();
            for(int j=i;j<i+10;j++){
                tenDayList.put(discount[j],tenDayList.getOrDefault(discount[j],0)+1);
            }
            if(tenDayList.equals(list)){
                answer++;
            }
        }
        return answer;
    }
}