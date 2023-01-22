package net.codejava.bookbrowsing;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;



@Repository
public interface book_detailsRepository extends JpaRepository<book_details, Integer>{
	//List<goodbooksdata> findByISBN(@Param(value = "ISBN") Integer ISBN);
	@Query("select book_genre from book_details book_genre where book_genre.book_genre = ?1")
		List<book_details> findByBook_genre(@Param(value = "genre") String genre);
		
	@Query("select copiesSold from book_details copiesSold where copiesSold.copiesSold = ?1")
	List<book_details> findByTopSellers(@Param(value = "TopSellers") Integer TopSellers);
	
	@Query("select book_name from book_details book_name where book_name.book_name =?1 ")
		List<book_details> getBook( @RequestParam int ISBN, @RequestParam String book_name, @RequestParam String book_description);
		
	@Query(nativeQuery = true, value = "SELECT * FROM book_details s WHERE s.copiesSold = :copiesSold ORDER BY snumber DESC LIMIT 10")
		List<book_details> gettopten(@Param("copiesSold") Integer copiesSold);
	
		
	@Query(nativeQuery = true, value ="SELECT * FROM  ratings r WHERE r.Stars >= :Stars " )
		List<book_details> findByStars(@Param(value = "Stars") Integer Stars);
}
