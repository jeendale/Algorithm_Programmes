import java.util.*;

class Solution {
    boolean solution(String s) {
       
        char a=s.charAt(0);
        
        Stack<Character> st=new Stack<>();
        if(a==')'){
            return false;
        }
        st.push(a);
        for(int i=1;i<s.length();i++){
            a=s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek()=='('){
                    if(a==')'){
                        st.pop();
                    }else{
                        st.push(a);
                    }
                }else{
                    return false;
                } 
            }else{
                st.push(a);
            }
            
        }
            
        return st.isEmpty();
    }
}