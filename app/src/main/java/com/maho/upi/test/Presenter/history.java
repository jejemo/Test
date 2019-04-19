package com.maho.upi.test.Presenter;

import com.maho.upi.test.Model.ModelHistory;
import com.maho.upi.test.Model.ModelPlayer;

import java.util.ArrayList;

public interface history {
	interface OnFinishedListener{
		void onFinished(ArrayList<ModelHistory> modelHistoryArrayList);
		void onFailure(Throwable t);
	}
	void getModelPlayerArrayList(Intractor.OnFinishedListener onFinishedListener);
}
