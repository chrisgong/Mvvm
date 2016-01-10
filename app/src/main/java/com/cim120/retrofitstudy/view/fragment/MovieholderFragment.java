package com.cim120.retrofitstudy.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cim120.retrofitstudy.MovieListBinding;
import com.cim120.retrofitstudy.R;
import com.cim120.retrofitstudy.view.widget.EndlessScrollListener;
import com.cim120.retrofitstudy.viewmodel.MovieListViewModel;

/**
 * Created by chrisgong on 16/1/9.
 */

public class MovieholderFragment extends BaseFragment<MovieListViewModel, MovieListBinding> {

    public MovieholderFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceStat) {
        setViewModel(new MovieListViewModel());
        setBinding(DataBindingUtil.<MovieListBinding>inflate(inflater, R.layout.fragment_main, container, true));
        getBinding().setViewModel(getViewModel());
        getViewModel().loadNetData(getBinding(), getActivity(), 0, 20);
        getBinding().rvMovie.setOnScrollListener(new EndlessScrollListener() {
            @Override
            public void onLoadMore(int page, int totalItemsCount) {
                if (totalItemsCount == 0) {
                    getViewModel().loadNetData(getBinding(), getActivity(), 0, 20);
                } else {
                    getViewModel().loadNetData(getBinding(), getActivity(), totalItemsCount - 1, 20);
                }
            }
        });

        return getBinding().getRoot();
    }
}