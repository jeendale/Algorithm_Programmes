import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String,String> msg= new HashMap<>();
        msg.put("Enter","님이 들어왔습니다.");
        msg.put("Leave","님이 나갔습니다.");
        
        HashMap<String,String> user =new HashMap<>();
        for(String str : record){
            String[] cmd =str.split(" ");
            if(cmd.length==3){
                user.put(cmd[1],cmd[2]);
            }
        }
        ArrayList<String> result=new ArrayList<>();
        for(String str:record){
            String[] cmd=str.split(" ");
            if(msg.containsKey(cmd[0])){
                result.add(user.get(cmd[1])+msg.get(cmd[0]));
            }
        }
        return result.toArray(new String[0]);
    }
}