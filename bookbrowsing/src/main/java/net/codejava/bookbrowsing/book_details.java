package net.codejava.bookbrowsing;
import java.awt.print.Book;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;


@Entity
@Table(name = "book_details")
//@SecondaryTable(name = "ratings", pkJoinColumns= { @PrimaryKeyJoinColumn(name =  "ISBN ",referencedColumnName = "ISBN")})
//@NamedNativeQuery(name = "book_details.findByGenre", query = "select * FROM book_details bg where bg.book_genre = ?1", resultClass = book_details.class) 


public class book_details {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int ISBN;
	
	@Column(name = "yearPublished", table = "book_details")
	private int yearPublished;
	
	@Column(name = "copiesSold", table = "book_details")
	private int copiesSold;
	
	@Column(name = "book_price", table = "book_details")
	private int book_price;
	
	@Column(name = "book_author", table = "book_details")
	private String book_author;
	
	@Column(name = "book_description", table = "book_details")
	private String book_description;
	
	@Column(name = "book_genre", table = "book_details")
	private String book_genre;
	
	@Column(name = "book_name", table = "book_details")
	private String book_name;
	
	@Column(name = "book_publisher", table = "book_details")
	private String book_publisher;
	
	
	
	@Column(name = "Stars", table = "book_details")
	private int Stars;
	


   
    
	public Integer getStars() {
		return Stars;
	}
	public void setStars(Integer Stars) {
		this.Stars = Stars;
	}
	
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
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
	
	public book_details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book_details(int ISBN, int yearPublished, int copiesSold, int book_price, String book_author,
			String book_description, String book_genre, String book_name, String book_publisher, int Stars ) {
		super();
		this.ISBN = ISBN;
		this.yearPublished = yearPublished;
		this.copiesSold = copiesSold;
		this.book_price = book_price;
		this.book_author = book_author;
		this.book_description = book_description;
		this.book_genre =  book_genre;
		this.book_name = book_name;
		this.book_publisher = book_publisher;
		this.Stars = Stars;
		
		
	}


}

