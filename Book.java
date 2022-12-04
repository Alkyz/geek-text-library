package net.codejava.BookREST;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "ISBN")
	private Integer ISBN;
	
	private String name;
	private String description;
	private Double price;
	private String author;
	private String genre;
	private String publisher;
	private Integer year_published;
	private Integer copies_sold;
	
	/*
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "book_author_FK", updatable = false, insertable = false)
	private List<Author> author;
	*/
	
	public Book() {
	}

	// Constructor

	public Book(Integer iSBN, String name, String description, Double price, String author, String genre,
			String publisher, Integer year_published, Integer copies_sold) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.description = description;
		this.price = price;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.year_published = year_published;
		this.copies_sold = copies_sold;
	}
	
	
	/*
	public List<Author> getAuthor() {
		return author;
	}

	public void setAuthor(List<Author> author) {
		this.author = author;
	}
	*/

	// Getters and Setters
	public Integer getISBN() {
		return ISBN;
	}

	public void setISBN(Integer iSBN) {
		ISBN = iSBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getyear_published() {
		return year_published;
	}

	public void setyear_published(Integer year_published) {
		this.year_published = year_published;
	}

	public Integer getcopies_sold() {
		return copies_sold;
	}

	public void setcopies_sold(Integer copies_sold) {
		this.copies_sold = copies_sold;
	}

}
