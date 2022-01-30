package com.roycho.latermaldadentro;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class Sobreapp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sobreapp);
		ImageView fotoface = (ImageView) findViewById(R.id.fotoface);
		TextView web = (TextView) findViewById(R.id.textView1);
		TextView web1 = (TextView) findViewById(R.id.textView2);
		
		fotoface.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/latermaldaapp"));
				startActivity(j);
		    }
		});
		
		/*web.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse(""));
				startActivity(j);
		    }
		});
		
		web1.setOnClickListener(new OnClickListener() {
		    public void onClick(View v) {
		    	Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("http://mapicons.nicolasmollet.com/"));
				startActivity(j);
		    }
		});*/
		
		
		
	}
}
