import java.util.*;
class Solution {
    public int solution(String s) {
        int answer=0;
        HashMap<Character,Character> couple =new HashMap<>();
        couple.put(')','(');
        couple.put('}','{');
        couple.put(']','[');
        
        int len=s.length();
        s+=s;
       A:for(int i=0;i<len;i++){
            ArrayDeque<Character>stack =new ArrayDeque<>();
            for(int j=i;j<len+i;j++){
                char a=s.charAt(j);
                if(!couple.containsKey(a)){
                    stack.push(a);
                }
                else{
                    if(stack.isEmpty()||!stack.pop().equals(couple.get(a))){
                        continue A;
                        }
                    }
                }
             if(stack.isEmpty()){
                answer++;
            }
        }
        
        return answer;
    }
}