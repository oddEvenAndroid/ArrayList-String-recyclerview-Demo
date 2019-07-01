package com.example.demodynamicarraylist.activity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.demodynamicarraylist.R;
import com.example.demodynamicarraylist.adapter.BrandAdapter;
import com.example.demodynamicarraylist.listner.ClickListner;
import com.example.demodynamicarraylist.response.AttributeResponse;
import com.example.demodynamicarraylist.retrofit.ApiClient;
import com.example.demodynamicarraylist.retrofit.ApiInterface;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements ClickListner {

	private ArrayList<String> stringList = new ArrayList<>();
	private RecyclerView rv;
	private BrandAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		rv = findViewById(R.id.myrecyclerview);

		final ApiInterface api = ApiClient.getApiService();
		Call<AttributeResponse> call = api.getAttributes(28);

		call.enqueue(new Callback<AttributeResponse>() {
			@SuppressLint("SetTextI18n")
			@Override
			public void onResponse(@NonNull Call<AttributeResponse> call, @NonNull Response<AttributeResponse> response) {
				if (response.code() == 200) {
					if (response.body() != null) {

						if (response.body().getStatusCode() == 200) {
							stringList = response.body().getDataclass().get(0).getAttribute_options();
							adapter = new BrandAdapter(stringList, MainActivity.this);
							rv.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayout.VERTICAL, false));
							rv.setHasFixedSize(true);
							rv.setItemAnimator(new DefaultItemAnimator());
							rv.setAdapter(adapter);
						}
					}
				}
			}

			@Override
			public void onFailure(Call<AttributeResponse> call, Throwable t) {
				Toast.makeText(MainActivity.this, "onFailer:  " + t.getMessage(), Toast.LENGTH_SHORT).show();
			}
		});

	}


	@Override
	public void onClick(String position) {
		Toast.makeText(this, "" + position, Toast.LENGTH_SHORT).show();
	}
}
