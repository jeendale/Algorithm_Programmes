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
                if(stack.isEmpty()||stack.pop()==a){
                    System.out.println(a+" "+cnt);
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}