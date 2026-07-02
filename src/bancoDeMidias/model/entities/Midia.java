package bancoDeMidias.model.entities;

public class Midia {
	private String title;
	private String author;
	private Integer year;
	private boolean read;
	
	public Midia() {
		super();
	}

	public Midia(String title, String author, Integer year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
		this.read = false;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
	
	public Integer getYear() {
		return year;
	}

	public boolean isRead() {
		return read;
	}

	public void markAsRead() {
	
			this.read = true;
		
	}
	
	public void markAsUnread() {
		
		this.read = false;
	
}
	
	@Override
	public String toString() {
		String status = read ? "[read]":"[not read]";
		return title + " - " + author + " " + "(" + year + ") " + status;
	}
	
}
