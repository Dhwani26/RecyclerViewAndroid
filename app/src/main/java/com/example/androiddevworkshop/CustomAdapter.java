package com.example.androiddevworkshop;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder>{
    /* This is the data that the adapter will work upon*/
    String[] data;

    /*
    * This constructor is required so that we can set the data the adapter will work upon
    */
    public CustomAdapter(String[] data){
        this.data = data;
    }

    /*
    * This will create the required views and keep it in the newly created ViewHolder
    */
    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    /*
    * This function will bind the data to the views created in onCreateViewHolder
    */
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {

    }

    /*
    * This function gives the itemCount of the data to be displayed in the recyclerView
    */
    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder{

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
