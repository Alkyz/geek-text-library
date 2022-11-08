package net.codejava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface goodbooksdataRepository extends JpaRepository<goodbooksdata, Integer> {
        List<goodbooksdata> findByGenre(@Param(value = "genre") String book_genre );
        List<goodbooksdata> findTopSellers(@Param(value = "top seller") Integer copies_sold);
        List<goodbooksdata> searchByRating(@Param(value = "stars") Enum  Stars);
}
