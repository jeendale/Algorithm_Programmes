import java.util.*;

class Solution {
    public String solution(String X, String Y) {
     
        List<String> xList = new ArrayList<>(Arrays.asList(X.split("")));
        List<String> yList = new ArrayList<>(Arrays.asList(Y.split("")));

  
        Collections.sort(xList);
        Collections.sort(yList);

 
        List<String> duplList = new ArrayList<>();
        
        // 두 리스트를 순차적으로 비교하여 공통된 숫자를 찾음
        int i = 0, j = 0;
        while (i < xList.size() && j < yList.size()) {
            if (xList.get(i).equals(yList.get(j))) {
                duplList.add(xList.get(i));  // 공통된 숫자 추가
                i++;
                j++;
            } else if (xList.get(i).compareTo(yList.get(j)) < 0) {
                i++;
            } else {
                j++;
            }
        }
        if(duplList.isEmpty()){
            return "-1";
        }
        if(Collections.frequency(duplList,"0")==duplList.size()){
            return "0";
        }
        Collections.sort(duplList,Comparator.reverseOrder());
        String answer = String.join("",duplList);
        return answer;
    }
}