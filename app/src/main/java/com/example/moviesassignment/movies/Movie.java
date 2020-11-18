package com.example.moviesassignment.movies;

public class Movie {
    private String mTitle;
    private String mRatings;
    private String mDescription;
    private int mImage;

    public Movie(String mTitle, String mRatings, String mDescription, int mImage) {
        this.mTitle = mTitle;
        this.mRatings = mRatings;
        this.mDescription = mDescription;
        this.mImage = mImage;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmRatings() {
        return mRatings;
    }

    public void setmRatings(String mRatings) {
        this.mRatings = mRatings;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }
}
