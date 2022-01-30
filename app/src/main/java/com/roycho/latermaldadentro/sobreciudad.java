package com.roycho.latermaldadentro;


import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class sobreciudad extends Activity {

	private AdView mAdView3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sobre);

		MobileAds.initialize(this, new OnInitializationCompleteListener() {
			@Override
			public void onInitializationComplete(InitializationStatus initializationStatus) {
			}
		});
		mAdView3 = findViewById(R.id.adView3);
		AdRequest adRequest = new AdRequest.Builder().build();
		mAdView3.loadAd(adRequest);
	}
		
		public void lanzar (View view){
			
			AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
	    	
	    	builder.setMessage(R.string.descripcionsobreciu1)
	    	        .setTitle(R.string.des1)
	    	        .setCancelable(false)
	    	        .setNegativeButton(R.string.botondialogo,new DialogInterface.OnClickListener() {
	    	                    public void onClick(DialogInterface dialog, int id) {
	    	                    	dialog.cancel();
	    
	    	                        
	    	                    }
	    	                });
	    	builder.setIcon(R.drawable.icono1);
	    	AlertDialog alert = builder.create();
	    	alert.show();
			
		}
		
		public void lanzar1 (View view){
			AlertDialog.Builder builder = new AlertDialog.Builder(this, AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			
			builder.setMessage(R.string.descripcionsobreciu2)
				.setTitle(R.string.como)
				.setCancelable(false)
				.setNegativeButton(R.string.botondialogo, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						dialog.cancel();
						
					}
				});
			builder.setIcon(R.drawable.icono1);
			AlertDialog alert = builder.create();
			alert.show();
		}
		
		public void lanzar2(View view){
		
			Intent j = new Intent(this,Infoutil.class);
			startActivity(j);
			Toast.makeText(getApplicationContext(), R.string.des3, Toast.LENGTH_LONG).show();
	}
		
		public void lanzar3 (View view){
			AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			
			builder.setMessage(R.string.descrip3)
				.setIcon(R.drawable.icono1)
				.setTitle(R.string.des5)
				.setCancelable(true)
				.setNegativeButton(R.string.botondialogo, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						dialog.dismiss();
						
					}
				});
			
			 AlertDialog alerta = builder.create();
		     alerta.show();
		     ((TextView)alerta.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
		    	
		    	
		}
		
		public void lanzar4 (View view){
			AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			
			builder.setMessage(R.string.descrip4)
				.setIcon(R.drawable.icono1)
				.setTitle(R.string.des6)
				.setCancelable(true)
				.setNegativeButton(R.string.botondialogo, new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int id) {
						dialog.dismiss();
						
					}
				});
			
			 AlertDialog alerta = builder.create();
		     alerta.show();
		     ((TextView)alerta.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());
		
		}
}