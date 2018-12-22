import java.util.Queue;

public class CD {
	private String name;
	private Queue<Playlist> track;

	public Queue<Playlist> getTrack() {
		return track;
	}

	public void setTrack(Queue<Playlist> track) {
		this.track = track;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
