class Solution {
    public String solution(String s) {
        String answer="";
        int num=0;
        char temp;
        if(s.length()%2==0){
            num=s.length()/2-1;
            answer=s.substring(num,num+2);
        }else if(s.length()%2==1){
            num=s.length()/2;
            temp=s.charAt(num);
            answer=String.valueOf(temp);
        }
        return answer;
    }
}