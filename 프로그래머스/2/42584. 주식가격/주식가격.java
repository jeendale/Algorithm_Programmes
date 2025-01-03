import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer=new int[prices.length];
        
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty()&&prices[i]<prices[stack.peek()]){
                int j=stack.pop();
                answer[j]=i-j;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int j=stack.pop();
            answer[j]=prices.length-1-j;
        }
        return answer;
    }
}