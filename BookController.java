package net.codejava.BookREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	private BookRepository repo;
	
	/*
	@Autowired
	private AuthorRepository author_repo;
	*/
	
	// @PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("goodbooksdata/books")
	public List<Book> list() {
		return service.listAll();
	}
	
	// @PreAuthorize("hasRole('ROLE_USER')")
	@GetMapping("goodbooksdata/books/{ISBN}")
	public Book get(@PathVariable Integer ISBN) {
		return service.get(ISBN);
	}
	
	// @PreAuthorize("hasRole('ROLE_ADMIN')")
	@GetMapping("goodbooksdata/books/authors/{author}")
	public List<Book> findByAuthor(@PathVariable("author") String author) {
		return service.findByAuthor(author);
	}
	
	@PostMapping("goodbooksdata/books")
	public void registerNewBook(@RequestBody Book book) {
		service.addNewBook(book);
	}

}
