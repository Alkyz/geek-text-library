package net.codejava.BookREST;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	private Integer ISBN;
	private String name;
	private String description;
	private Double price;
	private String author;
	private String genre;
	private String publisher;
	private Integer yearPublished;
	private Integer copiesSold;

	public Book() {
	}

	// Constructor

	public Book(Integer iSBN, String name, String description, Double price, String author, String genre,
			String publisher, Integer yearPublished, Integer copiesSold) {
		super();
		ISBN = iSBN;
		this.name = name;
		this.description = description;
		this.price = price;
		this.author = author;
		this.genre = genre;
		this.publisher = publisher;
		this.yearPublished = yearPublished;
		this.copiesSold = copiesSold;
	}

	// Getters and Setters
	@Id
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

	public Integer getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(Integer yearPublished) {
		this.yearPublished = yearPublished;
	}

	public Integer getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(Integer copiesSold) {
		this.copiesSold = copiesSold;
	}

}
