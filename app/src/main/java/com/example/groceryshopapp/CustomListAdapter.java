package com.example.groceryshopapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomListAdapter extends ArrayAdapter<String> {
    private Context context;
    private List<String> categories;

    public CustomListAdapter(Context context, List<String> categories) {
        super(context, 0, categories);
        this.context = context;
        this.categories = categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        TextView categoryTextView = convertView.findViewById(android.R.id.text1);
        categoryTextView.setText(categories.get(position));

        return convertView;
    }
}

