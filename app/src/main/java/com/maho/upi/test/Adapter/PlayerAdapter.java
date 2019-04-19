package com.maho.upi.test.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.maho.upi.test.Model.ModelPlayer;
import com.maho.upi.test.Presenter.RecyclerItemClickListener;
import com.maho.upi.test.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("ALL")
public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.myViewHolder>{

	@NonNull
	Context context;
	ArrayList<ModelPlayer> modelListPlayer;
	private RecyclerItemClickListener recyclerItemClickListener;

	public PlayerAdapter(ArrayList<ModelPlayer> modelPlayerArrayList, RecyclerItemClickListener recyclerItemClickListener) {
		this.context = context;
		this.modelListPlayer = modelListPlayer;
		this.recyclerItemClickListener = recyclerItemClickListener;
	}

	@Override
	public PlayerAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(context).inflate(R.layout.list_player, parent, false);
		return new myViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull PlayerAdapter.myViewHolder holder, final int position) {
		holder.listnama.setText(modelListPlayer.get(position).getNama());
		holder.listumur.setText(modelListPlayer.get(position).getAge());
		final String gambar1 = new String(""+ modelListPlayer.get(position).getGambar());
		Picasso.with(context)
				.load(gambar1)
				.into(holder.listgambar);
		holder.itemView.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				recyclerItemClickListener.onItemClick(modelListPlayer.get(position).getHistory().toString());
			}
		});
	}

	@Override
	public int getItemCount() {
		if (modelListPlayer != null){
			return modelListPlayer.size();
		} else {
			return 0;
		}
	}
	public class myViewHolder extends RecyclerView.ViewHolder {
		TextView listnama, listumur;
		ImageView listgambar;

		public myViewHolder(View itemView) {
			super(itemView);

			listnama = (TextView) itemView.findViewById(R.id.txtNama);
			listumur = (TextView) itemView.findViewById(R.id.txtUmur);
			listgambar = (ImageView) itemView.findViewById(R.id.imgProfile);


		}
	}
}


