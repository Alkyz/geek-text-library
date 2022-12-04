package com.alkyz.ratingcommenting.RatingInfo.Service;
import com.alkyz.ratingcommenting.RatingInfo.Entity.Rating;
import com.alkyz.ratingcommenting.RatingInfo.RatingException;
import com.alkyz.ratingcommenting.RatingInfo.Repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RatingService {

    private final RatingRepository ratingRepository;

    @Autowired
    public RatingService(RatingRepository ratingRepository) {
        this.ratingRepository = ratingRepository;
    }

    public List<Rating> getRating() {
        return ratingRepository.findAll();
    }

    public void addNewRatingInfo(Rating rating) throws RatingException {
        System.out.println(rating.getCommentID());
        if (rating.getStars() > 5 || rating.getStars() < 1) {
            throw new RatingException("stars out of bounds");
        } else {
            ratingRepository.save(rating);
        }
    }

    public List<Rating> getRatingDesc() {
        return ratingRepository.findAll(Sort.by(Sort.Direction.DESC, "stars"));
    }

    public Double getAverage() {
        return ratingRepository.getAverage();
    }
}
