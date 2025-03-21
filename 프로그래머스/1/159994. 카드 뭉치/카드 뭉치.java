class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int first=0;
        int second=0;
        for(int i=0;i<goal.length;i++){
            if(first<cards1.length&&goal[i].equals(cards1[first])){
                first++;
                continue;
            }else if(second<cards2.length&&goal[i].equals(cards2[second])){
                second++;
                continue;
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}