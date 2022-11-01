package net.codejava.BookREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@GetMapping("/books")
	public List<Book> list() {
		return service.listAll();
	}
	
	@GetMapping("/books/{ISBN}")
	public Book get(@PathVariable Integer ISBN) {
		return service.get(ISBN);
	}
	
	@GetMapping("/books/authors/{author}")
	public List<Book> findByAuthor(@PathVariable("author") String author) {
		return service.findByAuthor(author);
	}
	
	@PostMapping(path = "/add-book", consumes = {"applicaiton/json"})
	public Book registerNewBook(@RequestBody Book book) {
		Book destination = repo.saveAndFlush(book);
		System.out.println("Book added.\n");
		return destination;
	}
	
	

}
