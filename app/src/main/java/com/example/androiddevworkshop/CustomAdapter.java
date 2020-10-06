package com.example.androiddevworkshop;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        /* LayoutInflater is used to inflate(create) views to be displayed onto the screen */
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        /* Inflate the view */
        View view = (View) layoutInflater.inflate(R.layout.custom_list_item, viewGroup, false);

        /* Return the newly created ViewHolder */
        return new CustomViewHolder(view);
    }

    /*
    * This function will bind the data to the views created in onCreateViewHolder
    */
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        /* Retrieve item from the dataList */
        String itemText = data[i];

        /* Set data to the view */
        customViewHolder.textView.setText(itemText);
    }

    /*
    * This function gives the itemCount of the data to be displayed in the recyclerView
    */
    @Override
    public int getItemCount() {
        return data.length;
    }

    /*
    * Holds all the views along with some references so as to avoid calling findViewById again and again
    */
    public class CustomViewHolder extends RecyclerView.ViewHolder{

        /* References */
        ImageView imageView ;
        TextView textView ;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            /* Assign the references */
            imageView = itemView.findViewById(R.id.itemImage);
            textView = itemView.findViewById(R.id.itemText);
        }
    }
}
