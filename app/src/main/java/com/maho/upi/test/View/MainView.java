package com.maho.upi.test.View;

import com.maho.upi.test.Model.ModelHistory;
import com.maho.upi.test.Model.ModelPlayer;

import java.util.ArrayList;
import java.util.List;

public interface MainView {
	void showProgress();

	void hideProgress();

	void setDataToRecyclerView(ArrayList<ModelPlayer> modelPlayerArrayList);

	void onResponseFailure(Throwable throwable);

	void history(List<ModelHistory> histories);
}
