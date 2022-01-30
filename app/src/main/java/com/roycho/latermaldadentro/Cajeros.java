package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Cajeros extends Activity {
	
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
		setContentView(R.layout.cajeros);
		
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
        TextView como24 = (TextView) findViewById(R.id.como24);
		TextView como26 = (TextView) findViewById(R.id.como26);
		
		como2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/DqQhVjxaA7y"));
				startActivity(j);
			}
		});
		como2.setOnTouchListener(new PersonalTouch());
		
		como4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/TRSmsY6Lh5J2"));
				startActivity(j);
			}
		});
		como4.setOnTouchListener(new PersonalTouch());
		
		como6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/GwaRBvFY7HS2"));
				startActivity(j);
			}
		});
		como6.setOnTouchListener(new PersonalTouch());
		
		como8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/dx6TwUPQjW52"));
				startActivity(j);
			}
		});
		como8.setOnTouchListener(new PersonalTouch());
		
		como10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/hYbEV6k2SN22"));
				startActivity(j);
			}
		});
		como10.setOnTouchListener(new PersonalTouch());
		
		como12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/msziKZxcM1K2"));
				startActivity(j);
			}
		});
		como12.setOnTouchListener(new PersonalTouch());
		
		como14.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/6abdW4rQmXQ2"));
				startActivity(j);
			}
		});
		como14.setOnTouchListener(new PersonalTouch());
		
		como16.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/YsrErVCZ7dB2"));
				startActivity(j);
			}
		});
		como16.setOnTouchListener(new PersonalTouch());
		
		como18.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/QvhWYcnWGTy"));
				startActivity(j);
			}
		});
		como18.setOnTouchListener(new PersonalTouch());
		
		como20.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/CSfKak6LHNG2"));
				startActivity(j);
			}
		});
		como20.setOnTouchListener(new PersonalTouch());

		como22.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/twXzzsCR9hM2"));
				startActivity(j);
			}
		});
		como22.setOnTouchListener(new PersonalTouch());

        como24.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/vBJLCxcSmrC2"));
                startActivity(j);
            }
        });
        como24.setOnTouchListener(new PersonalTouch());

		como26.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/4HkB1LKN91m"));
				startActivity(j);
			}
		});
		como26.setOnTouchListener(new PersonalTouch());
	}

}
