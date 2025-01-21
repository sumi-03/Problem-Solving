import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    
    HashMap<String, ArrayList<String>> map = new HashMap<>();

    public int[] solution(String[] genres, int[] plays) {

        int[] answer = {};

        HashMap<String, Integer> genre = new HashMap<>();
        HashMap<String, ArrayList<Song>> song = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {

            // 어떤 장르가 제일 많이 재생되었는지 확인하기 위해
            genre.put(genres[i], genre.getOrDefault(genres[i], 0) + plays[i]);

            // 장르별 리스트에 곡 추가
            song.computeIfAbsent(genres[i], a -> new ArrayList<>()).add(new Song(i, plays[i]));
        }

        // 재생 많이 된 장르 순서대로 정렬
        ArrayList<String> sortedGenre = new ArrayList<>(genre.keySet());
        sortedGenre.sort((a, b) -> genre.get(b) - genre.get(a));

        // 베스트 앨범 생성
        ArrayList<Integer> bestAlbum = new ArrayList<>();

        for (String i : sortedGenre) {

            ArrayList<Song> songs = song.get(i);

            songs.sort((a, b) -> {
                
                if (a.getSongPlayCount() != b.getSongPlayCount()) {
                    
                    return b.getSongPlayCount() - a.getSongPlayCount(); // 재생 횟수 기준 내림차순
                }
                return a.getSongNumber() - b.getSongNumber(); // 곡 번호 기준 오름차순
            });


            for (int j = 0; j < Math.min(2, songs.size()); j++) {

                bestAlbum.add(songs.get(j).getSongNumber());

            }

        }

        answer = bestAlbum.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    class Song {

        private int songNumber;
        private int songPlayCount;

        public Song(int songNumber, int songPlayCount) {

            this.songNumber = songNumber;
            this.songPlayCount = songPlayCount;
        }

        public int getSongNumber() {
            return songNumber;
        }

        public int getSongPlayCount() {
            return songPlayCount;
        }
    }
}