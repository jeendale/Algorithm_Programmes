#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
bool solution(const char* s) {
    bool answer = true;
    char *str=(char*)malloc(sizeof(char)*8);
    strcpy(str,s);

    for(int i=0;str[i]!=NULL;i++){
        if(strlen(str)!=4&&strlen(str)!=6){
            answer=false;
            break;
        }
        if(str[i]-'0'>=0&&str[i]-'0'<=9)answer=true;
        else{
            answer=false;
            break;
        }
    }       
    
    return answer;
}