package com.roycho.latermaldadentro;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Boliches extends Activity {
	
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
		setContentView(R.layout.boliches);
		
		TextView como2 = (TextView) findViewById(R.id.como2);
		TextView como4 = (TextView) findViewById(R.id.como4);
		TextView como8 = (TextView) findViewById(R.id.como8);
		TextView como10 = (TextView) findViewById(R.id.como10);
		TextView como16 = (TextView) findViewById(R.id.como16);
		TextView como20 = (TextView) findViewById(R.id.como20);
		TextView como24 = (TextView) findViewById(R.id.como24);
		TextView como28 = (TextView) findViewById(R.id.como28);
		TextView como30 = (TextView) findViewById(R.id.como30);
		
		TextView face3 = (TextView) findViewById(R.id.face3);
		TextView face5 = (TextView) findViewById(R.id.face5);
		TextView face13 = (TextView) findViewById(R.id.face13);
		
		como2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/syySen25CSx"));
				startActivity(j);
			}
		});
		como2.setOnTouchListener(new PersonalTouch());
		
		como4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/vmgNVRhzPsK2"));
				startActivity(j);
			}
		});
		como4.setOnTouchListener(new PersonalTouch());
		
		
		como8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/ZbQq4jy3Sd62"));
				startActivity(j);
			}
		});
		como8.setOnTouchListener(new PersonalTouch());
		
		face3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/zohanightlife"));
				startActivity(j);
			}
		});
		face3.setOnTouchListener(new PersonalTouch());
		
		como10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/YuwDYxYYPJH2"));
				startActivity(j);
			}
		});
		como10.setOnTouchListener(new PersonalTouch());
		
		face5.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/pages/X-Treme-Disco/143632872353001"));
				startActivity(j);
			}
		});
		face5.setOnTouchListener(new PersonalTouch());

		
		como16.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/syySen25CSx"));
				startActivity(j);
			}
		});
		como16.setOnTouchListener(new PersonalTouch());

		
		como20.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/EpH3YUgKSf12"));
				startActivity(j);
			}
		});
		como20.setOnTouchListener(new PersonalTouch());

		
		como24.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/1m5m4s7M6vm"));
				startActivity(j);
			}
		});
		como24.setOnTouchListener(new PersonalTouch());
		
		face13.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/pages/ManoSantaBar/141786756798"));
				startActivity(j);
			}
		});
		face13.setOnTouchListener(new PersonalTouch());
		
		
		como28.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/bdsLidwXYc32"));
				startActivity(j);
			}
		});
		como28.setOnTouchListener(new PersonalTouch());

		como30.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/rLNzG9ieBK62"));
				startActivity(j);
			}
		});
		como30.setOnTouchListener(new PersonalTouch());
	}

}
