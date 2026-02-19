import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr=new int[progresses.length];
        int a=0;
        for(int i=0;i<arr.length;i++){
            a=100-progresses[i];
            arr[i]=(a+speeds[i]-1)/speeds[i];
        }
        
        List<Integer> answer=new ArrayList<>();
        int cnt=1;
        int result=arr[0];
        for(int i=1;i<arr.length;i++){
            if(result>=arr[i]){
                cnt++;
            }else{
                answer.add(cnt);
                result=arr[i];
                cnt=1;
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}