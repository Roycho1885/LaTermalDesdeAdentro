package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Comida extends Activity {
	
		public class PersonalTouch implements View.OnTouchListener {

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch(event.getAction()){
				case MotionEvent.ACTION_DOWN:
					((TextView)v).setTextColor(0xFFFFFFFF);
					break;
				case MotionEvent.ACTION_CANCEL:
				case MotionEvent.ACTION_UP:
					((TextView)v).setTextColor(0xFFFF0000);
					break;
				}
				return false;
			}	
		}


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.comida);
		
		TextView como2 = (TextView) findViewById(R.id.como2);
		TextView como4 = (TextView) findViewById(R.id.como4);
		TextView como6 = (TextView) findViewById(R.id.como6);
		TextView como8 = (TextView) findViewById(R.id.como8);
		TextView como10 = (TextView) findViewById(R.id.como10);
		TextView como12 = (TextView) findViewById(R.id.como12);
		TextView como14 = (TextView) findViewById(R.id.como14);
		TextView como18 = (TextView) findViewById(R.id.como18);
		TextView como20 = (TextView) findViewById(R.id.como20);
		TextView como22 = (TextView) findViewById(R.id.como22);
		TextView como24 = (TextView) findViewById(R.id.como24);
		TextView como26 = (TextView) findViewById(R.id.como26);
		TextView como28 = (TextView) findViewById(R.id.como28);
		TextView como30 = (TextView) findViewById(R.id.como30);
		TextView como32 = (TextView) findViewById(R.id.como32);
		TextView como34 = (TextView) findViewById(R.id.como34);
		TextView como36 = (TextView) findViewById(R.id.como36);
		TextView como38 = (TextView) findViewById(R.id.como38);
		TextView como42 = (TextView) findViewById(R.id.como42);
		TextView como51 = (TextView) findViewById(R.id.como51);
		TextView como53 = (TextView) findViewById(R.id.como53);
		TextView como55 = (TextView) findViewById(R.id.como55);
		TextView como57 = (TextView) findViewById(R.id.como57);
		
		como2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/hDDBUzmBZQ82"));
				startActivity(j);
			}
		});
		como2.setOnTouchListener(new PersonalTouch());
		
		como4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/5BV9ha8pNJG2"));
				startActivity(j);
			}
		});
		como4.setOnTouchListener(new PersonalTouch());

		
		como6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/vbkK2R9fDYn"));
				startActivity(j);
			}
		});
		como6.setOnTouchListener(new PersonalTouch());
		
		como8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/fzzdantReXQ2"));
				startActivity(j);
			}
		});
		como8.setOnTouchListener(new PersonalTouch());
		
		como10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/HQfcuZo7qPT2"));
				startActivity(j);
			}
		});
		como10.setOnTouchListener(new PersonalTouch());
		
		como12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/HGWBV5nuJQ42"));
				startActivity(j);
			}
		});
		como12.setOnTouchListener(new PersonalTouch());
		
		como14.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/bnaK8ah2UWo"));
				startActivity(j);
			}
		});
		como14.setOnTouchListener(new PersonalTouch());

		
		como18.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/kWVok1sZqeT2"));
				startActivity(j);
			}
		});
		como18.setOnTouchListener(new PersonalTouch());
		
		como20.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Y4hX6m6CtjQ2"));
				startActivity(j);
			}
		});
		como20.setOnTouchListener(new PersonalTouch());
		
		como22.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/nak8wcKtpKJ2"));
				startActivity(j);
			}
		});
		como22.setOnTouchListener(new PersonalTouch());
		
		como24.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/bqLMBbcHEB22"));
				startActivity(j);
			}
		});
		como24.setOnTouchListener(new PersonalTouch());
		
		como26.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Mxjug8PNZJG2"));
				startActivity(j);
			}
		});
		como26.setOnTouchListener(new PersonalTouch());
		
		como28.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/sPMpN4YKRiz"));
				startActivity(j);
			}
		});
		como28.setOnTouchListener(new PersonalTouch());
		
		como30.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Lz4c5f3Xf872"));
				startActivity(j);
			}
		});
		como30.setOnTouchListener(new PersonalTouch());
		
		como32.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/t73NY7kds4T2"));
				startActivity(j);
			}
		});
		como32.setOnTouchListener(new PersonalTouch());
		
		como34.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/NaSt2RoKyjp"));
				startActivity(j);
			}
		});
		como34.setOnTouchListener(new PersonalTouch());
		
		como36.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/ukACZjxQcy42"));
				startActivity(j);
			}
		});
		como36.setOnTouchListener(new PersonalTouch());
		
		como38.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/BaKdVFAQZGt"));
				startActivity(j);
			}
		});
		como38.setOnTouchListener(new PersonalTouch());
		
		
		como42.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/cx4K7HJ9qPx"));
				startActivity(j);
			}
		});
		como42.setOnTouchListener(new PersonalTouch());


		como51.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/aPw4z4811jH2"));
				startActivity(j);
			}
		});
		como51.setOnTouchListener(new PersonalTouch());

		como53.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/ds2tFTQp4hQ2"));
				startActivity(j);
			}
		});
		como53.setOnTouchListener(new PersonalTouch());

		como55.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/gF5VCgaWZ3o"));
				startActivity(j);
			}
		});
		como55.setOnTouchListener(new PersonalTouch());

		como57.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/kxM8pxxfusM2"));
				startActivity(j);
			}
		});
		como57.setOnTouchListener(new PersonalTouch());
		
	}
}
