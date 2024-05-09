import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,ArrayList<int[]>> genreList=new HashMap<>();
        HashMap<String,Integer> playList=new HashMap<>();
        
        for(int i=0;i<genres.length;i++){
            String genre=genres[i];
            int play=plays[i];
            
            if(!genreList.containsKey(genre)){
                genreList.put(genre,new ArrayList<>());
                playList.put(genre,0);
            }
            genreList.get(genre).add(new int[]{i,play});
            playList.put(genre,playList.get(genre)+play);
        }
        ArrayList<Integer> result=new ArrayList<>();
        Stream<Map.Entry<String,Integer>> sortedGenre=playList.entrySet()
            .stream()
            .sorted((o1,o2)->Integer.compare(o2.getValue(),o1.getValue()));
        sortedGenre.forEach(enrty->{
            Stream<int[]> sortedSongs=genreList.get(enrty.getKey()).stream()
                .sorted((o1,o2)->Integer.compare(o2[1],o1[1]))
                .limit(2);
            sortedSongs.forEach(song->result.add(song[0]));
        });
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}