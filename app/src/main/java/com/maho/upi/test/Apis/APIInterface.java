package com.maho.upi.test.Apis;

import com.maho.upi.test.Model.DataPlayer;
import com.maho.upi.test.Model.ModelPlayer;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

@SuppressWarnings("ALL")
public interface APIInterface {
	@GET("history")
	Call<DataPlayer> getPemain();
}
