package com.example.owner.booklisting;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Owner on 7/15/2017.
 */

public class BookListAdapter extends ArrayAdapter<BookList> {

    public BookListAdapter(Activity context, ArrayList<BookList> bookListRecords) {
        super(context, 0, bookListRecords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }
        // Get the EarthquakeRecord object located at this "position" in the list
        BookList currentBook = getItem(position);

        TextView txtTitleView = (TextView) listItemView.findViewById(R.id.txtTitle);

        // Find the TextView in the list_item.xml layout with the ID txtMagnitude
        //TextView textMagnitude = (TextView) listItemView.findViewById(txtMagnitude);
        // Get the magnitude from the current EarthquakeRecord object and
        // set this text on the magnitude TextView
        txtTitleView.setText(String.valueOf(currentBook.getmTitle()));

        // Find the TextView in the list_item.xml layout with the ID txtOffsetLocation
        TextView textAuthor = (TextView) listItemView.findViewById(R.id.txtAuthor);
        // Get the city from the current EarthquakeRecord object and
        // set this text on the city TextView
        textAuthor.setText(currentBook.getmAuthors());

        // Find the TextView in the list_item.xml layout with the ID txtCity
        TextView textPublisher = (TextView) listItemView.findViewById(R.id.txtPublisher);
        // Get the city from the current EarthquakeRecord object and
        // set this text on the city TextView
        textPublisher.setText(currentBook.getmPublisher());

        // Find the TextView in the list_item.xml layout with the ID txtDate
        TextView textPublishedDate = (TextView) listItemView.findViewById(R.id.txtPublishedDate);
        // Get the city from the current EarthquakeRecord object and
        // set this text on the city TextView
        textPublishedDate.setText(currentBook.getmPublishedDate());

        return listItemView;
    }
}
