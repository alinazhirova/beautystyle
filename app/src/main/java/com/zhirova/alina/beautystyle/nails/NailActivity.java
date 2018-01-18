package com.zhirova.alina.beautystyle.nails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhirova.alina.beautystyle.R;
import com.zhirova.alina.beautystyle.nails.Nail;

public class NailActivity extends AppCompatActivity {

    public static final String EXTRA_NAILNOM = "nailNom";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nail);

        int nailNom = (int)getIntent().getExtras().get(EXTRA_NAILNOM);
        Nail curNail = Nail.nails[nailNom];

        ImageView curPhoto = findViewById(R.id.nail_detail_image);
        curPhoto.setImageResource(curNail.getImageResourceID());

        TextView curName = findViewById(R.id.nail_detail_name_text);
        curName.setText(curNail.getName());

        TextView curDescription = findViewById(R.id.nail_detail_desc_text);
        curDescription.setText(curNail.getDescription());
    }


}
