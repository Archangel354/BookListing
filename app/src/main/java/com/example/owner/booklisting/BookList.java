package com.example.owner.booklisting;

import java.util.Date;

/**
 * Created by Owner on 7/15/2017.
 */

public class BookList {


    // title for a particular book
    private String mTitle;

    // authors names for a particular book
    private String mAuthors;



    // publisher for a particular book
    private String mPublisher;

    // published date for a particular book
    private String mPublishedDate;

    public BookList(String Title, String Authors, String Publisher, String PublishedDate) {
        mAuthors = Authors;
        mTitle = Title;
        mPublisher = Publisher;
        mPublishedDate = PublishedDate;
    }

    public String getmAuthors() {
        return mAuthors;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmPublisher() {
        return mPublisher;
    }

    public String getmPublishedDate() {
        return mPublishedDate;
    }
}
