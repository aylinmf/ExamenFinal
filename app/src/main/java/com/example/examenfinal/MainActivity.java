package com.example.examenfinal;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnfot;
    ImageView imgView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnfot = findViewById(R.id.btnfot);
        imgView = findViewById(R.id.imageView);

        btnfot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirCamara();
            }
        });

    }

    private void abrirCamara() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        //if(intent.resolveActivity(getPackageManager())!=null){
        startActivityForResult(intent, 1);

        //}
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imgBitmap = (Bitmap) extras.get("data");
            imgView.setImageBitmap(imgBitmap);
        }
    }
}