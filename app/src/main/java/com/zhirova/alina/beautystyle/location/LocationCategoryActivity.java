package com.zhirova.alina.beautystyle.location;


import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class LocationCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listLocation = getListView();
        ArrayAdapter<Location> listAdapter = new ArrayAdapter<Location>(this, android.R.layout.simple_list_item_1, Location.locations);
        listLocation.setAdapter(listAdapter);
    }


}
