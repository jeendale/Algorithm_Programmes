class Solution {
    public int[] solution(int[] arr) {
        int[] answer=new int[arr.length-1];
        int min=0;
        if(arr.length==1){
            int[] noResult={-1};
            return noResult;
        }
        for(int i=1;i<arr.length;i++){
            if(arr[min]>arr[i]){
                min=i;
            }
        }
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(min!=i){
                answer[j]=arr[i];
                j++;
            }
        }
        return answer;
    }
}