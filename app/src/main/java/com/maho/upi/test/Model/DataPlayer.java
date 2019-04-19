package com.maho.upi.test.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

@SuppressWarnings("ALL")
public class DataPlayer {
	@SerializedName("DataPlayer")
	private ArrayList<ModelPlayer> modelPlayersList;

	public ArrayList<ModelPlayer> getModelPlayersList() {
		return modelPlayersList;
	}

	public void setModelPlayersList(ArrayList<ModelPlayer> modelPlayersList) {
		this.modelPlayersList = modelPlayersList;
	}
}
