package com.zhirova.alina.beautystyle.nails;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NailCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listNails = getListView();
        ArrayAdapter<Nail> listAdapter = new ArrayAdapter<Nail>(this, android.R.layout.simple_list_item_1, Nail.nails);
        listNails.setAdapter(listAdapter);
    }


    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent curIntent = new Intent(NailCategoryActivity.this, NailActivity.class);
        curIntent.putExtra(NailActivity.EXTRA_NAILNOM, (int) id);
        startActivity(curIntent);
    }


}
