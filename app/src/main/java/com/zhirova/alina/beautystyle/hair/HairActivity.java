package com.zhirova.alina.beautystyle.hair;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.zhirova.alina.beautystyle.R;
import com.zhirova.alina.beautystyle.nails.Nail;

public class HairActivity extends AppCompatActivity {

    public static final String EXTRA_HAIRNOM = "hairNom";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        int hairNom = (int)getIntent().getExtras().get(EXTRA_HAIRNOM);
        Hair curHair = Hair.hairs[hairNom];

        ImageView curPhoto = findViewById(R.id.hair_detail_image);
        curPhoto.setImageResource(curHair.getImageResourceID());

        TextView curName = findViewById(R.id.hair_detail_name_text);
        curName.setText(curHair.getName());

        TextView curDescription = findViewById(R.id.hair_detail_desc_text);
        curDescription.setText(curHair.getDescription());
    }


}
