package com.example.customlist;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String mTitle[] ={"Facebook", "WhatApp", "Twitter", "Instagram", "Youtube", "Message", "Video", "Pinterest", "Setting"};
    String mDescription [] = {"Facebook Decription", "WhatApp Decription", "Twitter Decription", "Instagram Decription", "Youtube Decription", "Message Decription", "Pinterest Decription", "Setting Decription"};
    int images [] = {R.drawable.facebook, R.drawable.whatapp, R.drawable.twitter, R.drawable.instagram, R.drawable.youtube, R.drawable.chat, R.drawable.video, R.drawable.pinterest, R.drawable.setting};

    @Override
    protected  void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter( this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+0);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("description", mDescription[0]);
                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("description", mDescription[1]);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("description", mDescription[2]);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("description", mDescription[3]);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("description", mDescription[4]);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[5]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[5]);
                    intent.putExtra("description", mDescription[5]);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[6]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[6]);
                    intent.putExtra("description", mDescription[6]);
                }
                if (position == 7) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[7]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[7]);
                    intent.putExtra("description", mDescription[7]);
                }
                if (position == 8) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[8]);
                    intent.putExtras(bundle);
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                    intent.putExtra("title", mTitle[8]);
                    intent.putExtra("description", mDescription[8]);
                }
            }
        });
        //so item click is done now  check list view
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.TextView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.TextView1);
            TextView myDescription = row.findViewById(R.id.TextView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
