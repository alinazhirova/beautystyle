package com.zhirova.alina.beautystyle.hair;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HairCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listHairs = getListView();
        ArrayAdapter<Hair> listAdapter = new ArrayAdapter<Hair>(this, android.R.layout.simple_list_item_1, Hair.hairs);
        listHairs.setAdapter(listAdapter);
    }


    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id) {
        Intent curIntent = new Intent(HairCategoryActivity.this, HairActivity.class);
        curIntent.putExtra(HairActivity.EXTRA_HAIRNOM, (int) id);
        startActivity(curIntent);
    }


}
