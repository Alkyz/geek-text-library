package net.codejava.bookbrowsing;

import java.awt.print.Book;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;



@Repository
@Transactional
public interface book_detailsRepository extends JpaRepository<book_details, String>,PagingAndSortingRepository<book_details, String>
{
	@Query(value = "select *from book_details bg where bg.book_genre = ?1", nativeQuery = true)
	List<book_details> findByGenre(String book_genre);
	
	@Query(value="select * from book_details",
            countQuery = "select count(ISBN) from book_details",
            nativeQuery = true)
    Page<book_details> getbookSelectionPageAcsByCol(Pageable page);
    
    @Query(value = "select * from book_details  asc OFFSET ?1 LIMIT ?1", nativeQuery = true)
        //List<book_details> selectLimitandOffset();
    Page<book_details> getLimitAndOffsetPageAcsByCol(Pageable page);
    
    @Query(value = "SELECT TOP 10 * FROM book_details a WHERE a.copiesSold <= :copiesSold ORDER BY a.copiesSold", nativeQuery = true)
    book_details findTopten(int copiesSold);
	
    @Query(value = "select * from book_details r where r.Stars >= ?1", nativeQuery = true)
    List<book_details> findByStarsGreaterThanEqual(int Stars);
  
	
	@Query(value= "select * from book_details  b where b.copiesSold  order by b.copiesSold desc limit 0,10",
            nativeQuery = true)
	List<book_details> findTopTenSellers(Integer copiesSold);
    
	
}
