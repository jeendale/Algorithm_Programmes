#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num) {
    int answer = 0;
    int cnt=0;
    if(num==1){
        answer=0;
        return answer;
    }
    while(true){
        if(num%2==0){
            num=num/2;
        }
        else if(num%2==1){
            num=(num*3)+1;
        }
        cnt++;
        if(cnt>500){
            answer=-1;
            break;
        }
        if(num==1){
            answer=cnt;
            break;
        }
    }
    return answer;
}