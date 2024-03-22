import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer>[] stack =new Stack[board.length];
        for(int i=0;i<board.length;i++){
            stack[i]=new Stack<>();
        }
        
        for(int i=board.length-1;i>=0;i--){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]>0){
                    stack[j].push(board[i][j]);
                }
            }
        }
        Stack<Integer> result =new Stack<>();
        
       for(int move:moves){
           if(!stack[move-1].isEmpty()){
               int doll=stack[move-1].pop();
               if(!result.isEmpty()&&result.peek()==doll){
                   result.pop();
                   answer+=2;
               }
               else{
                   result.push(doll);
               }
           }
       }
        return answer;
    }
}