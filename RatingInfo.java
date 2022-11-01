package com.alkyz04.goodbooks.entity;
import com.alkyz04.goodbooks.Book;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RatingInfo {
    private String userName;
    private String bookTitle;
    private Integer stars;
    private Date dateStamp;
    private String comment;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Date getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(Date dateStamp) {
        this.dateStamp = dateStamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public RatingInfo(String bookTitle, Integer stars, Date dateStamp, String comment) {
        this.bookTitle = bookTitle;
        this.stars = stars;
        this.dateStamp = dateStamp;
        this.comment = comment;
    }

    public RatingInfo() {

    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "RatingInfo{" +
                "userName='" + userName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", stars=" + stars +
                ", dateStamp=" + dateStamp +
                ", comment='" + comment + '\'' +
                '}';
    }
}
