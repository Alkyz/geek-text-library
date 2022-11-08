package net.codejava.BookREST;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Integer> {
	List<Book> findByAuthor(@Param(value = "author") String author);
	
	@Query("SELECT s FROM Book s WHERE s.ISBN = ?1")
	Optional<Book> findBookByISBN(Integer ISBN);
}
