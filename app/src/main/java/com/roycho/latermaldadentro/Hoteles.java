package com.roycho.latermaldadentro;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Hoteles extends AppCompatActivity {


	public class PersonalTouch implements View.OnTouchListener {



		@Override
		public boolean onTouch(View v, MotionEvent event) {
			switch(event.getAction()){
			case MotionEvent.ACTION_DOWN:
				((TextView)v).setTextColor(0xFFFF0000);
				break;
			case MotionEvent.ACTION_CANCEL:
			case MotionEvent.ACTION_UP:
				((TextView)v).setTextColor(0xFF00CCCC);
				break;
			}
			return false;
		}

	}

	
	private TextView nombre;
	private TextView direccion2;
	private TextView telefono2;
	private TextView contacto1;
	private TextView contacto2;
	private TextView como2;
	private TextView caracteristicas2;
	private ImageView imagen1;
	private ImageView imagen2;
	private ImageView imagen3;
	private ImageView imagen4;
	private ImageView imagen5;
	private TextView caracteristicas4;
	private TextView caracteristicas3;
	private TextView reservas;
	private TextView reservas1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hoteless);


		
		nombre = (TextView) findViewById(R.id.nombre);
		direccion2 = (TextView) findViewById(R.id.direccion2);
		telefono2 = (TextView) findViewById(R.id.telefono2);
		contacto1 = (TextView) findViewById(R.id.contacto1);
		contacto2 = (TextView) findViewById(R.id.contacto2);
		como2 = (TextView) findViewById(R.id.como2);
		caracteristicas2 = (TextView) findViewById(R.id.caracteristicas2);
		imagen1 = (ImageView) findViewById(R.id.imageView1);
		imagen2 = (ImageView) findViewById(R.id.imageView2);
		imagen3 = (ImageView) findViewById(R.id.imageView3);
		imagen4 = (ImageView) findViewById(R.id.imageView4);
		imagen5 = (ImageView) findViewById(R.id.imageView5);
		caracteristicas4 = (TextView) findViewById(R.id.caracteristicas4);
		caracteristicas3 = (TextView) findViewById(R.id.caracteristicas3);
		reservas = (TextView) findViewById(R.id.reservas);
		reservas1 = (TextView) findViewById(R.id.reservas1);
		
		String[] datos2 =
				new String[]{"Habitaci??n Matrimonial","Habitaci??n Doble Est??ndar Twin","Habitaci??n Doble Discapacitados","Habitaci??n Triple","Habitaci??n Cu??druple","Habitaci??n Suite Deluxe"," Habitaci??n Suite Presidencial"};
				final ArrayAdapter<String> adaptador1 =
				new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos2);
				
		String[] datos3 =
				new String[]{"Habitaciones Nupciales","Habitaciones Singles", "Habitaciones Dobles","Habitaciones Triples","Habitaciones Cu??druples","Habitaciones Qu??ntuples","Habitaciones S??xtuples"};
				final ArrayAdapter<String> adaptador2 =
				new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos3);
				
		String[] datos4 =
				new String[]{"Habitaciones Singles", "Habitaciones Dobles","Habitaciones Triples","Habitaciones Cu??druples"};
				final ArrayAdapter<String> adaptador3 =
				new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos4);
				
		String[] datos5 =
				new String[]{"Habitaciones Singles", "Habitaciones Dobles","Habitaciones Triples","Habitaciones Cu??druples"};
				final ArrayAdapter<String> adaptador4 =
				new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos5);
				
		String[] datos6 =
				new String[]{"Habitaciones Singles", "Habitaciones Dobles","Habitaciones Triples"};
				final ArrayAdapter<String> adaptador5 =
				new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos6);

				
		
		final Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
		
	
		String[] datos =
			new String[]{"Atrium Gualok","Hotel Aconc??gua","Hotel Presidente","Hotel Orel","Hotel Internacional","Hotel Avenida","Hotel Riposo","Hotel Martykan","Hospedaje El Colono","Hotel Mura","Hotel Apart"};
			final ArrayAdapter<String> adaptador =
			new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, datos);
			
	final Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
	adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinner1.setAdapter(adaptador);
	
	
	spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
			
			switch (position){
			
			case 0:
				spinner2.setVisibility(View.VISIBLE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				nombre.setText(R.string.HotelGualok);
				direccion2.setText("San Martin 1198");
				telefono2.setText("+549-(364)-4421514");
				contacto2.setText("https://www.hotelgualok.com.ar/");
				caracteristicas2.setText("Se encuentra en la zona de Presidencia Roque S??enz Pe??a. Ofrecemos habitaciones con aire acondicionado, ba??o privado y conexi??n de wifi gratis. El alojamiento dispone de spa, ba??era de hidromasaje y pileta al aire libre.\n" +
						"\n" + "Todas las habitaciones del hotel est??n equipadas con TV de pantalla plana con canales por cable.");
				imagen1.setImageResource(R.drawable.foto1);
				imagen2.setImageResource(R.drawable.foto2);
				imagen3.setImageResource(R.drawable.foto3);
				imagen4.setImageResource(R.drawable.foto4);
				imagen5.setImageResource(R.drawable.foto5);
				caracteristicas3.setVisibility(View.VISIBLE);
				caracteristicas3.setText("Habitaciones");
				caracteristicas4.setVisibility(View.VISIBLE);
				reservas.setVisibility(View.VISIBLE);
				reservas1.setVisibility(View.VISIBLE);
				reservas1.setText("reservas@hotelgualok.com.ar");
				
				
				adaptador1.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
				spinner2.setAdapter(adaptador1);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						
						switch (position){
						case 0:
							caracteristicas4.setText("Suite de 38 m2 - Sommier King Siize - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory - Amenities\n" +
									"\n");
							break;
						case 1:
							caracteristicas4.setText("Suite de 36 m2 - 2 Sommier 100 x 200 - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory\n" +
									"\n");
							break;
							
						case 2:
							caracteristicas4.setText("Suite de 38 m2 - Sommier King Siize - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory - Amenities");
							break;
							
						case 3:
							caracteristicas4.setText("Suite de 38 m2 - Sommier King Siize - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory - Amenities\n" +
									"\n");
							break;
							
						case 4:
							caracteristicas4.setText("Suite de 38 m2 - Sommier King Siize - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory - Amenities\n" +
									"\n");
							break;
							
						case 5:
							caracteristicas4.setText("Suite de 36 m2 - Sommier - Extra Grande 200 x 200 - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory");
							break;
							
						case 6:
							caracteristicas4.setText("Suite de 36 m2 - Sommier - Extra Grande 200 x 200 - TV 32 - Safe Box - Climatizaci??n individual - Wifi - Cerradura de proximidad - Control de energ??a - Vanitory\n" +
									"\n");
							break;
						}
						
					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/m5bYYL6QTrH2"));
						startActivity(j);
					}
					
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
				
				
			case 1:
				spinner2.setVisibility(View.VISIBLE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				nombre.setText("Hotel Aconc??gua");
				direccion2.setText("Azcu??naga 39");
				telefono2.setText("+549-(364)-4428111");
				contacto2.setText("hotel-aconcagua@hotmail.com");
				imagen1.setImageResource(R.drawable.foto6);
				imagen2.setImageResource(R.drawable.foto7);
				imagen3.setImageResource(R.drawable.foto8);
				imagen4.setImageResource(R.drawable.foto9);
				imagen5.setImageResource(R.drawable.foto10);
				caracteristicas3.setVisibility(View.VISIBLE);
				caracteristicas3.setText("Habitaciones");
				caracteristicas4.setVisibility(View.VISIBLE);
				reservas.setVisibility(View.VISIBLE);
				reservas1.setVisibility(View.VISIBLE);
				reservas1.setText("Podr??n realizarse reservas, siempre con el mayor tiempo de anticipacion.\n"+
						"Realizando dep??sitos anticipadamente se mantienen las tarifas. "+
						"Ofrecemos descuentos importantes a contingentes de jubilados, docentes, intituciones e iglesias.\n\n"+"Por email: "+"hotel-aconcagua@hotmail.com"+"\nTelef??nicamente: "+"+549-(364)-4428111");
						caracteristicas2.setText("Su reciente construcci??n se vi?? favorecida en el estudio e implementaci??n de un moderno dise??o y de prestaciones con ambientes agradables al hu??sped, desde habitaciones c??modas, piscina, cocheras cubiertas y muy seguras para el resguardo de veh??culos."+
						" As??mismo, para el disfrute de un espacio de esparcimiento contamos con una amplia terraza para degustar, con bancos, hamacas y mesas, haciendo mas c??lida y familiar la estad??a del pasajero."+
						" Contamos con conexi??n banda ancha Wi-Fi para la navegaci??n en Internet en todo el per??metro del hotel. Adem??s en el sector de Sala de Star disponemos de computadoras de ??ltima generaci??n, al servicio del pasajero sin costo alguno."+
						" Para un excelente comienzo del d??a, ofrecemos un amplio desayunador al estilo americano, con un servicio de cafeter??a las 24 hs., sin ning??n costo para nuestros hu??spedes.");
				
				adaptador2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador2);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						
						switch (position){
						case 0:
							caracteristicas4.setText("Estas habitaciones cuentan con yacuzzi y frigobar, adem??s cuenta con aire acondicionado, wifi y estan totalmente alfombradas.");
							break;
						case 2:
							caracteristicas4.setText("Estas habitaciones poseen dos camas matrimoniales totalmente alfombrada con aire acondicionado y wifi.");
							break;
							
						case 3:
							caracteristicas4.setText("Estas habitaciones cuentan con una cama matrimonial y una cama cucheta totalmente alfombrada con aire acondicionado y wifi.");
							break;
							
						case 4:
							caracteristicas4.setText("Estas habitaciones cuentan con dos camas matrimoniales y una cama cucheta totalmente alfombrada con aire acondicionado y wifi.");
							break;
							
						case 5:
							caracteristicas4.setText("Estas habitaciones cuentan con una cama matrimonial y dos camas cucheta totalmente alfombrada con aire acondicionado y wifi.");
							break;
							
						case 6:
							caracteristicas4.setText("Estas habitaciones cuentan con dos camas matrimoniales y dos camas cucheta totalmente alfombrada con aire acondicionado y wifi.");
							break;
							
						case 1:
							caracteristicas4.setText("Estas habitaciones poseen una cama matrimonial totalmente alfombrada con aire acondicionado y wifi.");
							break;
						}
						
					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});

				
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/dRUqej71gLF2"));
						startActivity(j);
					}
					
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
			case 2:
				spinner2.setVisibility(View.VISIBLE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				nombre.setText("Hotel Presidente");
				direccion2.setText("San Mart??n 771");
				contacto1.setVisibility(View.INVISIBLE);
				telefono2.setText("+549-(364)-4426180 / +549-(364)-4428533");
				contacto2.setVisibility(View.INVISIBLE);
				imagen1.setImageResource(R.drawable.foto11);
				imagen2.setImageResource(R.drawable.foto12);
				imagen3.setImageResource(R.drawable.foto13);
				imagen4.setImageResource(R.drawable.foto14);
				imagen5.setImageResource(R.drawable.foto15);
				caracteristicas3.setVisibility(View.VISIBLE);
				caracteristicas3.setText("Habitaciones");
				caracteristicas4.setVisibility(View.VISIBLE);
				reservas.setVisibility(View.VISIBLE);
				reservas1.setVisibility(View.VISIBLE);
				reservas1.setText("Las reservas se realizan a los tel??fonos mencionados anteriormente, no se realizan reservas v??a email");
				caracteristicas2.setText("Nuestro hotel se encuentra en una ubicaci??n preferencial ya que est?? rodeado de comedores y confiter??as y a tres cuadras de los ba??os termales con las aguas de propiedades curativas m??s altas del Pa??s."+
						" Est?? ubicado a cuatro cuadras del Casino Gualok y a 5 Km. del Zool??gico, el segundo m??s importante del Pa??s."+" Nuestro servicio es similar al de cuatro estrellas."+"\n"+
						"Brindamos desayuno Americano (jugo de naranjas natural, mermeladas, fiambres, ensaladas de frutas, yogurt, etc.) y servicio de cafeter??a las 24 hs."+
						" Contamos con un quincho especial para fiestas o asados."+" Tenemos una Amplia Cochera Cubierta de muy buen nivel. "+
						"Tenemos energ??a propia y estamos protegidos por un servicio de m??dicos especializados."+
						" Nuestro hotel no cuenta con competencia alguna en la ciudad.");
				
				adaptador3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador3);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						
						switch (position){
						case 0:
							caracteristicas4.setText("Estas habitaciones cuentan con una cama de dos plazas, ba??o privado, frigobar, tel??fono, aire acondicionado y calefacci??n.");
							break;
						case 1:
							caracteristicas4.setText("Estas habitaciones cuentan con una cama de dos plazas, una cama de una plaza, ba??o privado, frigobar, tel??fono, aire acondicionado y calefacci??n.");
							break;
							
						case 2:
							caracteristicas4.setText("Estas habitaciones cuentan con una cama de dos plazas, dos camas de una plaza, ba??o privado, frigobar, tel??fono, aire acondicionado y calefacci??n.");
							break;
							
						case 3:
							caracteristicas4.setText("Estas habitaciones cuentan con una cama de dos plazas, tres camas de una plaza, ba??o privado, frigobar, tel??fono, aire acondicionado y calefacci??n.");
							break;
						}
						
					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Mx2wYo1RRGG2"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
			
			case 3:
				spinner2.setVisibility(View.VISIBLE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				nombre.setText("Hotel Orel");
				direccion2.setText("Saavedra 483");
				telefono2.setText("+549-(364)-4429645 / +549-(364)-4662725");
				contacto2.setText("jfmalina@yahoo.com.ar\n"+"https://www.facebook.com/HotelOrel");
				imagen1.setImageResource(R.drawable.foto16);
				imagen2.setImageResource(R.drawable.foto17);
				imagen3.setImageResource(R.drawable.foto18);
				imagen4.setImageResource(R.drawable.foto19);
				imagen5.setImageResource(R.drawable.foto20);
				caracteristicas3.setVisibility(View.VISIBLE);
				caracteristicas3.setText("Habitaciones");
				caracteristicas4.setVisibility(View.VISIBLE);
				reservas.setVisibility(View.VISIBLE);
				reservas1.setVisibility(View.VISIBLE);
				reservas1.setText("Las reservas se realizan a los tel??fonos mencionados anteriormente");
				caracteristicas2.setText("Hotel Orel, ubicado en el coraz??n de la provincia del Chaco, Ciudad de Presidencia Roque Saenz Pe??a, a 100mts de la plaza principal, atendido por sus due??os. abierto las 24hs los 365 dias del a??o. Nuestros servicios poseen cochera propia, ba??o privado, ambiente climatizado, tv y wifi. Llame y haga su reserva. La Ciudad Termal lo espera!");
				
				adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador4);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						
						switch (position){
						case 0:
							caracteristicas4.setText("Estas habitaciones cuentan con un sommier de dos plazas, ba??o privado, televisor led, tel??fono, aire acondicionado y calefacci??n.");
							break;
						case 1:
							caracteristicas4.setText("Estas habitaciones cuentan con dos sommiers de una plaza, ba??o privado, televisor led, tel??fono, aire acondicionado y calefacci??n.");
							break;
							
						case 2:
							caracteristicas4.setText("Estas habitaciones cuentan con tres sommiers de una plaza, ba??o privado, televisor led, tel??fono, aire acondicionado y calefacci??n.");
							break;
							
						case 3:
							caracteristicas4.setText("Estas habitaciones cuentan con cuatro sommiers de una plaza, ba??o privado, televisor led, tel??fono, aire acondicionado y calefacci??n.");
							break;
						}
						
					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/v1d1Rv3rWU22"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
			case 4:
				spinner2.setVisibility(View.GONE);
				nombre.setText("Hotel Internacional");
				direccion2.setText("Urquiza 289");
				telefono2.setText("+549-(364)-4421140");
				contacto2.setText("borisafanasenko@hotmail.com");
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				imagen1.setImageResource(R.drawable.intfoto4);
				imagen2.setImageResource(R.drawable.intfoto2);
				imagen3.setImageResource(R.drawable.intfoto3);
				imagen4.setImageResource(R.drawable.intfoto1);
				imagen5.setImageResource(R.drawable.intfoto5);
				reservas1.setText("Las reservas se realizan al tel??fono mencionado anteriormente");
				caracteristicas2.setText("Cochera, Sala de Estar, Desayuno, Ba??o Privado, T.V. en Habitaci??n, Wifi, Ambiente Climatizado\n"+"Las reservas se realizan por el tel??fono mencionado anteriormente.");
				caracteristicas3.setVisibility(View.GONE);
				caracteristicas4.setVisibility(View.GONE);
				reservas.setVisibility(View.GONE);
				reservas1.setVisibility(View.GONE);
				
				adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador4);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
					
					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						
						}
						

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/YeKuzYL1GFB2"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
				
			case 5:
				spinner2.setVisibility(View.VISIBLE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				nombre.setText("Hotel Avenida");
				direccion2.setText("Av. Hip??lito Yrigoyen 437");
				telefono2.setText("+549-(364)-4421392");
				contacto2.setText("monicaleonah@gmail.com\n"+"https://www.facebook.com/hotelavenida437");
				imagen1.setImageResource(R.drawable.avefoto1);
				imagen2.setImageResource(R.drawable.avefoto4);
				imagen3.setImageResource(R.drawable.avefoto3);
				imagen4.setImageResource(R.drawable.avefoto2);
				imagen5.setImageResource(R.drawable.avefoto5);
				caracteristicas3.setVisibility(View.VISIBLE);
				caracteristicas3.setText("Habitaciones");
				caracteristicas4.setVisibility(View.VISIBLE);
				reservas.setVisibility(View.VISIBLE);
				reservas1.setVisibility(View.VISIBLE);
				reservas1.setText("Las reservas se realizan al tel??fono mencionado anteriormente");
				caracteristicas2.setText("Habitaciones con ba??o privado, sommiers, placard, desayuno americano, aire acondicionado, ventiladores, cable, agua caliente y fria, wifi y cocheras");
				
				adaptador5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador5);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						
						switch (position){
						case 0:
							caracteristicas4.setText("Estas habitaciones cuentan con un sommier de dos plazas o de una plaza, ba??o privado, televisor lcd, ventilador, aire acondicionado.");
							break;
						case 1:
							caracteristicas4.setText("Estas habitaciones cuentan con dos sommiers de una plaza, ba??o privado, televisor lcd, ventilador, aire acondicionado.");
							break;
							
						case 2:
							caracteristicas4.setText("Estas habitaciones cuentan con tres sommiers de una plaza o un sommier de dos plazas mas una cucheta, ba??o privado, televisor lcd, ventilador, aire acondicionado.");
							break;	
						}	
					}
					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Bu3QxPb5mYt"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;

				
			case 6:
				spinner2.setVisibility(View.GONE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				imagen1.setVisibility(View.VISIBLE);
				imagen2.setVisibility(View.VISIBLE);
				imagen3.setVisibility(View.VISIBLE);
				imagen4.setVisibility(View.VISIBLE);
				imagen5.setVisibility(View.VISIBLE);
				nombre.setText("Hotel Riposo");
				direccion2.setText("Ruta 16 Km 175,1");
				telefono2.setText("+549-(364)-4437016");
				contacto2.setText("https://www.facebook.com/pages/Hotel-Riposo/478717502175273");
				imagen1.setImageResource(R.drawable.ripo1);
				imagen2.setImageResource(R.drawable.ripo2);
				imagen3.setImageResource(R.drawable.ripo3);
				imagen4.setImageResource(R.drawable.ripo4);
				imagen5.setImageResource(R.drawable.ripo5);
				caracteristicas3.setVisibility(View.GONE);
				caracteristicas4.setVisibility(View.GONE);
				reservas.setVisibility(View.GONE);
				reservas1.setVisibility(View.GONE);
				caracteristicas2.setText("Sommiers (1 y 2 plazas), Servicio de Wifi, Desayuno incluido, Cable visi??n, Directv, Agua Caliente, Venta de Bebidas, Atenci??n al cliente las 24 hs\n" +
						"Habitaciones Simples, Matrimoniales, Dobles y Triples\n" +
						"Reservas a los tel??fonos mencionados anteriormente");
				
				adaptador5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador5);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {

					}
					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}

				});
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/B5duRM3a13F2"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
			case 7:
			nombre.setText("Hotel Martykan");
			direccion2.setText("Superiora Palmira 544");
			telefono2.setText("+549-(364)-4420293");
			imagen1.setVisibility(View.VISIBLE);
			imagen1.setImageResource(R.drawable.martykan);
			imagen2.setVisibility(View.GONE);
			imagen3.setVisibility(View.GONE);
			imagen4.setVisibility(View.GONE);
			imagen5.setVisibility(View.GONE);
			contacto1.setVisibility(View.GONE);
			contacto2.setVisibility(View.GONE);
			reservas1.setVisibility(View.GONE);
			caracteristicas2.setText("Cochera, TV, Aire Acondicionado, Wifi, Desayuno opcional no inclu??do, contamos con habitaciones single, dobles y triples\n" +
					"Las reservas se ralizan al tel??fono mencionado anteriormente");
			caracteristicas3.setVisibility(View.GONE);
			caracteristicas4.setVisibility(View.GONE);
			reservas.setVisibility(View.GONE);
			adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			spinner2.setAdapter(adaptador4);
			spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
				
				@Override
				public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
					spinner2.setVisibility(View.GONE);
					}
					

				@Override
				public void onNothingSelected(AdapterView<?> parent) {
					// TODO Auto-generated method stub
					
				}
				
			});
			
			
			como2.setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View v) {
					Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/XPetGLbP27G2"));
					startActivity(j);
				}
			});
			como2.setOnTouchListener(new PersonalTouch());
			break;
			
			case 8:
				nombre.setText("Hospedaje El Colono");
				direccion2.setText("San Mart??n 755");
				telefono2.setText("+549-(364)-4420626");
				contacto2.setText("mamagla@hotmail.com");
				imagen1.setVisibility(View.VISIBLE);
				imagen1.setImageResource(R.drawable.colono);
				imagen2.setVisibility(View.GONE);
				imagen3.setVisibility(View.GONE);
				imagen4.setVisibility(View.GONE);
				imagen5.setVisibility(View.GONE);
				contacto1.setVisibility(View.VISIBLE);
				contacto2.setVisibility(View.VISIBLE);
				reservas1.setVisibility(View.GONE);
				caracteristicas2.setText("En nuestro Hospedaje El Colono ofrecemos precios econ??micos y un lugar completamente seguro. El??janos, tenemos 70 a??os de trayectoria en el rubro.\n"
				+"En nuestra empresa, Hospedaje El Colono, buscamos la satisfacci??n del cliente, a trav??s de un servicio eficiente y de primera calidad.\n" +
				"Ofrecemos a nuestros hu??spedes:\n "
				+"Restaurante, Estacionamiento exclusivo (no techado), servicio de wifi, habitaciones con ba??o privado y TV.\n" +
				"Nos caracterizamos por estar ubicados en el centro de la ciudad. Atendemos a empresas y familias.\n"+
				"Las reservas se ralizan las 24 horas al d??a al tel??fono mencionado anteriormente");
				caracteristicas3.setVisibility(View.GONE);
				caracteristicas4.setVisibility(View.GONE);
				reservas.setVisibility(View.GONE);
				
				adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador4);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
					
					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						spinner2.setVisibility(View.GONE);
						}
						

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/fkNFNnV1BwK2"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
			case 9:
				nombre.setText("Hotel Mura");
				direccion2.setText("Belgrano 589");
				telefono2.setText("+549-(364)-4420764");
				imagen1.setVisibility(View.VISIBLE);
				imagen1.setImageResource(R.drawable.mura);
				imagen2.setVisibility(View.GONE);
				imagen3.setVisibility(View.GONE);
				imagen4.setVisibility(View.GONE);
				imagen5.setVisibility(View.GONE);
				contacto1.setVisibility(View.GONE);
				contacto2.setVisibility(View.GONE);
				reservas1.setVisibility(View.GONE);
				caracteristicas2.setText("Habitaciones simples, dobles, triples y cu??druples ba??o privado y wifi\n" +
						"Reservas al tel??fono mencionado anteriormente");
				caracteristicas3.setVisibility(View.GONE);
				caracteristicas4.setVisibility(View.GONE);
				reservas.setVisibility(View.GONE);
				
				adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador4);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
					
					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						spinner2.setVisibility(View.GONE);
						}
						

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Gr1MxTNtNz92"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
			case 10:
				nombre.setText("Hotel Apart");
				direccion2.setText("Saavedra 268");
				telefono2.setText("+549-(364)-4524117 / +549-(364)-4222117");
				imagen1.setVisibility(View.VISIBLE);
				imagen1.setImageResource(R.drawable.apart1);
				imagen2.setVisibility(View.VISIBLE);
				imagen2.setImageResource(R.drawable.apart2);
				imagen3.setVisibility(View.GONE);
				imagen4.setVisibility(View.GONE);
				imagen5.setVisibility(View.GONE);
				contacto1.setVisibility(View.GONE);
				contacto2.setVisibility(View.GONE);
				reservas1.setVisibility(View.GONE);
				caracteristicas2.setText("Alquiler de Departamentos por d??a \n"+"Servicio de mucama, Tv por cable, Internet, Cocina totalmente equipada con heladera, vajilla, microondas y pava el??ctrica \n" +
						"Reservas al tel??fono mencionado anteriormente");
				caracteristicas3.setVisibility(View.GONE);
				caracteristicas4.setVisibility(View.GONE);
				reservas.setVisibility(View.GONE);
				
				adaptador4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				spinner2.setAdapter(adaptador4);
				
				spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
					
					@Override
					public void onItemSelected(AdapterView<?> parent, android.view.View v, int position, long id) {
						spinner2.setVisibility(View.GONE);
						}
						

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub
						
					}
					
				});
				
				
				como2.setOnClickListener(new OnClickListener(){
					@Override
					public void onClick(View v) {
						Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/fgpH1VJwgYJ2"));
						startActivity(j);
					}
				});
				como2.setOnTouchListener(new PersonalTouch());
				break;
				
				
			}	
			Toast.makeText(getApplicationContext(), adaptador.getItem(position).toString(), Toast.LENGTH_LONG).show();
		}
		
		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			
		}
	});
	}


	
}
