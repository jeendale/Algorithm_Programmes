class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count=0;
        int zero=0;
        for(int lotto:lottos){
            if(lotto==0){
                zero++;
                continue;
            }
            for(int win:win_nums){
                if(lotto==win){
                    count++;
                }
            }
        }
        answer[0]=7-count-zero;
        answer[1]=7-count;
        for(int i=0;i<2;i++){
            if(answer[i]==7)answer[i]=6;
        }
        return answer;
    }
}