import java.util.*;
class Solution {
     private static boolean isVaild(int x,int y){
            return 0<=x&&x<11&&0<=y&&y<11;
    }
    
    private static final HashMap<Character,int[]> location=new HashMap<>();
    private static void road(){
        location.put('U',new int[]{1,0});
        location.put('D',new int[]{-1,0});
        location.put('R',new int[]{0,1});
        location.put('L',new int[]{0,-1});  
    }
    
    public int solution(String dirs) {
        road();
        int x=5;
        int y=5;
        HashSet<String> answers=new HashSet<>();
        for(int i=0;i<dirs.length();i++){
            int[] offSet =location.get(dirs.charAt(i));
            int mx=x+offSet[0];
            int my=y+offSet[1];
            if(!isVaild(mx,my)){
                continue;
            }
            answers.add(x+" "+y+" "+mx+" "+my);
            answers.add(mx+" "+my+" "+x+" "+y);
            x=mx;
            y=my;
        }
        return answers.size()/2;
    }
}