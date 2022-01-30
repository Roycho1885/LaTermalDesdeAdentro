package com.roycho.latermaldadentro;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class MenuPrincipal extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    private CardView cardlatermal, cardclima, cardfotos, cardnoticias, cardsobre, cardmapa;

    private ShareActionProvider mShareActionProvider;
    private ProgressDialog pDialog;
    private MiTareaAsincronaDialog tarea2;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Envíanos tu sugerencia",Toast.LENGTH_LONG).show();
                Intent j = new Intent(getApplicationContext(),contacto.class);
                startActivity(j);
            }
        });



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        //defino los cardview
        cardlatermal = findViewById(R.id.card_latermal);
        cardclima = findViewById(R.id.card_clima);
        cardfotos = findViewById(R.id.card_fotos);
        cardnoticias = findViewById(R.id.card_noticias);
        cardsobre = findViewById(R.id.card_sobre);
        cardmapa = findViewById(R.id.card_mapa);

        //agrego click listener a los cardview
        cardlatermal.setOnClickListener(this);
        cardclima.setOnClickListener(this);
        cardfotos.setOnClickListener(this);
        cardnoticias.setOnClickListener(this);
        cardsobre.setOnClickListener(this);
        cardmapa.setOnClickListener(this);

    }

    public void onClick(View v) {

        Intent i;

        switch (v.getId()) {
            case R.id.card_latermal:
                Toast.makeText(this,"La Termal", Toast.LENGTH_SHORT).show();
                i = new Intent(this, menu.class);
                startActivity(i);
                break;
            case R.id.card_clima:
                pDialog = new ProgressDialog(this,ProgressDialog.THEME_HOLO_LIGHT);
                pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                pDialog.setMessage("Procesando...");
                pDialog.setCancelable(true);

                tarea2 = new MiTareaAsincronaDialog();
                tarea2.execute();
                break;
            case R.id.card_noticias:
                Toast.makeText(this,"Noticias", Toast.LENGTH_SHORT).show();
                i = new Intent(this, Noticias.class);
                startActivity(i);
                break;
            case R.id.card_mapa:
                Toast.makeText(this,"Mapa", Toast.LENGTH_SHORT).show();
                i = new Intent(this, MapsActivity.class);
                startActivity(i);
                break;
            case R.id.card_sobre:
                Toast.makeText(this,"Sobre la ciudad", Toast.LENGTH_SHORT).show();
                i = new Intent(this, sobreciudad.class);
                startActivity(i);
                break;
            case R.id.card_fotos:
                Toast.makeText(this,"Fotos", Toast.LENGTH_SHORT).show();
                i = new Intent(this, FotosCiudad.class);
                startActivity(i);
            default:
                break;

        }
    }

    private void tareaLarga()
    {
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {}
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    private class MiTareaAsincronaDialog extends AsyncTask<Void, Integer, Boolean> {

        @Override
        protected Boolean doInBackground(Void... params) {

            for(int i=1; i<=20; i++) {
                tareaLarga();

                publishProgress(i*20);

                if(isCancelled())
                    break;
            }

            return true;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            int progreso = values[0];

            pDialog.setProgress(progreso);
        }

        @Override
        protected void onPreExecute() {

            pDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    MenuPrincipal.MiTareaAsincronaDialog.this.cancel(true);
                }
            });

            pDialog.setProgress(0);
            pDialog.show();
        }

        @Override
        protected void onPostExecute(Boolean result) {

            Intent j = new Intent("android.intent.action.CLIMAA");
            startActivity(j);

            if(result)
            {
                pDialog.dismiss();
            }
        }

        @Override
        protected void onCancelled() {
            Toast.makeText(MenuPrincipal.this, "Tarea cancelada!", Toast.LENGTH_SHORT).show();
        }

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Intent i;

        if (id == R.id.nav_camera) {
            i = new Intent(this, Sobreapp.class);
            startActivity(i);
        } else if (id == R.id.nav_gallery) {
            i = new Intent(this,FotosCiudad.class);
            startActivity(i);

        } else if (id == R.id.nav_share) {

            Intent intent = new Intent(android.content.Intent.ACTION_SEND);
            intent.setType("text/plain");
            String shareBodyText = "https://play.google.com/store/apps/details?id=com.roycho.latermaldadentro";
            intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Aplicación La Termal Desde Adentro");
            intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
            startActivity(Intent.createChooser(intent, "Elegir método"));

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
