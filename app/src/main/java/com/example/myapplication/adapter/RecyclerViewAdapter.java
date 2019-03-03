package com.example.myapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.model.Movie;
import com.example.myapplication.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie> mData;
    RequestOptions option;

    public RecyclerViewAdapter(Context mContext, List<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;

        // Request option for glide

        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.movie_row_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_title.setText(mData.get(position).getTitle());
        holder.tv_type.setText(mData.get(position).getType());
        holder.tv_year.setText(mData.get(position).getYear());
        holder.tv_imdbid.setText(mData.get(position).getImdbID());

        //loading image from the internet and set it into imageview using glide

        Glide.with(mContext).load(mData.get(position).getPoster()).apply(option).into(holder.poster);



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_title;
        TextView tv_type;
        TextView tv_year;
        TextView tv_imdbid;
        ImageView poster;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_title = itemView.findViewById(R.id.movie_name);
            tv_type = itemView.findViewById(R.id.type);
            tv_year = itemView.findViewById(R.id.year);
            tv_imdbid = itemView.findViewById(R.id.imdb);
            poster = itemView.findViewById(R.id.thumbnail);

        }
    }
}
