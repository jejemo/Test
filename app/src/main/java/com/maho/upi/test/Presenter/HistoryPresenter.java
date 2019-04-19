package com.maho.upi.test.Presenter;

import android.util.Log;

import com.maho.upi.test.Apis.APIInterface;
import com.maho.upi.test.Apis.APIServices;
import com.maho.upi.test.Model.DataPlayer;
import com.maho.upi.test.View.MainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HistoryPresenter implements history{

	@Override
	public void getModelPlayerArrayList(final Intractor.OnFinishedListener onFinishedListener) {
		APIInterface dataPlayer = APIServices.getDataPemain().create(APIInterface.class);

		Call<DataPlayer> callPlayer = dataPlayer.getPemain();
		String msg = callPlayer.request().toString();
		Log.d("Retrofit",msg);

		callPlayer.enqueue(new Callback<DataPlayer>() {
			@Override
			public void onResponse(Call<DataPlayer> call, Response<DataPlayer> response) {
				String msg = response.body().getModelPlayersList().toString();
				Log.d("Retrofit body: ", msg);
				onFinishedListener.onFinished(response.body().getModelPlayersList());
			}

			@Override
			public void onFailure(Call<DataPlayer> call, Throwable t) {
				onFinishedListener.onFailure(t);
			}
		});
	}
}
