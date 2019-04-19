package com.maho.upi.test.Apis;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIServices {
	private static Retrofit retrofit ;
	private  static final String BASE_URL = "https://private-0e6b9-ganjarwidiatmansyah.apiary-mock.com/";

	public static Retrofit getDataPemain(){
		if (retrofit == null){
			retrofit = new retrofit2.Retrofit.Builder()
					.baseUrl(BASE_URL)
					.addConverterFactory(GsonConverterFactory.create())
					.build();
		}

		return retrofit;
	}
}
