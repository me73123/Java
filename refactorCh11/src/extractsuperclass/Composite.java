package extractsuperclass;

import java.util.ArrayList;
import java.util.List;

public class Composite {
	public static void main(String[] args) {
        Frame logo = new Frame("片頭 LOGO");
        
        Playlist playlist1 = new Playlist();
        playlist1.add(new Frame("Duke 左揮手"));
        playlist1.add(new Frame("Duke 右揮手"));
        
        Playlist playlist2 = new Playlist();
        playlist2.add(new Frame("Duke 走左腳"));
        playlist2.add(new Frame("Duke 走右腳"));
        
        Playlist all = new Playlist();
        all.add(logo);  //add Frame
        all.add(playlist1);  //add Playlist
        all.add(playlist2);  //add Playlist
        
        all.play();
	}
}

interface Playable {
    void play();
}

class Frame implements Playable {
    private String image;
    Frame(String image) {
        this.image = image;
    }
    public void play() {
        System.out.println("播放 " + image);
    }
}

class Playlist implements Playable {
    private List<Playable> list = new ArrayList<Playable>();
    public void add(Playable playable) {
        list.add(playable);
    }
    public void play() {
        for(Playable playable : list) {
            playable.play();
        }
    }
}

