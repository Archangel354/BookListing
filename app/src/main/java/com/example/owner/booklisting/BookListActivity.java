package com.example.owner.booklisting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        // Removes the circular loading indicator when it is not needed
        removeLoadingIndicator();

        Intent mIntent = getIntent();
        String urlString = mIntent.getExtras().getString("urlString");
        Log.i("LOG.BOOKLISTACTIVITY","The url is: " + urlString);


    }


    // Removes the circular loading indicator when it is not needed
    public void removeLoadingIndicator(){
        // Remove the loading indicator
        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

    }

}
