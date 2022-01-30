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

import java.util.ArrayList;

public class Noticias extends ListActivity {
    
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
        
        setData();
        
        mAdapter = new MyAdapter (this);
        setListAdapter (mAdapter);
    }
	
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		Toast.makeText(this, mArray.get(position).mTitle, Toast.LENGTH_LONG).show();
		if (position == 0){
			Intent j = new Intent(this,PruebaNoticias.class);
			startActivity(j);
		}
		if (position == 1){
			Intent j = new Intent(this,Spnoti.class);
			startActivity(j);
		}
		if (position == 2){
			Intent j = new Intent(this,PrimeraLinea.class);
			startActivity(j);
		}
		if (position == 3){
			Intent j = new Intent(this,DiariolaRegion.class);
			startActivity(j);
		}
	}
	
	private void setData() 
	{
		mArray.clear();
		
		Node mynode1 = new Node();
				
		mynode1.mTitle = this.getResources().getString(R.string.norte);
		//mynode1.mDescription = this.getResources().getString(R.string.Descripcion7);
		mynode1.mImageResource = R.drawable.norte;
		
		mArray.add(mynode1);
		
		Node mynode2 = new Node();
						
		mynode2.mTitle = this.getResources().getString(R.string.spnoti);
		//mynode2.mDescription = this.getResources().getString(R.string.Descripcion8);
		mynode2.mImageResource = R.drawable.spnoticias;
				
		mArray.add(mynode2);

		Node mynode3 = new Node();

		mynode3.mTitle = this.getResources().getString(R.string.primeralinea);
		//mynode2.mDescription = this.getResources().getString(R.string.Descripcion8);
		mynode3.mImageResource = R.drawable.primeralinea;

		mArray.add(mynode3);

		Node mynode4 = new Node();

		mynode4.mTitle = this.getResources().getString(R.string.diariolaregionn);
		//mynode2.mDescription = this.getResources().getString(R.string.Descripcion8);
		mynode4.mImageResource = R.drawable.laregion;

		mArray.add(mynode4);
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
				
				view = inflater.inflate(R.layout.noticias, null);
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
}


