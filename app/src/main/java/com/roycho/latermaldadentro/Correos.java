package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Correos extends Activity {
	
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
		setContentView(R.layout.correo);
		
		TextView como2 = (TextView) findViewById(R.id.como2);
		TextView como4 = (TextView) findViewById(R.id.como4);
		TextView como6 = (TextView) findViewById(R.id.como6);

		como2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Rxy9awukCP22"));
				startActivity(j);
			}
		});
		como2.setOnTouchListener(new PersonalTouch());
		
		como4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/FkefVqvZvA32"));
				startActivity(j);
			}
		});
		como4.setOnTouchListener(new PersonalTouch());

		como6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/rooaecfx64v"));
				startActivity(j);
			}
		});
		como6.setOnTouchListener(new PersonalTouch());
		
		
	}
}