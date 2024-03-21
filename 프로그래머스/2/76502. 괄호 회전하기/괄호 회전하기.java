import java.util.*;
class Solution {
    public int solution(String s) {
        int answer=0;
        int flag=0;
        HashMap<Character,Character> couple =new HashMap<>();
        couple.put(')','(');
        couple.put('}','{');
        couple.put(']','[');
        
        int len=s.length();
        s+=s;
       for(int i=0;i<len;i++){
           flag=0; 
           ArrayDeque<Character>stack =new ArrayDeque<>();
            for(int j=i;j<len+i;j++){
                char a=s.charAt(j);
                if(!couple.containsKey(a)){
                    stack.push(a);
                }
                else{
                    if(stack.isEmpty()||!stack.pop().equals(couple.get(a))){
                        flag++;
                        continue;
                        }
                    }
                }
             if(stack.isEmpty()&&flag==0){
                answer++;
            }
        }
        
        return answer;
    }
}