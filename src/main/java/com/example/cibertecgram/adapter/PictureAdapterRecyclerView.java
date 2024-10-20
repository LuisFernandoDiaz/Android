package com.example.cibertecgram.adapter;

import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cibertecgram.R;
import com.example.cibertecgram.databinding.ActivityContainerBinding;
import com.example.cibertecgram.model.Picture;

import java.util.ArrayList;

public class PictureAdapterRecyclerView  extends  RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>  {

    private ArrayList<Picture>  pictures;
    private int resource;

    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

         View view = LayoutInflater.from(parent
                 .getContext()).inflate(resource, parent, false);
         return new PictureViewHolder(view);



    }

    @Override
    public void onBindViewHolder(@NonNull PictureViewHolder holder, int position) {

        Picture picture = pictures.get(position);
        holder.namePizza.setText(picture.getUserName());
        holder.lugarPizza.setText(picture.getTime());
        holder.tiempoPizza.setText(picture.getLike_number());


    }

    @Override
    public int getItemCount() {

        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;

        private TextView namePizza ;
        private TextView lugarPizza ;
        private TextView tiempoPizza ;




        public PictureViewHolder(@NonNull View itemView) {
            super(itemView);

            pictureCard = (ImageView)  itemView.findViewById(R.id.pictureCard);
            namePizza = (TextView)  itemView.findViewById(R.id.namePizza);
            lugarPizza = (TextView)  itemView.findViewById(R.id.lugarPizza);
            tiempoPizza = (TextView)  itemView.findViewById(R.id.tiempoPizza);



        }
    }



}
