package com.roycho.latermaldadentro;

import android.app.Activity;
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

public class VisitarLugares extends Activity{
	
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
	
	private TextView titulo;
	private TextView descripcion;
	private TextView descripcion1;
	private TextView descripcion2;
	private TextView descripcion3;
	private TextView descripcion4;
	private TextView descripcion5;
	private TextView descripcion6;
	private TextView como2;
	private ImageView imagen1;
	private ImageView imagen2;
	private ImageView imagen3;
	private ImageView imagen4;
	private ImageView imagen5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.visitarlugares);
		
		titulo = (TextView) findViewById(R.id.titulo);
		como2 = (TextView) findViewById(R.id.como2);
		descripcion = (TextView) findViewById(R.id.descripcion);
		descripcion1 = (TextView) findViewById(R.id.descripcion1);
		descripcion2 = (TextView) findViewById(R.id.descripcion2);
		descripcion3 = (TextView) findViewById(R.id.descripcion3);
		descripcion4 = (TextView) findViewById(R.id.descripcion4);
		descripcion5 = (TextView) findViewById(R.id.descripcion5);
		descripcion6 = (TextView) findViewById(R.id.descripcion6);
		imagen1 = (ImageView) findViewById(R.id.imagen1);
		imagen2 = (ImageView) findViewById(R.id.imagen2);
		imagen3 = (ImageView) findViewById(R.id.imagen3);
		imagen4 = (ImageView) findViewById(R.id.imagen4);
		imagen5 = (ImageView) findViewById(R.id.imagen5);
		
		String[] datos =
				new String[]{"Museo de la Ciudad", "Museo de la Fundaci??n" ,"Museo Ferroviario Municipal Gral. Manuel Belgrano", "Complejo Termal", "Complejo Ecol??gico Municipal", "Casa Cruz","Casa de Cultura","Parque Tem??tico Ciudad de los Ni??os", "Plaza San Martin y Catedral San Roque", "Complejo Cultural Centro Chaque??o","Predio Ferial"};
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
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.GONE);
					imagen4.setVisibility(View.GONE);
					imagen5.setVisibility(View.GONE);
					titulo.setText("Museo de la Ciudad");
					imagen1.setImageResource(R.drawable.museo1);
					imagen2.setImageResource(R.drawable.museo2);
			
					descripcion.setText("El Museo de la Ciudad est?? dividido en dos secciones; por un lado, hay animales disecados y, por el otro lado instrumentos musicales, vestimenta, m??quinas de escribir, entre otros objetos tambi??n donados por familiares de los primeros pobladores. En sus comienzos funcionaba en Casa de Cultura, pero desde el a??o 1962 se encuentra en la calle 1 esquina 12 del centro.\n\n" +
							"Horarios de Visita:\n" +
							"De Lunes a Viernes de 7:30 a 12:30 y de 16 a 20:30 horas");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/sZ8UzR9rKP32"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 1:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.GONE);
					imagen5.setVisibility(View.GONE);
					titulo.setText("Museo de la Fundaci??n");
					imagen1.setImageResource(R.drawable.museo3);
					imagen2.setImageResource(R.drawable.museo4);
					imagen3.setImageResource(R.drawable.arbol);
					descripcion.setText("El Museo de la Fundaci??n fue construido tres meses despu??s de haber sido fundada la ciudad en el a??o 1912; en ese entonces funcionaba como el Casino de Oficiales, un lugar exclusivo para los militares en el cual pod??an ir a tomar algo, a escuchar m??sica o simplemente a descansar de largas jornadas laborales. El mismo fue demolido en el a??o 1964 y reconstruido e inaugurado en marzo del a??o 2008."+
							"Dentro de ??l se puede apreciar trajes utilizados por el comandante Fern??ndez quien fue el fundador de esta ciudad en el a??o mencionado, adem??s de objetos entregados en calidad de pr??stamo o donaci??n por familiares de los primeros pobladores que tuvo la ciudad termal como planchas a carb??n, vajilla, c??maras fotogr??ficas de la ??poca y dem??s. Fuera de ??l est?? el ??rbol Hist??rico, considerado as?? porque debajo de ??l el comandante Fern??ndez asent?? su campamento al llegar a Presidencia Roque S??enz Pe??a.\n\n" +
							"Horarios de Visitas:\n" +
							"Todos los d??as de 8 a 20 horas");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/EKdfYwXogMB2"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 2:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.VISIBLE);
					titulo.setText("Museo Ferroviario Municipal Gral. Manuel Belgrano");
					imagen1.setImageResource(R.drawable.ferro1);
					imagen2.setImageResource(R.drawable.ferro2);
					imagen3.setImageResource(R.drawable.ferro3);
					imagen4.setImageResource(R.drawable.ferro4);
					imagen5.setImageResource(R.drawable.ferro5);
					descripcion.setText("Enclavado en el Ensanche Sur, en el coraz??n del Barrio Belgrano, el Museo ocupa un lugar ferroviario por excelencia, rodeado de familias de trabajadores viales.\n"+
							"El Museo permite vivir la experiencia de un viaje en tren al subirse a los vagones reconstruidos y ambientados en la d??cada del 30.\n" +
							"Los visitantes tambi??n podr??n conocer la historia del ferrocarril de nuestra ciudad a trav??s de un recorrido de fotograf??as y textos, y de los objetos donados por las familias de S??enz Pe??a.\n"+
							"El ferrocarril es parte fundamental de nuestra historia. Fue por su traza que el pueblo se fund??, en el Kil??metro 173 del recorrido Barranquera ??? Met??n.\n"+
							"En tren llegaron los primeros pobladores; por tren se fueron los grandes cargamentos del oro blanco que trajeron progreso a la regi??n.\n"+
							"Recordar el tren permite a generaciones de saenzpe??enses vivir recuerdos imborrables. El tren era portador de m??ltiples novedades y representaba un paseo y un lugar de encuentros.\n\n"+
							"Horarios de Visitas:\n" +
							"Lunes a Viernes de 8 a 12 y de 16 a 20 horas\n"+
							"Fines de Semana de 9 a 12 y de 16 a 20 horas");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/kikAv2rT3ww"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 3:
					descripcion1.setVisibility(View.VISIBLE);
					descripcion2.setVisibility(View.VISIBLE);
					descripcion3.setVisibility(View.VISIBLE);
					descripcion4.setVisibility(View.VISIBLE);
					descripcion5.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.VISIBLE);
					titulo.setText("Complejo Termal");
					imagen1.setVisibility(View.GONE);
					imagen2.setImageResource(R.drawable.termas2);
					imagen3.setImageResource(R.drawable.termas3);
					imagen4.setImageResource(R.drawable.termas4);
					imagen5.setImageResource(R.drawable.termas5);
					descripcion.setText("Pod??s vivir una experiencia ??nica.\n" +
							"Una experiencia termal... Viv?? la experiencia S??enz Pe??a.\n" +
							"Un espacio de relax y armon??a en el centro del Chaco te espera con la mayor riqueza de sus aguas termales, ??nicas en el norte argentino. Pileta climatizada, masajes especiales y todo un manantial de salud y bienestar completan este espacio ??nico.\n" +
							"Ba??os Termales, pileta climatizada, ba??o turco, sauna, masajes especiales, tratamientos con piedras calientes, masajes relajantes y descontracturantes. \n" +
							"Espacios de distenci??n y relax.\n" +
							"Salas Vip para un m??ximo confort y exclusividad.\n" +
							"Bebidas y comidas naturales, frescas y saludables en el exclusivo Bar Bienestar.\n\n");
					descripcion1.setText("Propiedades Terap??uticas");
					descripcion2.setText("Reumatismo cr??nico.\n" +
							"Artrosis-Artritis cr??nica.\n" +
							"Enfermedades de la piel\n" +
							"Sedante Nervioso\n" +
							"Relajante Muscular\n" +
							"Bursitis-Ci??ticas y Neuralgias.\n" +
							"Debilidad General.\n\n");
					descripcion3.setText("Servicios");
					descripcion4.setText("Ba??o Termal 1/2 hs\n" +
							"Ba??os Diafor??ticos (Turco-Sauna-Ducha Escocesa)\n" +
							"Piscina Hasta 6hs\n" +
							"Masaje Local\n" +
							"Masaje General\n" +
							"Yoga-Masoterapia-Reiki\n" +
							"Shiatzu Reflexolog??a\n" +
							"Aqua Gym\n"+
							"Rehabilitaci??n\n" +
							"Tai Chi Chuan Tao\n"+
							"Nataci??n\n\n");
					
					descripcion6.setText("Para mas info visite: www.termasdesp.com.ar");
					
					descripcion5.setText("Horarios de Atenci??n: De Lunes a Domingos de 8 a 22 horas\n" +
							"Tel??fono: +549-(364)-4433177");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/L9VDe6XzH492"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 4:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.VISIBLE);
					titulo.setText("Complejo Ecol??gico Municipal");
					imagen1.setImageResource(R.drawable.zoo1);
					imagen2.setImageResource(R.drawable.zoo2);
					imagen3.setImageResource(R.drawable.zoo3);
					imagen4.setImageResource(R.drawable.zoo4);
					imagen5.setImageResource(R.drawable.zoo5);
			
					descripcion.setText("El Complejo tiene sus or??genes en un mini-zool??gico que un 1?? de septiembre de 1978 habilitaba su primera Jaula-Parque en un peque??o sector del predio del Vivero Municipal. Luego se le asignaron 20 hect??reas para llegar hoy a 150, se sostienen a??n los fundamentos de su creaci??n, que por ese entonces eran solo sue??os: ???crear un lugar de recreaci??n para todas las familias de la regi??n, educar para dar lucha al mascotismo, fundamentalmente el que involucra a especies de la fauna silvestre, y recuperar animales de la fauna aut??ctona para intentar su liberaci??n en ??reas protegidas???.\n" +
							"Hoy estos objetivos se han ampliado a todo lo que tiene que ver con la Reproducci??n, manejo y estudios biol??gicos de las Especies en Peligro de Extinci??n, la recuperaci??n y liberaci??n de especies Aut??ctonas del Parque Chaque??o, y la Transferencia Educativa a trav??s de Cursos, Charlas, Visitas Guiadas, Exposiciones, Conferencias de todos los temas que tienen que ver con nuestra flora, fauna y Medio Ambiente.\n" +
							"La actual denominaci??n: ???COMPLEJO ECOL??GICO MUNICIPAL???, surge de la realidad y comienza a ser utilizada por docentes, que consideraban al lugar un verdadero Complejo donde se pod??a obtener contacto directo con todo lo que tiene que ver con el Equilibrio Ecol??gico del que tanto se habla en estos tiempos, FAUNA, FLORA, MANEJO INTELIGENTE DE AGUA LLOVIDA, ESMERO POR LA HIGIENE Y LIMPIEZA. Por ello quien conduce esta ??rea municipal propuso hace ya varios a??os esta nueva denominaci??n, con la que se nos identifica y distingue a nivel Provincial, Nacional e Internacional. Tambi??n debe destacarse que en el pa??s, por sus caracter??sticas es ??nico, no se conocen ante-cedentes en Sudam??rica.\n" +
							"Ubicado en el Centro del Interior Chaque??o, en la Ciudad de Presidencia Roque S??enz Pe??a, el Complejo Ecol??gico Municipal ofrece a sus visitantes una variedad de alternativas que exceden la simple posibilidad de observar animales en cautividad.\n\n" +
							"Horarios de Visitas:\n" +
							"De Lunes a Viernes de 9 a 18 horas\n" +
							"S??bados, Domingos y Feriados de 8 a 18:30 horas");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/EN87fRpzcyt"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 5:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.VISIBLE);
					titulo.setText("Casa Cruz");
					imagen1.setImageResource(R.drawable.casac1);
					imagen2.setImageResource(R.drawable.casac2);
					imagen3.setImageResource(R.drawable.casac3);
					imagen4.setImageResource(R.drawable.casac4);
					imagen5.setImageResource(R.drawable.casac5);
			
					descripcion.setText("Esta casa tiene su origen en la d??cada de 1940, en la que fue construida por una familia de apellido Ivanoff oriunda de Bulgaria. No tom?? mayor protagonismo hasta cuarenta a??os despu??s, cuando debido a su forma, aparecieron publicadas numerosas historias y misterios.\n" +
							"Respecto a los diversos misterios que ha generado el tema, muchos son los dichos y deambulan varios dogmas acerca de un mito que fue transformado por la creencia popular en uno de los atractivos m??s grandes de tipo religioso.\n"+
							"La casa fue habitada por la familia Ivanoff hasta fines de los a??os 1948 y hasta hoy no se conocen con exactitud las razones por las que Naiden, padre de la familia, construy?? la casa, por lo que los lugare??os afirman ???es un secreto que se llev?? a la tumba???, inclusive algunos reprodujeron las propias palabras de Don Naiden que la edificaci??n ???fue un mensaje de Dios para el pueblo chaque??o???.\n"
							+"Es una construcci??n muy singular por los elementos que componen toda la edificaci??n, como ser la casa en si con forma de una cruz, rodeada de dos canales circulares conc??ntricos unidos a su vez por doce canales peque??os y los dos que se extienden formando una gran cruz, orientados perf??ctamente hacia los puntos cardinales y coincidiendo con los ejes en forma de cruz de la casa. Adem??s de todo esto, en cada uno de los v??rtices c??ncavos formados por la cruz, hay construidos cuatro aljibes de alrededor de ocho mil litros cada uno, uno y tan solo uno de los cuales prove??a de agua helada para beber a la familia.\n\n" +
							"Horarios de Atenci??n: Fines de semana\n" +
							"Por la ma??ana: de 9 a 11:30 hs\n" +
							"Por la tarde: de 15 a 20 hs");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Et65JKVwHB22"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 6:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.GONE);
					imagen5.setVisibility(View.GONE);
					titulo.setText("Casa de Cultura");
					imagen1.setImageResource(R.drawable.cultura);
					imagen2.setImageResource(R.drawable.cultura1);
					imagen3.setImageResource(R.drawable.cultura2);
			
					descripcion.setText("Este edificio fue una gran tienda llamada Blanco y Negro. Actualmente, en ese lugar se brinda educaci??n al ciudadano en lo que refiere a materia cultural, es decir, se ense??an danzas cl??sicas, espa??olas, folcl??ricas; a tocar instrumentos musicales; a cantar; a realizar artesan??as; y, a trav??s de un proyecto impulsado por la Secretaria de Cultura, se trabaja en la concientizaci??n del ciudadano saenzpe??ense en lo que refiere al cuidado del medio ambiente, mediante campa??as de reciclado y protecci??n de los ??rboles.");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/UCz8k572euF2"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 7:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.VISIBLE);
					titulo.setText("Parque Tem??tico Ciudad de los Ni??os");
					imagen1.setImageResource(R.drawable.parque1);
					imagen2.setImageResource(R.drawable.parque2);
					imagen3.setImageResource(R.drawable.parque3);
					imagen4.setImageResource(R.drawable.parque4);
					imagen5.setImageResource(R.drawable.parque5);
			
					descripcion.setText("El parque tem??tico que tiene como eje central estar enfocado hacia el universo de la ni??ez en su conjunto, por lo cual se lo divide en distintos sectores en los cuales se plantean distintas alternativas de usos y actividades."+
							" Es decir que entonces estar?? destinado principalmente a contener actividades relacionadas con los juegos para ni??os, adem??s de complementarse ??sta actividad con ??reas de deportes, zonas de esparcimiento, kioscos y ??reas de expansi??n."+
							" Se hace tambi??n una evocaci??n tem??tica de las culturas regionales ind??genas, que est??n presentes a trav??s de diferentes maneras, como ser a partir de bajorrelieves y guardas en los senderos peatonales con figuras icnogr??ficas representativas de las culturas ind??genas."+ 
									" Asimismo dispone de elementos de se??alizaci??n necesarios para el tr??nsito peatonal y de se??al??ctica para orientaci??n en general que contribuyan a promover la educaci??n vial de los ni??os y de la poblaci??n que visite el predio del parque.\n\n" +
									"Horarios de Atenci??n:\n" +
									"Viernes, S??bados y Domingos de 16 a 20 horas");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Mdz6vcC5A182"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 8:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.VISIBLE);
					titulo.setText("Plaza San Mart??n y Catedral San Roque");
					imagen1.setImageResource(R.drawable.plaza1);
					imagen2.setImageResource(R.drawable.plaza2);
					imagen3.setImageResource(R.drawable.cate1);
					imagen4.setImageResource(R.drawable.cate2);
					imagen5.setImageResource(R.drawable.cate3);
			
					descripcion.setText("La Plaza San Mart??n, que se encuentra rodeada por las calles San Martin, Pellegrini, Belgrano y Chacabuco. " 
							+"En ella hay una peque??a construcci??n llamada Nodo la cual marca el centro de la ciudad. Esta plaza tiene una particularidad que la distingue de las dem??s,"
							+"aparte de ser la plaza central de S??enz Pe??a y es que por un error de planificaci??n en el momento de ser construida no es posible, para aquellas personas que circulan en veh??culos, dar la vuelta a la manzana de la misma.\n\n" +
							"Frente a esta plaza se encuentra la Catedral San Roque. En sus  comienzos nuestra ciudad no contaba con iglesias o capillas, lo que obligaba a los pobladores de ese entonces a viajar hasta Quitilipi"
							+"para asistir a misa o bautizar a los ni??os. Pero el 12 de agosto del a??o 1963 se comienza a construir esta catedral. Los tr??pticos que se observan en la parte superior de la misma y que forman la paloma blanca, representando al Esp??ritu Santo, la virgen Mar??a, San Roque y Jes??s est??n"
							+"confeccionados con peque??as piezas tra??das desde los talleres del Vaticano, Roma, y fueron armados y pegados en S??enz Pe??a.");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Qqp9N2XWV9u"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 9:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.GONE);
					titulo.setText("Complejo Cultural Centro Chaque??o (Ex Cine Teatro Esp??ol)");
					imagen1.setImageResource(R.drawable.teatro1);
					imagen2.setImageResource(R.drawable.teatro2);
					imagen3.setImageResource(R.drawable.teatro3);
					imagen4.setImageResource(R.drawable.teatro4);
			
					descripcion.setText("El Cine Teatro Espa??ol naci?? el 25 de Mayo de 1928, por iniciativa, voluntad y el esfuerzo de la Asociaci??n Espa??ola de Socorros Mutuos." +
							" Sobre los finales de la d??cada del ???20, en un per??odo de auge del proceso inmigratorio que empieza a sentar bases en la provincia, un importante grupo de espa??oles realiz?? donaciones, contribuy?? con cuotas societarias, y desarroll?? diversas actividades para recaudar los fondos que permitieron levantar el edificio." +
							" La inauguraci??n del Teatro Espa??ol se celebr?? con gran emoci??n durante varios d??as en los meses de mayo, junio y julio de 1928, con desfiles, bailes, juegos y asados populares, con kermeses, gaiteros y otros artistas locales e invitados de Capital Federal. En este per??odo se realizaron en sus instalaciones funciones cinematogr??ficas y las escuelas presentaron obras, con gran participaci??n de habitantes de pueblos vecinos e invitados de Resistencia.\n" +
							"El Complejo Cultural logra su reapertura en octubre de 2010, dependiente del Instituto de Cultura del Chaco, y funciona actualmente revalorizando la cultura como herramienta de inclusi??n social y desarrollo de la comunidad, propiciando servicios educativos y culturales locales y regionales.");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/Q6TDARXWZTG2"));
							startActivity(j);
						}
						
					});
					como2.setOnTouchListener(new PersonalTouch());
					break;
					
				case 10:
					descripcion1.setVisibility(View.GONE);
					descripcion2.setVisibility(View.GONE);
					descripcion3.setVisibility(View.GONE);
					descripcion4.setVisibility(View.GONE);
					descripcion5.setVisibility(View.GONE);
					descripcion6.setVisibility(View.GONE);
					imagen1.setVisibility(View.VISIBLE);
					imagen2.setVisibility(View.VISIBLE);
					imagen3.setVisibility(View.VISIBLE);
					imagen4.setVisibility(View.VISIBLE);
					imagen5.setVisibility(View.GONE);
					titulo.setText("Predio Ferial");
					imagen1.setImageResource(R.drawable.feri1);
					imagen2.setImageResource(R.drawable.feri2);
					imagen3.setImageResource(R.drawable.feri3);
					imagen4.setImageResource(R.drawable.feri4);
			
					descripcion.setText("Due??a de las condiciones necesarias para la producci??n del ???oro blanco???, la regi??n que rodea a la ciudad de Presidencia Roque S??enz Pe??a se destaca por ser una de las productoras m??s importantes de este cultivo." +
							" Es por ello que todos lo a??os celebra su magn??fica Fiesta Nacional del Algod??n y la simult??nea FeriChaco.\n" +
							"Desplegando una cartelera que convoca a lugare??os y visitantes, permite deleitarse con espect??culos musicales de primer nivel; la elecci??n de la reina nacional; y charlas que difunden los ??ltimos avances tecnol??gicos para el sector." +
							" A estas propuestas se suma una exposici??n textil, que convoca a los dise??adores de toda la provincia.");
					
					como2.setOnClickListener(new OnClickListener(){
						@Override
						public void onClick(View v) {
							Intent j = new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/MMAqbD6qeup"));
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
	
