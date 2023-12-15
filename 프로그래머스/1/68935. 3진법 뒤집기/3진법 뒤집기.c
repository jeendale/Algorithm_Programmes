#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int three=1;
    int temp=0;
    int cnt=0;
    int num;
    while(true){
        if(n<three){
            three=three/3;
            break;
        }
        three=three*3;
        cnt++;
    }
    if(three<2){
        answer=1;
        return answer;
    }
    temp=three;
    int *arr=(int*)malloc(sizeof(int)*cnt);
    for(int i=0;i<cnt;i++){
        num=n/three;
        n=n%three;
        three=three/3;
        arr[i]=num;   
    }
    
    int *arr2=(int*)malloc(sizeof(int)*cnt);
    for(int i=0;i<cnt;i++){
        arr2[cnt-1-i]=arr[i];
    }
    num=0;
    for(int i=0;i<cnt;i++){
        num=temp*arr2[i];
        answer=answer+num;
        temp=temp/3;
        printf("%d  %d\n",num,temp);
    }
   
    
    return answer;
}