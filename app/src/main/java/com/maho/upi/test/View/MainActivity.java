package com.maho.upi.test.View;

import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.maho.upi.test.Adapter.PlayerAdapter;
import com.maho.upi.test.Model.ModelHistory;
import com.maho.upi.test.Model.ModelPlayer;
import com.maho.upi.test.Presenter.IntractorImpl;
import com.maho.upi.test.Presenter.MainPresenterImpl;
import com.maho.upi.test.Presenter.Presenter;
import com.maho.upi.test.Presenter.RecyclerItemClickListener;
import com.maho.upi.test.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView{

	private ProgressDialog progressDialog;
	private RecyclerView recyclerView;

	Presenter presenter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		progressBarInit();
		recyclerViewAndToolbarInit();


		presenter = new MainPresenterImpl(this, new IntractorImpl());
		presenter.requestDataFromServer();
	}

	private void recyclerViewAndToolbarInit() {
		recyclerView = this.findViewById(R.id.listPlayer);
		RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
		recyclerView.setLayoutManager(layoutManager);
	}

	private void progressBarInit(){
		progressDialog = new ProgressDialog(MainActivity.this);
		progressDialog.setTitle("Sedang mengambil data");
		progressDialog.setMessage("Sekk");
		progressDialog.show();
	}

	@Override
	public void showProgress() {
		progressDialog.show();
	}

	@Override
	public void hideProgress() {
		progressDialog.dismiss();
	}

	private RecyclerItemClickListener recyclerItemClickListener = new RecyclerItemClickListener() {
		@Override
		public void onItemClick(ModelHistory klub) {
			Toast.makeText(MainActivity.this,
					"History:"+ klub.getKlub(),
					Toast.LENGTH_LONG).show();
		}
	};

	@Override
	public void setDataToRecyclerView(ArrayList<ModelPlayer> modelPlayerArrayList) {
		PlayerAdapter playerAdapter = new PlayerAdapter(modelPlayerArrayList,
				recyclerItemClickListener);
		recyclerView.setAdapter(playerAdapter);
	}

	@Override
	public void onResponseFailure(Throwable throwable) {
		Toast.makeText(MainActivity.this,
				"Jaringan error" + throwable.getMessage(),
				Toast.LENGTH_SHORT).show();
	}

	@Override
	public void history(List<ModelHistory> histories) {

	}

}
