package com.roycho.latermaldadentro;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;

public class menu extends ListActivity  {


	private InterstitialAd anuncio;
	private MyAdapter mAdapter = null;


	public class Node
	{
		public String mTitle;
		public String mDescription;
		public Integer mImageResource;
		
	}
	
	private static ArrayList<Node> mArray = new ArrayList<Node>();
	
	
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		anuncio = new InterstitialAd(this);
		anuncio.setAdUnitId("ca-app-pub-8540442919500654/1427006127");
		anuncio.loadAd(new AdRequest.Builder().build());
        setData();
        mAdapter = new MyAdapter (this);
        setListAdapter (mAdapter);
    }

	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		Toast.makeText(this, mArray.get(position).mTitle, Toast.LENGTH_LONG).show();
		if (position == 0){
			Intent j = new Intent(this,Hoteles.class);
			startActivity(j);
		}
		if (position == 1){
			Intent j = new Intent(this,Casinos.class);
			startActivity(j);
		}
		if (position == 2){
			Intent j = new Intent(this,Boliches.class);
			startActivity(j);
		}
		if (position == 3){
			Intent j = new Intent(this,Comida.class);
			startActivity(j);
		}
		if (position == 4){
			Intent j = new Intent(this,Hospitales.class);
			startActivity(j);
		}
		if (position == 5){
			Intent j = new Intent(this,VisitarLugares.class);
			startActivity(j);
		}
		if (position == 6){
			Intent j = new Intent(this,AlquilerAuto.class);
			startActivity(j);
		}
		if (position == 7){
			Intent j = new Intent(this,Remises.class);
			startActivity(j);
		}
		if (position == 8){
			Intent j = new Intent(this,Correos.class);
			startActivity(j);
		}
		if (position == 9){
			Intent j = new Intent(this,Farmacias.class);
			startActivity(j);
		}
		if (position == 10){
			Intent j = new Intent(this,Cajeros.class);
			startActivity(j);
		}
		if (position == 11){
			Intent j = new Intent(this,Agencias.class);
			startActivity(j);
		}
		if (position == 12){
			Intent j = new Intent(this,Estacionservicio.class);
			startActivity(j);
		}
		if (position == 13){
			Intent j = new Intent(this,Colectivos.class);
			startActivity(j);
		}
	}
	
	private void setData() 
	{
		mArray.clear();
		
		Node mynode1 = new Node();
				
		mynode1.mTitle = this.getResources().getString(R.string.Titulo7);
		mynode1.mDescription = this.getResources().getString(R.string.Descripcion7);
		mynode1.mImageResource = R.drawable.hotelvector;
		
		mArray.add(mynode1);
		
		Node mynode2 = new Node();
						
		mynode2.mTitle = this.getResources().getString(R.string.Titulo8);
		mynode2.mDescription = this.getResources().getString(R.string.Descripcion8);
		mynode2.mImageResource = R.drawable.casinovector;
				
		mArray.add(mynode2);
		
		Node mynode3 = new Node();
		
		mynode3.mTitle = this.getResources().getString(R.string.tituloboliches);
		mynode3.mDescription = this.getResources().getString(R.string.subtituboliches);
		mynode3.mImageResource = R.drawable.bailablevector;
				
		mArray.add(mynode3);
		
		Node mynode4 = new Node();
		
		mynode4.mTitle = this.getResources().getString(R.string.Titulo9);
		mynode4.mDescription = this.getResources().getString(R.string.Descripcion9);
		mynode4.mImageResource = R.drawable.comidavector;
				
		mArray.add(mynode4);
		
		Node mynode5 = new Node();
		
		mynode5.mTitle = this.getResources().getString(R.string.Titulo17);
		mynode5.mDescription = this.getResources().getString(R.string.Descripcion17);
		mynode5.mImageResource = R.drawable.hospitalvector;
		
		mArray.add(mynode5);
		
		Node mynode6 = new Node();
		
		mynode6.mTitle = this.getResources().getString(R.string.Titulo12);
		mynode6.mDescription = this.getResources().getString(R.string.Descripcion12);
		mynode6.mImageResource = R.drawable.lugaresvector;
				
		mArray.add(mynode6);
		
		Node mynode7 = new Node();
		
		mynode7.mTitle = this.getResources().getString(R.string.Titulo13);
		mynode7.mDescription = this.getResources().getString(R.string.Descripcion13);
		mynode7.mImageResource = R.drawable.alquilervector;
				
		mArray.add(mynode7);
		
		Node mynode8 = new Node();
		
		mynode8.mTitle = this.getResources().getString(R.string.Titulo14);
		mynode8.mDescription = this.getResources().getString(R.string.Descripcion14);
		mynode8.mImageResource = R.drawable.remissesvector;
				
		mArray.add(mynode8);
		
		
		Node mynode9 = new Node();
		
		mynode9.mTitle = this.getResources().getString(R.string.Titulo16);
		mynode9.mDescription = this.getResources().getString(R.string.Descripcion16);
		mynode9.mImageResource = R.drawable.correovector;
				
		mArray.add(mynode9);
		
		Node mynode10 = new Node();
		
		mynode10.mTitle = this.getResources().getString(R.string.Titulo19);
		mynode10.mDescription = this.getResources().getString(R.string.Descripcion19);
		mynode10.mImageResource = R.drawable.farmaciavector;
				
		mArray.add(mynode10);
		
		Node mynode11 = new Node();
		
		mynode11.mTitle = this.getResources().getString(R.string.Titulo20);
		mynode11.mDescription = this.getResources().getString(R.string.Descripcion20);
		mynode11.mImageResource = R.drawable.cajerovector;
				
		mArray.add(mynode11);
		
		Node mynode12 = new Node();
		
		mynode12.mTitle = this.getResources().getString(R.string.Titulo21);
		mynode12.mDescription = this.getResources().getString(R.string.Descripcion21);
		mynode12.mImageResource = R.drawable.icoturivector;
				
		mArray.add(mynode12);
		
		Node mynode13 = new Node();
		
		mynode13.mTitle = this.getResources().getString(R.string.estacion);
		mynode13.mDescription = this.getResources().getString(R.string.desestacion);
		mynode13.mImageResource = R.drawable.estacion1vector;
				
		mArray.add(mynode13);
		
		Node mynode14 = new Node();
		
		mynode14.mTitle = this.getResources().getString(R.string.titubus);
		mynode14.mDescription = this.getResources().getString(R.string.subtitubus);
		mynode14.mImageResource = R.drawable.iconbusvector;
				
		mArray.add(mynode14);

				
	}
	
	public static class MyAdapter extends BaseAdapter
	{

		private Context mContext;
		
		public MyAdapter(Context c)
		{
			mContext = c;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return mArray.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return mArray.get(position);
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			
			View view = null;
			
			if (convertView == null){
				
				LayoutInflater inflater = (LayoutInflater) mContext
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
				
				view = inflater.inflate(R.layout.menu, null);
			}
			else{
				
				view = convertView;
			}
			
			ImageView img = (ImageView) view.findViewById(R.id.image);
			img.setImageDrawable(mContext.getResources().getDrawable(mArray.get(position).mImageResource));
			
			TextView tTitle = (TextView) view.findViewById(R.id.title);
			tTitle.setText(mArray.get(position).mTitle);
			
			TextView tDescription = (TextView) view.findViewById(R.id.description);
			tDescription.setText(mArray.get(position).mDescription);
			
			return view;	
		}
	}

	@Override
	public void onBackPressed() {
		if (anuncio.isLoaded()) {
			anuncio.show();
		}
		super.onBackPressed();
	}

}

