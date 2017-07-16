package com.example.owner.booklisting;

import android.app.Activity;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Owner on 7/15/2017.
 */

public class BookListAdapter extends ArrayAdapter<BookList>{

    public BookListAdapter(Activity context, ArrayList<BookList> bookListRecords){
        super(context, 0, bookListRecords);
    }


}
