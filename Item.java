package examples;

abstract class Item {
	private int id_number;
	private String title;
	private int numberOfcopies;

	public Item(int id_number, String title, int numberOfcopies) {
		super();
		this.id_number = id_number;
		this.title = title;
		this.numberOfcopies = numberOfcopies;
	}

	@Override
	public String toString() {
		return "Item [id_number=" + id_number + ", title=" + title + ", numberOfcopies=" + numberOfcopies + "]";
	}

	public int getId_number() {
		return id_number;
	}

	public void setId_number(int id_number) {
		this.id_number = id_number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfcopies() {
		return numberOfcopies;
	}

	public void setNumberOfcopies(int numberOfcopies) {
		this.numberOfcopies = numberOfcopies;
	}

	public void checkIn() {
		numberOfcopies = numberOfcopies + 1;
	}

	public void checkOut() {
		numberOfcopies = numberOfcopies - 1;
	}

	public void addItem(int idNum, String str, int n) {
		setId_number(idNum);
		setTitle(str);
		setNumberOfcopies(n);
	}

	public void print() {
		System.out.println("Title: " + title);
		System.out.println("ID: " + id_number);
		System.out.println("Number of copies: " + numberOfcopies);
	}
}

abstract class WrittenItem extends Item {

	public WrittenItem(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private String Author;
	private String Publication;

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublication() {
		return Publication;
	}

	public void setPublication(String publication) {
		Publication = publication;
	}
}

class Book extends WrittenItem {

	public Book(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getPublishedYear()=" + getPublication() + ", toString()="
				+ super.toString() + ", getId_number()=" + getId_number() + ", getTitle()=" + getTitle()
				+ ", getNumberOfcopies()=" + getNumberOfcopies() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public int getId_number() {
		return super.getId_number();
	}

	public String getTitle() {
		return super.getTitle();
	}

	public int getNumberOfcopies() {
		return super.getNumberOfcopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public void print() {
		System.out.println("Display info about a book: ");
		super.print();
	}

	public void checkIn() {
		super.checkIn();
	}

	public void checkOut() {
		super.checkOut();
	}
}

class JournalPaper extends WrittenItem {

	public JournalPaper(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private int PublicationYear;

	public int getPublicationYear() {
		return PublicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		PublicationYear = publicationYear;
	}

	public String toString() {
		return super.toString() + " Year published: " + PublicationYear;
	}

	public int getId_number() {
		return super.getId_number();
	}

	public String Title() {
		return super.getTitle();
	}

	public int NumberOfcopies() {
		return super.getNumberOfcopies();
	}

	public String getAuthor() {
		return super.getAuthor();
	}

	public int yearPub() {
		return PublicationYear;
	}

	public void print() {
		super.print();
		System.out.println("Year published: " + PublicationYear);
	}
}

abstract class MediaItem extends Item {
	public MediaItem(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private int runtime;
}

class video extends MediaItem {

	public video(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private String Director;
	private String Genre;
	private int yearOfrelease;

	public String getDirector() {
		return Director;
	}

	public void setDirector(String director) {
		Director = director;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getYearOfrelease() {
		return yearOfrelease;
	}

	public void setYearOfrelease(int yearOfrelease) {
		this.yearOfrelease = yearOfrelease;
	}
}

class CD extends MediaItem {

	public CD(int id_number, String title, int numberOfcopies) {
		super(id_number, title, numberOfcopies);
		// TODO Auto-generated constructor stub
	}

	private String artist;
	private String genre;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}