package com.zhirova.alina.beautystyle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhirova.alina.beautystyle.hair.HairCategoryActivity;
import com.zhirova.alina.beautystyle.location.LocationCategoryActivity;
import com.zhirova.alina.beautystyle.nails.NailCategoryActivity;

public class TopActvity extends AppCompatActivity {

    private ImageView nailsImage;
    private TextView nailsText;
    private ImageView hairImage;
    private TextView hairText;
    private ImageView locationImage;
    private TextView locationText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_top);

        nailsImage = findViewById(R.id.nail_image);
        nailsText = findViewById(R.id.nail_text);

        hairImage = findViewById(R.id.hair_image);
        hairText = findViewById(R.id.hair_text);

        locationImage = findViewById(R.id.loc_image);
        locationText = findViewById(R.id.loc_text);

        nailsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(TopActvity.this, NailCategoryActivity.class);
                startActivity(curIntent);
            }
        });

        nailsText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(TopActvity.this, NailCategoryActivity.class);
                startActivity(curIntent);
            }
        });

        hairImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(TopActvity.this, HairCategoryActivity.class);
                startActivity(curIntent);
            }
        });

        hairText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(TopActvity.this, HairCategoryActivity.class);
                startActivity(curIntent);
            }
        });

        locationImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(TopActvity.this, LocationCategoryActivity.class);
                startActivity(curIntent);
            }
        });

        locationText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent curIntent = new Intent(TopActvity.this, LocationCategoryActivity.class);
                startActivity(curIntent);
            }
        });
    }


}
