package com.example.demodynamicarraylist.adapter;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.demodynamicarraylist.R;
import com.example.demodynamicarraylist.listner.ClickListner;

import java.util.ArrayList;
import java.util.List;

public class BrandAdapter extends RecyclerView.Adapter<BrandAdapter.MyViewHolder> {

	private ArrayList<String> brandList;
	private ClickListner clickListner;

	public BrandAdapter(ArrayList<String> brandList, ClickListner clickListner) {
		this.brandList = brandList;
		this.clickListner = clickListner;
	}

	@NonNull
	@Override
	public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View itemView = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.row_brand, parent, false);

		return new MyViewHolder(itemView);
	}


	@Override
	public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") final int position) {
		final String brandModel = brandList.get(position);
		holder.txt_productName.setText(brandModel);
		holder.rl_product.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				clickListner.onClick(brandModel);
			}
		});

	}

	@Override
	public int getItemCount() {
		return brandList.size();
	}

	class MyViewHolder extends RecyclerView.ViewHolder {
		TextView txt_productName;
		RelativeLayout rl_product;

		MyViewHolder(View view) {
			super(view);
			txt_productName = view.findViewById(R.id.txt_productName);
			rl_product = view.findViewById(R.id.rl_product);
		}
	}
}