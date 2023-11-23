#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int left, int right) {
    int answer = 0;
    int cnt;
    for(left;left<right+1;left++){
        cnt=0;
        for(int i=1;i<=left;i++){
            if(left%i==0){
                cnt++;
            }
        }

        if(cnt%2==0){
            answer=answer+left;
        }
        else if(cnt%2==1)answer=answer-left;
    }
  
    return answer;
}