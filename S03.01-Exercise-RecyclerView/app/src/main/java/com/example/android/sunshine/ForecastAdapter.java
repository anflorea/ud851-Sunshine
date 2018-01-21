package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by flo on 19/01/2018.
 */

//        Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
//        COMPLETED (15) Add a class file called ForecastAdapter
//        COMPLETED (22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
//
//        COMPLETED (23) Create a private string array called mWeatherData
//
//        COMPLETED (47) Create the default constructor (we will pass in parameters in a later lesson)
//
//        COMPLETED (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
//        COMPELTED (17) Extend RecyclerView.ViewHolder

//        COMPLETED (24) Override onCreateViewHolder
//        COMPLETED (25) Within onCreateViewHolder, inflate the list item xml into a view
//        COMPLETED (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter
//
//        COMPLETED (27) Override onBindViewHolder
//        COMPLETED (28) Set the text of the TextView to the weather for this list item's position
//
//        COMPLETED (29) Override getItemCount
//        COMPLETED (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null
//
//        COMPLETED (31) Create a setWeatherData method that saves the weatherData to mWeatherData
//        COMPLETED (32) After you save mWeatherData, call notifyDataSetChanged
//        Within ForecastAdapter.java /////////////////////////////////////////////////////////////////

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {

    private String[] mWeatherData;

    public ForecastAdapter() {

    }

    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParrentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParrentImmediately);
        return new ForecastAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewHolder holder, int position) {
        holder.mWeatherTextView.setText(mWeatherData[position]);
    }

    void setWeatherData(String[] weatherData) {
        mWeatherData = weatherData;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null)
            return 0;
        else
            return mWeatherData.length;
    }

    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder {
//        Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////
//        COMPLETED (18) Create a public final TextView variable called mWeatherTextView
//
//        COMPLETED (19) Create a constructor for this class that accepts a View as a parameter
//        COMPLETED (20) Call super(view) within the constructor for ForecastAdapterViewHolder
//        COMPELTED (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
//        Within ForecastAdapterViewHolder ///////////////////////////////////////////////////////////

        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View view) {
            super(view);

            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
        }

    }
}
