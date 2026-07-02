package bancoDeMidias.model.entities;

public class Podcast extends Midia{
	private Integer duration;
	private String theme;
	public Podcast(String title, String author, Integer year, Integer duration, String theme) {
		super(title, author, year);
		this.duration = duration;
		this.theme = theme;
	}

	public Integer getDuration() {
		return duration;
	}
	
	public String getTheme() {
		return theme;
	}
	
	@Override
	public String toString() {
		String podcastStatus = isRead() ? "[listened]" : "[not listened]";
		return getTitle() + " - " + getAuthor() + " " + "(" + getYear() + ") " + podcastStatus;
	}
	
}
