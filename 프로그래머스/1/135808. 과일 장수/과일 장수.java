import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 1. 점수 배열을 List로 변환하고 내림차순 정렬
        List<Integer> iWillBeRich = IntStream.of(score)
                                    .boxed() // int -> Integer 변환
                                    .sorted(Comparator.reverseOrder()) // 내림차순 정렬
                                    .collect(Collectors.toList());
        
        // 2. 상자 단위로 m개씩 묶어서 계산
        for (int i = 0; i <= score.length - m; i += m) {
            // 3. 한 상자에 담긴 가장 낮은 점수는 m번째 사과 (내림차순으로 정렬했으므로)
            int min = iWillBeRich.get(i + m - 1);
            
            // 4. 해당 상자의 가격 계산 (최소 점수 * m)
            answer += min * m;
        }
        
        return answer; // 최종 이익 반환
    }
}
