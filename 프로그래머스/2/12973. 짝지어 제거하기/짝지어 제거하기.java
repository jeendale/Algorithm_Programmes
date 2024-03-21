import java.util.*;
class Solution
{
    public int solution(String s){
        int answer=0;
        ArrayDeque<Character> stack=new ArrayDeque<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char a=s.charAt(i);
            if(!stack.isEmpty()&&stack.peek()==a){
                stack.pop();  
            }
            else
                stack.push(a);
        }
        if(stack.isEmpty()){
            answer=1;
        }
        return answer;
    }
}