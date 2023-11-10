#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int i=10;
    while(n>0){
        answer=answer+(n%i);
        n=n/10;
        
    }
    return answer;
}