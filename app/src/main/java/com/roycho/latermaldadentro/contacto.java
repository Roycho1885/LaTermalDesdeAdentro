package com.roycho.latermaldadentro;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class contacto extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contactos);
		
		Button btnSend = (Button) findViewById(R.id.btnSend);
		btnSend.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
			
				EditText etEmail = (EditText) findViewById(R.id.etEmail);
		        EditText etSubject = (EditText) findViewById(R.id.etSubject);
		        EditText etBody = (EditText) findViewById(R.id.etBody);
		        
		        Intent itSend = new Intent(android.content.Intent.ACTION_SEND);
		        
		        itSend.setType("text/plain");
		        
		        itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"latermaldaapp@gmail.com"});                            
                itSend.putExtra(android.content.Intent.EXTRA_SUBJECT, etSubject.getText().toString());
                itSend.putExtra(android.content.Intent.EXTRA_TEXT, etBody.getText());
                
                startActivity(itSend);
                Toast.makeText(getApplicationContext(), "Enviar", Toast.LENGTH_SHORT).show();
			}
			
		});
		
	}
}