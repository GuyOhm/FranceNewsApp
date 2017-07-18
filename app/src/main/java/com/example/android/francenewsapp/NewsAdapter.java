package com.example.android.francenewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Implement an ArrayAdapter of object of type {@link News}
 */

public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructor of ArrayAdapter of {@link News} object
     *
     * @param context  Used to inflate the layout
     * @param newsList List of {@link News} we want to display
     */
    public NewsAdapter(Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    /**
     * Provide a view for a AdapterView.
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // get the current {@link News} object at this position in the list
        News currentNews = getItem(position);

        // find the TextView for the news article title and set its value
        TextView newsTitle = (TextView) listItemView.findViewById(R.id.news_title);
        newsTitle.setText(currentNews.getNewsTitle());

        // find the TextView for the news section and set its value
        TextView newsSection = (TextView) listItemView.findViewById(R.id.news_section);
        newsSection.setText(currentNews.getNewsSection());

        return listItemView;
    }
}
