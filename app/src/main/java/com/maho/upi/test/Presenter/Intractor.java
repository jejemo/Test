package com.maho.upi.test.Presenter;

import com.maho.upi.test.Model.ModelPlayer;

import java.util.ArrayList;

public interface Intractor {
	interface OnFinishedListener{
		void onFinished(ArrayList<ModelPlayer> modelPlayerArrayList);
		void onFailure(Throwable t);
	}
	void getModelPlayerArrayList(OnFinishedListener onFinishedListener);
}
