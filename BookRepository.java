package net.codejava.BookREST;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Integer> {
	List<Book> findByAuthor(@Param(value = "author") String author);
}
