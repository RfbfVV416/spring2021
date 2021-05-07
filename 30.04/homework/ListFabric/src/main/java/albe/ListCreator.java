package albe;

import java.util.Arrays;
import java.util.List;

public class ListCreator {
//    public static List<Song> getList(Song song1, Song song2){
//        return Arrays.asList(song1, song2);
//    }
    public static List<Song> getList(){
        return Arrays.asList(new Song("song1", "author1"), new Song("song2", "author2"));
    }
}
