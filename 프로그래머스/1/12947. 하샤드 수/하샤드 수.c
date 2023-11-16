#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(int x) {
    bool answer = true;
    int sum=0,result=0,temp=x;
    for(int i=0;;i++){
        sum=sum+(temp%10);
        temp=temp/10;
        if(temp==0)break;
    }
    if(x%sum!=0)answer=false;
    return answer;
}