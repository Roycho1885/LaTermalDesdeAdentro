package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Farmacias extends Activity {
	
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
		super.onCreate(savedInstanceState);
		setContentView(R.layout.farmacia);
		
		TextView como2 = (TextView) findViewById(R.id.como2);
		TextView como4 = (TextView) findViewById(R.id.como4);
		TextView como6 = (TextView) findViewById(R.id.como6);
		TextView como8 = (TextView) findViewById(R.id.como8);
		TextView como10 = (TextView) findViewById(R.id.como10);
		TextView como12 = (TextView) findViewById(R.id.como12);
		TextView como14 = (TextView) findViewById(R.id.como14);
		TextView como16 = (TextView) findViewById(R.id.como16);
		TextView como18 = (TextView) findViewById(R.id.como18);
		TextView como20 = (TextView) findViewById(R.id.como20);
		TextView como22 = (TextView) findViewById(R.id.como22);
		
		como2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/fWgHu7Gk2z32"));
				startActivity(j);
			}
		});
		como2.setOnTouchListener(new PersonalTouch());
		
		como4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/MwEjdin7Jw12"));
				startActivity(j);
			}
		});
		como4.setOnTouchListener(new PersonalTouch());
		
		como6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/aYbShhLDeTu"));
				startActivity(j);
			}
		});
		como6.setOnTouchListener(new PersonalTouch());
		
		como8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/j8VuyfcXSZB2"));
				startActivity(j);
			}
		});
		como8.setOnTouchListener(new PersonalTouch());
		
		como10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/SEn2y8CqXHP2"));
				startActivity(j);
			}
		});
		como10.setOnTouchListener(new PersonalTouch());
		
		como12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/CqVSaRyCiEM2"));
				startActivity(j);
			}
		});
		como12.setOnTouchListener(new PersonalTouch());
		
		como14.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/2LcZD9BdtFm"));
				startActivity(j);
			}
		});
		como14.setOnTouchListener(new PersonalTouch());
		
		como16.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/PsfWAWQLqD42"));
				startActivity(j);
			}
		});
		como16.setOnTouchListener(new PersonalTouch());
		
		como18.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/uiS7b7UcrhQ2"));
				startActivity(j);
			}
		});
		como18.setOnTouchListener(new PersonalTouch());
		
		como20.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/d4qcW1xnqaS2"));
				startActivity(j);
			}
		});
		como20.setOnTouchListener(new PersonalTouch());
		
		como22.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/f5E9L78xS6F2"));
				startActivity(j);
			}
		});
		como22.setOnTouchListener(new PersonalTouch());
	}
}
