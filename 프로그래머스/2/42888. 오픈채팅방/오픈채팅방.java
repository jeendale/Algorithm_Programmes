import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> chat=new HashMap<>();
        chat.put("Enter","님이 들어왔습니다.");
        chat.put("Leave","님이 나갔습니다.");
        
        HashMap<String,String> user=new HashMap<>();
        for(String str : record){
            String[] cmd=str.split(" ");
            if(cmd.length==3){
                user.put(cmd[1],cmd[2]);
            }
        }
        ArrayList<String> answer =new ArrayList<>();
        for(String str: record){
            String[] cmd=str.split(" ");
            if(chat.containsKey(cmd[0])){
                answer.add(user.get(cmd[1])+chat.get(cmd[0]));
            }
        }
        return answer.toArray(new String[0]);
    }
}