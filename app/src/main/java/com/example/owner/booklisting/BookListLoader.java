package com.example.owner.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Created by Owner on 7/16/2017.
 */

public class BookListLoader extends AsyncTaskLoader<List<BookList>> {

    /** Query URL */
    private String mUrl;

    public BookListLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<BookList> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<BookList> books = Utils.fetchBookData(mUrl);
        return books;
    }


}
