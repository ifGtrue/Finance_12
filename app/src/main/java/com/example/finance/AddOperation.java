package com.example.finance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddOperation extends AppCompatActivity {

    ImageView to_main_menu;
    Dialog calendar;

    ImageView callCalendar;

    private static boolean  RoG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_operation);

        to_main_menu = findViewById(R.id.to_main_menu);
        to_main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddOperation.this, MainActivity.class);
                startActivity(intent);
            }
        });



        callCalendar = findViewById(R.id.calendar);
        calendar = new Dialog(AddOperation.this);
        callCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowCalendar();
            }
        });


    }
    public void add(View view){
        EditText editTitle = this.findViewById(R.id.editDscr);
        EditText editMoney = this.findViewById(R.id.editMoney);
        EditText editDate = this.findViewById(R.id.editCom);
        Intent intent = new Intent(AddOperation.this, MainActivity.class);
        intent.putExtra("title", editTitle.getText().toString());
        intent.putExtra("money", editMoney.getText().toString());
        intent.putExtra("date", editDate.getText().toString());
        intent.putExtra("flag",true);
        startActivity(intent);

    }

    private void ShowCalendar() {
        calendar.setContentView(R.layout.calendar);
        Objects.requireNonNull(calendar.getWindow()).setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        calendar.show();


    }




}