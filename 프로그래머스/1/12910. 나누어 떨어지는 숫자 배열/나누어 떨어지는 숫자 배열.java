class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer={};
        int i=0;
        for(int num:arr){
            if(num%divisor==0){
                i++;
            }
        }
        if(i==0){
            int[] noResult={-1};
            return noResult;
        }
        answer=new int[i];
        i=0;
        for(int num:arr){
             if(num%divisor==0){
                answer[i]=num;
                i++;
            }
        }
        int temp=0;
        for(i=0;i<answer.length;i++){
            for(int j=i;j<answer.length;j++){
                if(answer[i]>answer[j]){
                    temp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=temp;
                }
            }
        }
        return answer;
    }
}