package com.maho.upi.test.Presenter;

import com.maho.upi.test.Model.ModelPlayer;
import com.maho.upi.test.View.MainView;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class MainPresenterImpl implements Presenter, Intractor.OnFinishedListener {

	private MainView mainView;
	private Intractor intractor;

	public MainPresenterImpl(MainView mainView, Intractor intractor) {
		this.mainView = mainView;
		this.intractor = intractor;
	}


	@Override
	public void onFinished(ArrayList<ModelPlayer> modelPlayerArrayList) {
		if (this.mainView != null){
			mainView.setDataToRecyclerView(modelPlayerArrayList);
			mainView.hideProgress();
		}
	}

	@Override
	public void onFailure(Throwable t) {
		if (this.mainView != null){
			mainView.onResponseFailure(t);
			mainView.hideProgress();
		}
	}

	@Override
	public void onDestroy() {
		this.mainView = null;
	}

	@Override
	public void requestDataFromServer() {
		intractor.getModelPlayerArrayList(this);
	}
}
