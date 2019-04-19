package com.maho.upi.test.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("ALL")
public class ModelHistory {
	@SerializedName("id")
	@Expose
	private Integer id;
	@SerializedName("klub")
	@Expose
	private String klub;

	public ModelHistory(Integer id, String klub) {
		this.id = id;
		this.klub = klub;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}
}
