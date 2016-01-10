package com.cim120.retrofitstudy.view.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cim120.retrofitstudy.App;
import com.cim120.retrofitstudy.R;
import com.cim120.retrofitstudy.model.Movie;
import com.squareup.picasso.Picasso;

import uk.co.ribot.easyadapter.ItemViewHolder;
import uk.co.ribot.easyadapter.PositionInfo;
import uk.co.ribot.easyadapter.annotations.LayoutId;
import uk.co.ribot.easyadapter.annotations.ViewId;

/**
 * Created by chrisgong on 16/1/9.
 */
@LayoutId(R.layout.item_movie)
public class MoviesViewHolder extends ItemViewHolder<Movie> {

    @ViewId(R.id.poster)
    ImageView poster;

    @ViewId(R.id.title)
    TextView title;

    @ViewId(R.id.genres)
    TextView  genres;

    @ViewId(R.id.rating)
    TextView  rating;

    @ViewId(R.id.number)
    TextView  number;

    public MoviesViewHolder(View view) {
        super(view);
    }

    @Override
    public void onSetValues(Movie movie, PositionInfo positionInfo) {
        Picasso.with(getContext())
                .load(movie.getPoster())
                .into(poster);
        title.setText(movie.getTitle());
        genres.setText(movie.getGenres());
        rating.setText(String.format(getContext().getString(R.string.rating), movie.getRating()));
        number.setText((positionInfo.getPosition() + 1) + "");
    }
}
