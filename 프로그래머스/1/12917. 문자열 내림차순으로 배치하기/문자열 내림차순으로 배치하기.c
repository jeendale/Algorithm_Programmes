#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* s) {
    int len=0;
    for(int i=0;s[i]!=NULL;i++){
        len++;
        
    }
    char* answer = (char*)malloc(sizeof(char)*len);
    char temp;
    for(int i=0;i<len;i++){
        answer[i]=s[i];
        if(i==len-1){
            answer[i+1]=NULL;
        }
    }
   for(int i=0;i<len;i++){
       for(int j=i;j<len;j++){
            if(answer[i]<answer[j]){
                temp=answer[i];
                answer[i]=answer[j];
                answer[j]=temp;
                
            }
        }
    }
    return answer;
}