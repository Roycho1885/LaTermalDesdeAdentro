package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Infoutil extends Activity {
	
	public class PersonalTouch implements View.OnTouchListener {

		@Override
		public boolean onTouch(View v, MotionEvent event) {
			switch(event.getAction()){
			case MotionEvent.ACTION_DOWN:
				((TextView)v).setTextColor(0xFFFF0000);
				break;
			case MotionEvent.ACTION_CANCEL:
			case MotionEvent.ACTION_UP:
				((TextView)v).setTextColor(0xFFFFFFFF);
				break;
			}
			return false;
		}	
	}

	
	public void llamar(String tel){
		   try{
		      startActivity(new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+tel)));
		   }catch(Exception e){
		      e.printStackTrace();
		   }
		}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.informacion);
		
				
		
		
		TextView tele2 = (TextView) findViewById(R.id.tele2);
		TextView tele4 = (TextView) findViewById(R.id.tele4);
		TextView tele6 = (TextView) findViewById(R.id.tele6);
		TextView tele8 = (TextView) findViewById(R.id.tele8);
		TextView tele10 = (TextView) findViewById(R.id.tele10);
		
		tele2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				llamar("911");
			}
		});
		tele2.setOnTouchListener(new PersonalTouch());
		
		tele4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				llamar("100");
			}
		});
		tele4.setOnTouchListener(new PersonalTouch());
		
		tele6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				llamar("103");
			}
		});
		tele6.setOnTouchListener(new PersonalTouch());
		
		tele8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				llamar("107");
			}
		});
		tele8.setOnTouchListener(new PersonalTouch());
		
		tele10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				llamar("105");
			}
		});
		tele10.setOnTouchListener(new PersonalTouch());
	}
	
}
