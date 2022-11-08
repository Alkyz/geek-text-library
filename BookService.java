package net.codejava.BookREST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public List<Book> listAll() {
		return repo.findAll();
	}
	
	public void save(Book book) {
		repo.save(book);
	}
	
	public Book get(Integer ISBN) {
		return repo.findById(ISBN).get();
	}

	public List<Book> findByAuthor(String author) {
		return repo.findByAuthor(author);
	}
	
	
	public void delete(Integer ISBN) {
		repo.deleteById(ISBN);
	}

	public void addNewBook(Book book) {
		Optional<Book> bookOptional = repo.findBookByISBN(book.getISBN());
		if (bookOptional.isPresent()) {
			throw new IllegalStateException("Book is already in library.");
		}
		repo.save(book);
		System.out.println(book);
	}
}
