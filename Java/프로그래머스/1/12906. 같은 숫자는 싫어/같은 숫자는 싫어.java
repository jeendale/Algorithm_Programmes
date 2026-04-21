import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(st.peek()!=arr[i]){
                st.push(arr[i]);
            }
        }
        answer=st.stream().mapToInt(Integer::intValue).toArray();
    
        return answer;
    }
}