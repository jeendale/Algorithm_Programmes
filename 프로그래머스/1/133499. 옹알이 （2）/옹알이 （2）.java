class Solution {
    public int solution(String[] babbling){ // 발음 가능한 단어 리스트
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        int count = 0;
        
        for (String word : babbling) {
            boolean isValid = true;
            
            // 같은 발음이 연속적으로 나오는지 확인하기 위해 초기화
            String prev = "";
            
            while (!word.isEmpty()) {
                boolean matched = false;
                
                for (String p : possible) {
                    if (word.startsWith(p) && !p.equals(prev)) { // 발음 가능하며 연속적이지 않음
                        word = word.substring(p.length()); // 발음 제거
                        prev = p;
                        matched = true;
                        break;
                    }
                }
                
                if (!matched) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                count++;
            }
        }
        
        return count;
    }
}