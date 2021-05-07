package albe;

import java.util.ArrayList;
import java.util.List;

public class StationTwo implements Radiostation{
    String name;
    List<Song> songs;
    public StationTwo(List<Song> songs){
        this.songs = songs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSong(){
        int i = (int)(Math.random() * 4);
        return songs.get(i).toString();
    }
}
