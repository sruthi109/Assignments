package com.example.moviesassignment.movies;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import com.example.moviesassignment.R;

public class movieAdapter extends ArrayAdapter<Movie>
{

    private Context mContext;
    private List<Movie> moviesList = new ArrayList<>();

    public movieAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<Movie> list) {
        super(context, 0 , list);
        mContext = context;
        moviesList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.listitem,parent,false);

        Movie currentMovie = moviesList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_movieimage);
        image.setImageResource(currentMovie.getmImage());

        TextView title = (TextView) listItem.findViewById(R.id.textView_movietitle);
        title.setText(currentMovie.getmTitle());

        TextView rating = (TextView) listItem.findViewById(R.id.textView_movierating);
        rating.setText(currentMovie.getmRatings());

        TextView description = (TextView) listItem.findViewById(R.id.textView_moviedescription);
        description.setText(currentMovie.getmDescription());

        return listItem;
    }
}


