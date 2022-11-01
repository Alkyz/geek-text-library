package com.alkyz04.goodbooks.controller;

import com.alkyz04.goodbooks.entity.RatingInfo;
import com.alkyz04.goodbooks.repository.RatingInfoRepository;

import java.util.List;

public class RatingsCalculator extends RatingInfo {

    List<RatingInfo> sortRatings(List<RatingInfo> ratings) {
        int i, key, j;
        for (i = 1; i < ratings.size(); i++) {
            key = ratings.get(i).getStars();
            j = i - 1;

            while (j >= 0 && ratings.get(j).getStars() > key) {
                ratings.get(j+1).getStars() = ratings.get(j).getStars();
                j = j - 1;
            }
            ratings.get(j+1).getStars() = key;
        }
        return ratings;
    }
    Integer findAvgRating(List<RatingInfo> ratings) {
        int sum = 0;
        for (int i = 0; i < ratings.size(); i++) {
           sum += ratings.get(i).getStars();
        }
        Integer averageRatings = sum / ratings.size();

        return averageRatings;
    }
}
