package bancoDeMidias.model.entities;

public class Music extends Midia{
	private Integer duration;

	public Music(String title, String author, Integer year, Integer duration) {
		super(title, author, year);
		this.duration = duration;
	}

	public Integer getDuration() {
		return duration;
	}

	
	@Override
	public String toString() {
		String musicStatus =  isRead() ? "[listened]" : "[not listened]";
		return getTitle() + " - " + getAuthor() + " " + "(" + getYear() + ") " + musicStatus;
	}
	
	
}
