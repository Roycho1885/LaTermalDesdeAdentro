package com.roycho.latermaldadentro;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.fragment.app.FragmentActivity;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final String TAG = "MainActivity";

    Marker m1, c1, ca1, r1, r2, b1, b2, h1, s1;

    private GoogleMap mapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mapa = googleMap;


        try {
            // Customise the styling of the base map using a JSON object defined
            // in a raw resource file.
            boolean success = googleMap.setMapStyle(
                    MapStyleOptions.loadRawResourceStyle(
                            this, R.raw.mapstyle));

            if (!success) {
                Log.e(TAG, "Style parsing failed.");
            }
        } catch (Resources.NotFoundException e) {
            Log.e(TAG, "Can't find style. Error: ", e);
        }

        // Add a marker in Sydney and move the camera
        LatLng saenzpeña = new LatLng(-26.7833325, -60.45);
        mapa.moveCamera(CameraUpdateFactory.newLatLng(saenzpeña));
        mapa.setMinZoomPreference(13.5f);

    }


        public void hoteles(View v){

            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7812365,-60.437936)).title("Atrium Gualok").snippet("San Martín 1198").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.794963,-60.4451646)).title("Aconcágua").snippet("Azcuénaga 39").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7855381,-60.4396371)).title("Presidente").snippet("San Martin 771").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.792233,-60.4423074)).title("Orel").snippet("Saavedra 483").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7916596,-60.4382905)).title("Internacional").snippet("Urquiza 289").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7910212,-60.4353683)).title("Avenida").snippet("Av. Hipólito Yrigoyen 437").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8158484,-60.4095507)).title("Riposo").snippet("Ruta 16 Km 175,1").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7851745,-60.4400596)).title("Martykan").snippet("Superiora Palmira 544").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7857499,-60.4398757)).title("Hospedaje El Colono").snippet("San Martín 755").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.787778,-60.4393265)).title("Mura").snippet("Belgrano 589").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));
            m1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7932511,-60.4399673)).title("Apart").snippet("Saavedra 268").icon(BitmapDescriptorFactory.fromResource(R.drawable.hotell)));

        }

    public void casinos(View v){

        c1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7811443,-60.4387552)).title("Casino Gualok").snippet("Mariano Moreno 1180").icon(BitmapDescriptorFactory.fromResource(R.drawable.casinoo)));
        c1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7953182,-60.4437409)).title("Casino Gualok Sur").snippet("Cte. Fernández 78").icon(BitmapDescriptorFactory.fromResource(R.drawable.casinoo)));
        c1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7914569,-60.4507013)).title("Casino Platinum").snippet("Av. J.M. Rosas y Tomás Edison").icon(BitmapDescriptorFactory.fromResource(R.drawable.casinoo)));

    }

    public void resto (View v){

        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7845488,-60.4378833)).title("El Patio").snippet("Belgrano 909").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7862327,-60.4432588)).title("Roque House").snippet("Mitre 760").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7883182,-60.4408308)).title("Sarava").snippet("San Martín 496").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.781237,-60.437793)).title("Atrium Gualok").snippet("San Martín 1198").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.777973,-60.4371189)).title("Raíces Parrilla-Comedor").snippet("Blas Parera 560").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.783323,-60.438681)).title("Pizzería Palmita").snippet("López y Planes 500").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.788125,-60.441214)).title("Bien José").snippet("25 de Mayo 530").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7936127,-60.444416)).title("Mega Bar").snippet("Azcuénaga (Sobre Paso a Nivel)").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7892837,-60.4399351)).title("Pamper's King").snippet("Belgrano 440").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.791341,-60.435273)).title("Parrilla El Chucaro").snippet("John F. Kennedy 3").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7951133,-60.4437641)).title("El Patio del Cantor").snippet("Cte. Fernández 60").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7915968,-60.4435453)).title("Pizzeria y Resto Giuseppe").snippet("Mariano Moreno 130").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7819337,-60.4393604)).title("La Esquina Chopería y Pizzería").snippet("Mariano Moreno 1091").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7817528,-60.4362231)).title("Carmen").snippet("Pueyrredón 365").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7782175,-60.4364221)).title("Parrilla y Comedor El Decano").snippet("Blas Parera 499").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7822417,-60.4381846)).title("Parrilla y Comedor Shaday").snippet("Almirante Brown 499").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7796304,-60.4357516)).title("Grill-Pizzería-Sandwichería La Casona").snippet("Belgrano 1399").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7861775,-60.4401776)).title("Pizzería y Sandwichería Cacho").snippet("Laprida 521").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.787073,-60.4410599)).title("Fausto Resto Bar").snippet("Mitre 558").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.790902,-60.4432455)).title("Pizzería La Rocola").snippet("Mariano Moreno 202").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7809192,-60.4390467)).title("Pido Pizza").snippet("Mariano Moreno 1100").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7948206,-60.4375507)).title("Cullen Harrison Beer").snippet("Av. Hipólito Yrigoyen 25").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7952016,-60.4370316)).title("1985 Tap Room").snippet("Av. Hipólito Yrigoyen y Buenos Aires").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7862677,-60.4396993)).title("Bless").snippet("Laprida 480").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7870256,-60.4416988)).title("Rojo Resto Bar").snippet("Mariano Moreno 572").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));
        r1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.782539,-60.4384138)).title("La Taberna").snippet("San Martin 1083").icon(BitmapDescriptorFactory.fromResource(R.drawable.restoo)));

    }

    public void cajero(View v){

        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.771613,-60.449801)).title("Link (Nuevo Banco del Chaco S.A.) 1").snippet("Av. los Españoles 1695").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7885567,-60.4409145)).title("Banelco (Banco Patagonia)").snippet("San Martin 468").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7905242,-60.4409617)).title("Link (Nuevo Banco del Chaco S.A.) 2").snippet("Pellegrini 439").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7884208,-60.440296)).title("Link (Cabal)").snippet("25 de Mayo 464").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.786845,-60.440193)).title("Banelco (Banco BBVA Francés)").snippet("San Martin 663").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7765673,-60.4460574)).title("Link (Nuevo Banco del Chaco S.A.) 3").snippet("Av. Malvinas Argentinas 1350").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7903243,-60.4416618)).title("Link (Banco Nación)").snippet("Pellegrini 499").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7924225,-60.4459605)).title("Link (Nuevo Banco del Chaco S.A.) 4").snippet("Av. Sarmiento 764").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7994108,-60.4349601)).title("Link (Nuevo Banco del Chaco S.A.) 5").snippet("C. Janik 155").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7970486,-60.4453614)).title("Link (Nuevo Banco del Chaco S.A.) 6").snippet("Juan Lavalle 509").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8023237,-60.4476844)).title("Link (Nuevo Banco del Chaco S.A.) 7").snippet("Gdor. Castells 550").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7904832,-60.443039)).title("Cajero Banco Santander Rio").snippet("Mariano Moreno 231").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
        ca1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7912666,-60.4423163)).title("Cajero Automático Banco Galicia").snippet("Chacabuco 522").icon(BitmapDescriptorFactory.fromResource(R.drawable.atms)));
    }

    public void bar (View v){

        b1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.787073,-60.4410599)).title("Fausto Resto Bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));
        b1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7911309,-60.4388315)).title("Mü Bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));
        b1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7922888,-60.4425702)).title("Manolo Bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));
        b1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7887259,-60.442912)).title("ManoSanta Bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));
        b1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7854076,-60.4390911)).title("Chino Bar").icon(BitmapDescriptorFactory.fromResource(R.drawable.bar)));
    }

    public void boli (View v){

        b2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.787073,-60.4410599)).title("Complejo Fausto").icon(BitmapDescriptorFactory.fromResource(R.drawable.bolii)));
        b2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7925042,-60.4421017)).title("Password Disco").icon(BitmapDescriptorFactory.fromResource(R.drawable.bolii)));
        b2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.798231,-60.415709)).title("Complejo Zoha NightLife").icon(BitmapDescriptorFactory.fromResource(R.drawable.bolii)));
        b2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.791935,-60.449513)).title("X-Treme Disco").icon(BitmapDescriptorFactory.fromResource(R.drawable.bolii)));
    }

    public void hospi (View v){

        h1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7762989,-60.4481989)).title("Hospital 4 de Junio R. Carrillo").snippet("Av. Malvinas Argentinas 1350").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospi)));
        h1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7848997,-60.4425766)).title("Clínica Centro Médico SRL").snippet("Laprida 771").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospi)));
        h1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7921392,-60.4411389)).title("Clínica Sáenz Peña SRL").snippet("M. Belgrano 155").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospi)));
        h1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7938918,-60.440345)).title("Clínica Avenida").snippet("Av. Sarmiento 293").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospi)));
        h1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.790794,-60.4436523)).title("Instituto Privado Santa María SRL").snippet("Chacabuco 634").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospi)));
        h1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8097705,-60.4189306)).title("Sanatorio Loma Linda SRL").snippet("Ruta 16 y Ruta 95").icon(BitmapDescriptorFactory.fromResource(R.drawable.hospi)));
    }

    public void servis (View v){

        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7856583,-60.43837)).title("Axion Energy").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7969534,-60.4368171)).title("Esso Cooperativa Agrop.").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7889816,-60.4423062)).title("Shell Mecanagro Chaco SACIF").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8039717,-60.4500278)).title("Shell Petrolera Sáenz Peña SC").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7917323,-60.4409771)).title("YPF Sáenz Peña Combustibles SA").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7874687,-60.4430681)).title("YPF Automóvil Club Argentino").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7983174,-60.4451856)).title("YPF Sáenz Peña Center SA").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8134995,-60.4166111)).title("YPF El Cruce SRL").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7986663,-60.4139722)).title("Petrogar SRL").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8126939,-60.4151944)).title("Petrobras Fibras SRL").icon(BitmapDescriptorFactory.fromResource(R.drawable.nafta)));

    }

    public void visitar (View v){


        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7934528,-60.4430299)).title("Museo de la Ciudad").icon(BitmapDescriptorFactory.fromResource(R.drawable.museoo)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7959031,-60.4397778)).title("Museo de la Fundación").icon(BitmapDescriptorFactory.fromResource(R.drawable.museoo)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7820601,-60.4387021)).title("Complejo Termal").icon(BitmapDescriptorFactory.fromResource(R.drawable.termass)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8180178,-60.4188917)).title("Complejo Ecológico Municipal").icon(BitmapDescriptorFactory.fromResource(R.drawable.zooo)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7659517,-60.4179152)).title("Casa Cruz").icon(BitmapDescriptorFactory.fromResource(R.drawable.cruzz)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7893445,-60.4412785)).title("Casa de Cultura").icon(BitmapDescriptorFactory.fromResource(R.drawable.cultural)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7867825,-60.4285431)).title("Parque Temático Ciudad de los Niños").icon(BitmapDescriptorFactory.fromResource(R.drawable.nenes)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7907108,-60.441748)).title("Plaza San Martin").icon(BitmapDescriptorFactory.fromResource(R.drawable.plazaa)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7915531,-60.4408708)).title("Catedral San Roque").icon(BitmapDescriptorFactory.fromResource(R.drawable.catedrall)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7877967,-60.4422267)).title("Complejo Cultural Centro Chaqueño").icon(BitmapDescriptorFactory.fromResource(R.drawable.cultural)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7920868,-60.4286589)).title("Predio Ferial").icon(BitmapDescriptorFactory.fromResource(R.drawable.feria)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7487482,-60.4860556)).title("Aeropuerto").icon(BitmapDescriptorFactory.fromResource(R.drawable.aeroo)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.8025551,-60.447)).title("Estadio Arena Uncaus").icon(BitmapDescriptorFactory.fromResource(R.drawable.arena)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7960321,-60.4428569)).title("Edificio Histórico del Radio Telégrafo").icon(BitmapDescriptorFactory.fromResource(R.drawable.museoo)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7965115,-60.4337004)).title("Mural de la cuidad").icon(BitmapDescriptorFactory.fromResource(R.drawable.murall)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7942773,-60.4408889)).title("Estación de Tren").icon(BitmapDescriptorFactory.fromResource(R.drawable.trenn)));
        s1 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7965559,-60.4379158)).title("Museo Ferroviario Municipal Gral. Manuel Belgrano").icon(BitmapDescriptorFactory.fromResource(R.drawable.museoo)));
    }

    public void remis (View v){

        r2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7898184,-60.4388482)).title("Güemes").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));
        r2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7808607,-60.4374847)).title("Saenz Peña").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));
        r2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7908621,-60.4433728)).title("Laprida").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));
        r2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7933452,-60.4432008)).title("Centro").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));
        r2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7992584,-60.4455689)).title("Líder").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));
        r2 = mapa.addMarker(new MarkerOptions().position(new LatLng(-26.7851666,-60.4397378)).title("Luz").icon(BitmapDescriptorFactory.fromResource(R.drawable.taxi)));

    }

    public void mapa(View v){
        mapa.clear();
    }


}
