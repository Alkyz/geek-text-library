package com.alkyz.ratingcommenting.RatingInfo.Repository;

import com.alkyz.ratingcommenting.RatingInfo.Entity.Rating;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
@Transactional

public interface RatingRepository extends JpaRepository<Rating, String> {

    @Query("SELECT AVG(stars) FROM Rating")
    Double getAverage();

}


