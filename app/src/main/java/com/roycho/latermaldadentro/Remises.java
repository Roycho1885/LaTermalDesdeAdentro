package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Remises extends Activity {
	
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
		setContentView(R.layout.remises);
		
		TextView como2 = (TextView) findViewById(R.id.como2);
		TextView como4 = (TextView) findViewById(R.id.como4);
		TextView como6 = (TextView) findViewById(R.id.como6);
		TextView como8 = (TextView) findViewById(R.id.como8);
		TextView como10 = (TextView) findViewById(R.id.como10);
		TextView como12 = (TextView) findViewById(R.id.como12);
		
		como2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/qxS7gmJC2o62"));
				startActivity(j);
			}
		});
		como2.setOnTouchListener(new PersonalTouch());
		
		como4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/4k5NxdmH5V52"));
				startActivity(j);
			}
		});
		como4.setOnTouchListener(new PersonalTouch());
		
		como6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/h7RU57NfEkL2"));
				startActivity(j);
			}
		});
		como6.setOnTouchListener(new PersonalTouch());
		
		como8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/r8fvqHMFxAL2"));
				startActivity(j);
			}
		});
		como8.setOnTouchListener(new PersonalTouch());
		
		como10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/6Sh1SwNHz2u"));
				startActivity(j);
			}
		});
		como10.setOnTouchListener(new PersonalTouch());
		
		como12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/cqAyZyVqAZm"));
				startActivity(j);
			}
		});
		como12.setOnTouchListener(new PersonalTouch());
	}
	

}
