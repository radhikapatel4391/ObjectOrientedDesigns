

import java.util.Queue;

public class Playlist {
	private String playListName;
	private Queue<Song> queue;
	public Playlist(String playListName, Queue<Song> queue) {
		this.playListName =playListName;	
		this.queue = queue;
	}
	
	public Song getNextSongToPlay(){ return queue.peek(); }
	public void queueUpSong(Song s){ queue.add(s); }
}

