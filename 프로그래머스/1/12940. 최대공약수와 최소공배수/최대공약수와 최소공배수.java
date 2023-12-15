class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int num=0;
        int max=n;
        int min=m;
        if(n<m){
            max=m;
            min=n;
        }
        while(min>0){
            num=max%min;
            max=min;
            min=num;
        }
        answer[0]=max;
        answer[1]=n*m/max;
        
        return answer;
    }
}