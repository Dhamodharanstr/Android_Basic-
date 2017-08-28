package com.nrsoftbd.healthtips;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button tips1, tips2, tips3, tips4, tips5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tips1 = (Button)findViewById(R.id.tips1);
		tips1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Tips_1.class);
				startActivity(i);
				
			}
		});
		
		tips2 = (Button)findViewById(R.id.tips2);
		tips2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Tips_2.class);
				startActivity(i);
				
			}
		});
		
		tips3=(Button)findViewById(R.id.tips3);
		tips3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Tips_3.class);
				startActivity(i);
				
			}
		});
		
		tips4=(Button)findViewById(R.id.tips4);
		tips4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Tips_4.class);
				startActivity(i);
				
			}
		});
		tips5=(Button)findViewById(R.id.tips5);
		tips5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i = new Intent(MainActivity.this, Tips_5.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
