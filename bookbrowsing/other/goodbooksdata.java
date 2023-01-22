package net.codejava;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class goodbooksdata {

	private int ISBN;
	private int yearPublished;
	private int copiesSold;
	private int book_price;
	private String book_author;
	private String book_description;
	private String book_genre;
	private String book_name;
	private String book_publisher;

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}

	public String getBook_description() {
		return book_description;
	}

	public void setBook_description(String book_description) {
		this.book_description = book_description;
	}

	public String getBook_genre() {
		return book_genre;
	}

	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getBook_publisher() {
		return book_publisher;
	}

	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}

	public goodbooksdata() {
		super();
		// TODO Auto-generated constructor stub
	}

	public goodbooksdata(int iSBN, int yearPublished, int copiesSold, int book_price, String book_author,
			String book_description, String book_genre, String book_name, String book_publisher) {
		super();
		ISBN = iSBN;
		this.yearPublished = yearPublished;
		this.copiesSold = copiesSold;
		this.book_price = book_price;
		this.book_author = book_author;
		this.book_description = book_description;
		this.book_genre = book_genre;
		this.book_name = book_name;
		this.book_publisher = book_publisher;
	}

}
