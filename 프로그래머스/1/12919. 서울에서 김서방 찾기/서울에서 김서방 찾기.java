class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int i=0;
        for(String str:seoul){
            if(str.equals("Kim")){
                answer="김서방은 "+i+"에 있다";
            }
            i++;
        }
        return answer;
    }
}