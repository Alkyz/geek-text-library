package net.codejava.BookREST;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="author")
public class Author {

	@Id
	@GeneratedValue
	@Column(name = "author_id")
	private Integer author_id;
	
	private String first_name;
	private String last_name;
	private String full_name;
	private String biogrpahy;
	private String author_publisher;
	private String book_author_FK;
	
	public Author(Integer author_id, String first_name, String last_name, String full_name, String biogrpahy, String author_publisher, String book_author_FK) {
		super();
		this.author_id = author_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.biogrpahy = biogrpahy;
		this.author_publisher = author_publisher;
		this.book_author_FK = book_author_FK;
		this.full_name = full_name;
	}
	
	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public String getBook_author_FK() {
		return book_author_FK;
	}

	public void setBook_author_FK(String book_author_FK) {
		this.book_author_FK = book_author_FK;
	}



	public Integer getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Integer author_id) {
		this.author_id = author_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getBiogrpahy() {
		return biogrpahy;
	}

	public void setBiogrpahy(String biogrpahy) {
		this.biogrpahy = biogrpahy;
	}

	public String getAuthor_publisher() {
		return author_publisher;
	}

	public void setAuthor_publisher(String author_publisher) {
		this.author_publisher = author_publisher;
	}
	
	

}
