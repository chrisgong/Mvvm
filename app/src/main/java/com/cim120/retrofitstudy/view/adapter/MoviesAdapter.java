package com.cim120.retrofitstudy.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.cim120.retrofitstudy.R;
import com.cim120.retrofitstudy.model.Movie;

import java.util.ArrayList;
import java.util.List;

import uk.co.ribot.easyadapter.BaseEasyAdapter;
import uk.co.ribot.easyadapter.EasyAdapter;
import uk.co.ribot.easyadapter.ItemViewHolder;

/**
 * Created by chrisgong on 16/1/9.
 */
public class MoviesAdapter<Movie> extends EasyAdapter<Movie> {

    public static final int VIEW_TYPE_LOADING = 0;
    public static final int VIEW_TYPE_ACTIVITY = 1;
    private List<Movie> movies = new ArrayList<>();
    private Context mContext;

    public MoviesAdapter(Context context, Class<? extends ItemViewHolder> itemViewHolderClass, List<Movie> listItems) {
        super(context, itemViewHolderClass, listItems);
        this.movies = listItems;
        this.mContext = context;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public int getItemViewType(int position) {
        return (position >= movies.size()) ? VIEW_TYPE_LOADING : VIEW_TYPE_ACTIVITY;
    }

    @Override
    public int getCount() {
        return null == movies || movies.size() == 0 ? 0 : movies.size() + 1;
    }

    @Override
    public Movie getItem(int position) {
        return (getItemViewType(position) == VIEW_TYPE_ACTIVITY) ? movies.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return (getItemViewType(position) == VIEW_TYPE_ACTIVITY) ? position : -1;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (getItemViewType(position) == VIEW_TYPE_LOADING) {
            return getFooterView(position, convertView, parent);
        }
        return super.getView(position, convertView, parent);
    }

    private View getFooterView(int position, View convertView, ViewGroup parent) {
        if (position >= 250) {
            return LayoutInflater.from(mContext)
                    .inflate(R.layout.loading_view_zero_height, null);
        }
        return LayoutInflater.from(mContext)
                .inflate(R.layout.loading_view, null);
    }
}
