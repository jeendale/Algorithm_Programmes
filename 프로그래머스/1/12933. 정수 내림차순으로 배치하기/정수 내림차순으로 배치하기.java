

class Solution {
    public long solution(long n) {
        long answer = 0;
        long[] arr=new long[11];
        long num=0;
        int end=0;
        for(int i=0;i<11;i++){
            num=n%10;
            n=n/10;
            arr[i]=num;
            
            if(n==0){
                end=i;
                break;
            }
        }
        for(int i=0;i<=end;i++){
            for(int j=i;j<=end;j++){
                if(arr[i]<arr[j]){ 
                    num=arr[i];
                    arr[i]=arr[j];
                    arr[j]=num;
                }
            }
            answer=answer+arr[i];
            if(i!=end)answer=answer*10;
        }
    
        return answer;
    }
}