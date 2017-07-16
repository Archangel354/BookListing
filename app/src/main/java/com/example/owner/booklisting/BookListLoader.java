package com.example.owner.booklisting;

import android.content.AsyncTaskLoader;
import android.content.Context;

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
    public List<BookList> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        return null;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }
}
