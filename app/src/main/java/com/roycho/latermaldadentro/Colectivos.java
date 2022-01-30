package com.roycho.latermaldadentro;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Colectivos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.colectivos);
		}
	
	public void lanzar (View view){
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
		
		builder.setMessage(R.string.descripcolelatermal)
			.setIcon(R.drawable.icono1)
			.setTitle("Empresa La Termal")
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
	
	public void lanzar1 (View view){
		
AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
		
		builder.setMessage(R.string.descripcolelaestrella)
			.setIcon(R.drawable.icono1)
			.setTitle("Empresa La Estrella")
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
	
	public void lanzar2 (View view){
		
	AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
		builder.setMessage(R.string.descripcoleexpresoplata)
		.setIcon(R.drawable.icono1)
		.setTitle("Empresa Expreso del Plata")
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
	
	public void lanzar3 (View view){
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			builder.setMessage(R.string.descripcoleandesmar)
			.setIcon(R.drawable.icono1)
			.setTitle("Empresa Andesmar")
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
			builder.setMessage(R.string.descripcolerapidotata)
			.setIcon(R.drawable.icono1)
			.setTitle("Empresa Rápido Tata")
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

	public void lanzar5 (View view){
	
	AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
		builder.setMessage(R.string.descripcoleelpulqui)
		.setIcon(R.drawable.icono1)
		.setTitle("Empresa El Pulqui")
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
	
	public void lanzar6 (View view){
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			builder.setMessage(R.string.descripcoleaguila)
			.setIcon(R.drawable.icono1)
			.setTitle("Empresa Aguila Dorada Bis")
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
	
	public void lanzar7 (View view){
		
		AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
			builder.setMessage(R.string.descripcoleflechabus)
			.setIcon(R.drawable.icono1)
			.setTitle("Empresa Flecha Bus")
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
