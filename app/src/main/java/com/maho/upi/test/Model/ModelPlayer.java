package com.maho.upi.test.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("ALL")
public class ModelPlayer {
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("nama")
	@Expose
	private String nama;
	@SerializedName("history")
	@Expose
	private List<ModelHistory> history = null;
	@SerializedName("age")
	@Expose
	private String age;
	@SerializedName("gambar")
	@Expose
	private String gambar;

	public ModelPlayer(String id, String nama, List<ModelHistory> history, String age, String gambar) {
		this.id = id;
		this.nama = nama;
		this.history = history;
		this.age = age;
		this.gambar = gambar;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public List<ModelHistory> getHistory() {
		return history;
	}

	public void setHistory(List<ModelHistory> history) {
		this.history = history;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGambar() {
		return gambar;
	}

	public void setGambar(String gambar) {
		this.gambar = gambar;
	}
}
