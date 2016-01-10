/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 *
 * @author Fernando Cejas (the android10 coder)
 */
package com.cim120.retrofitstudy.view.fragment;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.cim120.retrofitstudy.viewmodel.ViewModel;


/**
 * Base {@link Fragment} class for every fragment in this application.
 */
public abstract class BaseFragment<VM extends ViewModel, B extends ViewDataBinding> extends Fragment {

	private VM viewModel;
	private B binding;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}

	/**
	 * Shows a {@link Toast} message.
	 *
	 * @param message An string representing a message to be shown.
	 */
	protected void showToastMessage(String message) {
		Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
	}


	public void setViewModel(@NonNull VM viewModel) {
		this.viewModel = viewModel;
	}

	public VM getViewModel() {
		if (viewModel == null) {
			throw new NullPointerException("You should setViewModel first!");
		}
		return viewModel;
	}

	public void setBinding(@NonNull B binding) {
		this.binding = binding;
	}

	public B getBinding() {
		if (binding == null) {
			throw new NullPointerException("You should setBinding first!");
		}
		return binding;
	}

}
