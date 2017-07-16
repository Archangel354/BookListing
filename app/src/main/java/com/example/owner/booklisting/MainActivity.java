package com.example.owner.booklisting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // The URL for the books
    private static final String USGS_REQUEST_URL =
            "https://www.googleapis.com/books/v1/volumes?q=android&maxResults=1";
    public static final String BEGINNING_OF_URL = "https://www.googleapis.com/books/v1/volumes?q=";
    public static final String END_OF_URL = "&maxResults=3";
    public static String urlString = "";


    /** Adapter for the list of earthquakes */
    private BookListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Removes the circular loading indicator when it is not needed
        removeLoadingIndicator();

        // Get the search string from the EditText when the Search button is clicked
        Button btnSearch = (Button) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Build the complete URL string which will include the search string
                urlString = buildURLString(BEGINNING_OF_URL, END_OF_URL);
                Log.i("LOG","Inside onClickListener " + urlString);
            }
        });

        Log.i("LOG","the urlString is: " + urlString);




        // Find a reference to the {@link ListView} in the layout
        ListView bookListView = (ListView) findViewById(R.id.list);

        // Create a new adapter that takes an empty list of earthquakes as input
        mAdapter = new BookListAdapter(this, new ArrayList<BookList>());




    }

    // Removes the circular loading indicator when it is not needed
    public void removeLoadingIndicator(){
        // Remove the loading indicator
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

    }

    public String buildURLString(String beginningURL, String endURL){
        String searchString = "";
        EditText edtSearchString = (EditText) findViewById(R.id.edtSearchString);
        searchString = edtSearchString.getText().toString();

        String URLstring = beginningURL + searchString + endURL;
        return  URLstring;
    }
}
