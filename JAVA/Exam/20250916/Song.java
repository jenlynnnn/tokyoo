package dya4;

public class Song {
	private String artist;
	private String title;
	
	
	public Song(String artist, String title) {
		super();
		this.artist = artist;
		this.title = title;
	}

	

	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArtist() {
		return artist;
	}



	public void setArtist(String artist) {
		this.artist = artist;
	}



	public String play() {
		return "노래를 재생합니다!";
	}
	

}
