package com.roycho.latermaldadentro;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.LinkedList;



public class PruebaNoticias extends Activity {
	
	
	private boolean checkConnectivity()
    {
        boolean enabled = true;
 
        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = connectivityManager.getActiveNetworkInfo();
         
        if ((info == null || !info.isConnected() || !info.isAvailable()))
        {
            enabled = false;
        }
        return enabled;         
    }
	

	static final String DATA_TITLE = "T";
	static final String DATA_LINK  = "L";
	
	
	static LinkedList<HashMap<String, String>> data;


	static String feedUrl = "https://www.datachaco.com/rss/sociedad.xml";
	
	
	private ProgressDialog progressDialog;


	private final Handler progressHandler = new Handler() {
		@SuppressWarnings("unchecked")
		public void handleMessage(Message msg) {
			if (msg.obj != null) {
				data = (LinkedList<HashMap<String, String>>)msg.obj;
				setData(data);
			}
			progressDialog.dismiss();
		}
	};


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pruebanoticias);
        
     if (checkConnectivity())
      {
        	  	
        setTitle("Data Chaco");
       
        Button btn = (Button) findViewById(R.id.btnLoad);
        
        
        btn.setOnClickListener(new OnClickListener() {
        	
        	
    		@Override
    		public void onClick(View v) {
    			ListView lv = (ListView) findViewById(R.id.lstData);
    		
    			
    			
    			if (lv.getAdapter() != null) {
    				AlertDialog.Builder builder = new AlertDialog.Builder(PruebaNoticias.this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
    				builder.setMessage("Ya ha cargado noticias, desea hacerlo de nuevo?")
    				       .setCancelable(false)
    				       .setPositiveButton("Si", new DialogInterface.OnClickListener() {
    				           public void onClick(DialogInterface dialog, int id) {
    				        	   loadData();
    				           }
    				       })
    				       .setNegativeButton("No", new DialogInterface.OnClickListener() {
    				           public void onClick(DialogInterface dialog, int id) {
    				                dialog.cancel();					            
    				           }
    				       })
    				       .create()
    				       .show();
    				  				
    			} else {
    				loadData();
    			}
    		}
    	});
        
        }
        
        else
        {
        	 AlertDialog.Builder builder = new AlertDialog.Builder(this,AlertDialog.THEME_DEVICE_DEFAULT_LIGHT);
 	        builder.setTitle(R.string.titulo1)
 	                .setIcon(R.drawable.icono1)
 	               .setMessage(R.string.descrip11)
 	               .setCancelable(true)
 	               .setNegativeButton(R.string.botondialogo1, new DialogInterface.OnClickListener() {
 	                   public void onClick(DialogInterface dialog, int id) {
 	                        dialog.dismiss();
 	                        finish();
 	                   }
 	               });

 	        AlertDialog alerta = builder.create();
 	        alerta.show();
 	        ((TextView)alerta.findViewById(android.R.id.message)).setMovementMethod(LinkMovementMethod.getInstance());    

        }
        ListView lv = (ListView) findViewById(R.id.lstData);
    
        lv.setOnItemClickListener(new OnItemClickListener() {

    		@Override
    		public void onItemClick(AdapterView<?> av, View v, int position,
    				long id) {
		   
    			HashMap<String, String> entry = data.get(position);

		      
    			Intent browserAction = new Intent(Intent.ACTION_VIEW, 
    					Uri.parse(entry.get(DATA_LINK)));
    			startActivity(browserAction);				
    		}
    	});        
    }
    

    private void setData(LinkedList<HashMap<String, String>> data){
    	SimpleAdapter sAdapter = new SimpleAdapter(getApplicationContext(), data, 
    			android.R.layout.two_line_list_item, 
    			new String[] { DATA_TITLE, DATA_LINK }, 
    			new int[] { android.R.id.text1, android.R.id.text2 });
    	ListView lv = (ListView) findViewById(R.id.lstData);
    	lv.setAdapter(sAdapter);
    }   
    
 
    private void loadData() {
    	progressDialog = ProgressDialog.show(
    			PruebaNoticias.this,
    			"", 
    			"Por favor espere mientras se cargan las noticias...", 
    			true);
    	
    	new Thread(new Runnable(){
    		@Override
    		public void run() {
    			XMLParser parser = new XMLParser(feedUrl); 
                Message msg = progressHandler.obtainMessage();
                msg.obj = parser.parse();
    			progressHandler.sendMessage(msg);
    		}}).start();
    }
   
}

