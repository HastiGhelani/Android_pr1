package com.example.controlsdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final String[] description;
    private final int[] imgs;

    public MyListAdapter(Activity context, String[] title,
                         String[] description, int[] imgs) {
        super(context,R.layout.custom_list_item,title);
        this.context = context;
        this.title = title;
        this.description = description;
        this.imgs = imgs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,
                        @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rowView = inflater.inflate(R.layout.custom_list_item,parent,
                false);

        TextView txtTitle = rowView.findViewById(R.id.title);
        TextView txtDescription = rowView.findViewById(R.id.subtitle);
        ImageView img = rowView.findViewById(R.id.icon);

        txtTitle.setText(title[position]);
        txtDescription.setText(description[position]);
        img.setImageResource(imgs[position]);

        return rowView;
    }
}
