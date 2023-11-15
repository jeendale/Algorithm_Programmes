#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(const char* s) {
    int answer = 0;
    int temp=0;
    //int size=strlen(s);
    //char *str=(char*)malloc(sizeof(char)*5);
    answer=atoi(s);
    if(s[0]=='-'){
        for(int i=0;i<5;i++){
            if(i>=1){
               temp=-1*(answer%10)*(i*10);
            }
            else{
                temp=-1*answer%10;
            }
        }
    }
    
    return answer;
}