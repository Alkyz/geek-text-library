package com.alkyz04.goodbooks.repository;
import java.util.*;

import com.alkyz04.goodbooks.entity.RatingInfo;
import org.springframework.data.repository.CrudRepository;

public interface RatingInfoRepository extends CrudRepository<RatingInfo, String> {
    List<RatingInfo> sortRatings(List<RatingInfo> ratings);
    Integer findAvgRating(List<RatingInfo> ratings);

}
