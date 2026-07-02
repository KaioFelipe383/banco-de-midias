package bancoDeMidias.model.entities;

public class Book extends Midia{
	private Integer numberOfPages;

	public Book(String title, String author, Integer year, Integer numberOfPages) {
		super(title, author, year);
		this.numberOfPages = numberOfPages;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}
	
	
}
