import java.util.*;

class Solution {
    boolean solution(String s) {
        ArrayDeque<Character> stack=new ArrayDeque<>();
        char[] arr=s.toCharArray();
        int cnt=0;
        for(char a :arr){
            cnt++;
            if(a=='('){
                stack.push(a);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}