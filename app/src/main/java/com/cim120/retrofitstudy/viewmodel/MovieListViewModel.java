package com.cim120.retrofitstudy.viewmodel;

import android.content.Context;
import android.databinding.ObservableField;
import android.view.View;

import com.cim120.retrofitstudy.App;
import com.cim120.retrofitstudy.MovieListBinding;
import com.cim120.retrofitstudy.data.remote.ApiUtils;
import com.cim120.retrofitstudy.model.Movie;
import com.cim120.retrofitstudy.model.Top250;
import com.cim120.retrofitstudy.view.adapter.MoviesAdapter;
import com.cim120.retrofitstudy.view.adapter.MoviesViewHolder;

import java.util.ArrayList;
import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import uk.co.ribot.easyadapter.EasyAdapter;

/**
 * Created by chrisgong on 16/1/9.
 */
public class MovieListViewModel extends ViewModel {
    public final ObservableField<EasyAdapter> movieListAdapter = new ObservableField<>();
    private MoviesAdapter<Movie> mAdapter;

    @Command
    public void loadNetData(MovieListBinding binding,Context context, int start, int end) {
        ApiUtils.getInstance().getResult(start, end)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Top250>() {
                    @Override
                    public void call(Top250 top250) {
                        ArrayList<Movie> movies = new ArrayList<>();
                        List<Top250.SubjectsEntity> subjectsEntities = top250.getSubjects();
                        for (Top250.SubjectsEntity subject : subjectsEntities) {
                            Movie movie = new Movie();
                            movie.setPoster(subject.getImages()
                                    .getSmall());
                            movie.setRating((float) subject.getRating()
                                    .getAverage());
                            movie.setTitle(subject.getTitle());
                            List<String> genres = subject.getGenres();
                            String genresStr = "";
                            for (String s : genres) {
                                genresStr += s + " ";
                            }
                            movie.setGenres(genresStr);
                            movies.add(movie);
                        }
                        if(mAdapter == null) {
                            binding.layoutPb.setVisibility(View.GONE);
                            mAdapter = new MoviesAdapter<Movie>(context, MoviesViewHolder.class, movies);
                            showContentList(mAdapter);
                        }else{
                            mAdapter.addItems(movies);
                        }
                    }
                });
    }

    @BindView
    public void showContentList(EasyAdapter adapter) {
        if (movieListAdapter != null)
            movieListAdapter.set(adapter);
    }
}
