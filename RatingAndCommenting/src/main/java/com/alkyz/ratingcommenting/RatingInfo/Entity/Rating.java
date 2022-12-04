package com.alkyz.ratingcommenting.RatingInfo.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table (name = "ratings")

public class Rating {

    @Id
    private int commentID;
    private String email;
    private String bookTitle;
    private int stars;
    @Temporal(TemporalType.DATE)
    private LocalDate dateStamp;
    private String comment;
    private int isbn;


    public Rating(int commentID, String email, String bookTitle, Integer stars, LocalDate dateStamp, String comment, int isbn) {
        this.commentID = commentID;
        this.email = email;
        this.bookTitle = bookTitle;
        this.stars = stars;
        this.dateStamp = dateStamp;
        this.comment = comment;
        this.isbn = isbn;
    }

    public Rating() {

    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public LocalDate getDateStamp() {
        return dateStamp;
    }

    public void setDateStamp(LocalDate dateStamp) {
        this.dateStamp = dateStamp;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "RatingInfo{" +
                "commentID='" + commentID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", stars=" + stars +
                ", dateStamp=" + dateStamp +
                ", comment='" + comment + '\'' +
                '}';
    }

}
