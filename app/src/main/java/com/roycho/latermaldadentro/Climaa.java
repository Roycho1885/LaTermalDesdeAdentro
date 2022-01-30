package com.roycho.latermaldadentro;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import androidx.appcompat.app.AppCompatActivity;

public class Climaa extends AppCompatActivity {

    private AdView mAdView1;

    TextView t1_temp,t3_description,txtulti,texthumed,presion,viento1;
    ImageView imagen;


    public String SetearViento(String viento)
    {
        int dire = Integer.parseInt(viento);

        if (dire == 360)
        {
            viento="N";
        }else if ((dire > 0) && (dire < 90)){
            viento = "NE";
        }else if (dire == 90){
            viento = "E";
        }else if ((dire > 90) && (dire < 180)){
            viento = "SE";
        }else if (dire == 180){
            viento = "S";
        }else if ((dire > 180)&&(dire < 270)){
            viento ="SO";
        }else if (dire == 270){
            viento = "O";
        }else if ((dire > 270) && (dire < 360)){
            viento ="NO";
        }
        return viento;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clima);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest);


        t3_description = findViewById(R.id.textcond);
        t1_temp = findViewById(R.id.texttemp);
        txtulti = findViewById(R.id.textulti);
        texthumed = findViewById(R.id.texthumed);
        imagen = findViewById(R.id.imageView1);
        presion = findViewById(R.id.textpresion);
        viento1 = findViewById(R.id.textviento);


        find_weather();
    }

    private String OUTPUT_DATE_FORMATE="dd-MM-yyyy - hh:mm a";

    public void find_weather()
    {
        String url ="https://api.openweathermap.org/data/2.5/weather?id=3840300&appid=2d2190388fcff245950fb215b8115aa7&units=Metric&lang=es";


        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try
                {
                    String velovientoo = getString(R.string.veloviento);
                    String presion1 = getString(R.string.presion);
                    String humedad1 = getString(R.string.humedadd);

                    JSONObject main_object = response.getJSONObject("main");
                    long dt_objct = response.getInt("dt");

                    JSONArray array = response.getJSONArray("weather");
                    JSONObject object = array.getJSONObject(0);

                    JSONObject viento = response.getJSONObject("wind");
                    String veloviento = String.valueOf(viento.getDouble("speed"));
                    String direviento = String.valueOf(viento.getInt("deg"));


                    String temp = String.valueOf(main_object.getDouble("temp"));
                    String description = object.getString("description");
                    String icono = object.getString("icon");
                    String presionn = String.valueOf(main_object.getInt("pressure"));
                    String humedad = String.valueOf(main_object.getInt("humidity"));


                    t3_description.setText(description);
                    presionn += presion1;
                    presion.setText(presionn);

                    humedad += humedad1;
                    texthumed.setText(humedad);

                    velovientoo += SetearViento(direviento);
                    veloviento += velovientoo;
                    viento1.setText(veloviento);

                    //Insertar fecha actual
                    txtulti.setText(getDateFromUTCTimestamp(dt_objct,OUTPUT_DATE_FORMATE));
                    //insertar imagen

                    Picasso.with(getApplicationContext()).load("https://openweathermap.org/img/wn/"+icono+"@2x.png").resize(200,200).centerCrop().into(imagen);

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE - dd-MM");


                    double temp_int = Double.parseDouble(temp);
                    double centi = Math.round(temp_int);
                    int i = (int)centi;
                    t1_temp.setText(String.valueOf(i));

                }catch(JSONException e)
                {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);

    }

    public String getDateFromUTCTimestamp(long mTimestamp, String mDateFormate) {
        String date = null;
        try {
            Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            cal.setTimeInMillis(mTimestamp * 1000L);
            date = DateFormat.format(mDateFormate, cal.getTimeInMillis()).toString();

            SimpleDateFormat formatter = new SimpleDateFormat(mDateFormate);
            formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date value = formatter.parse(date);

            SimpleDateFormat dateFormatter = new SimpleDateFormat(mDateFormate);
            dateFormatter.setTimeZone(TimeZone.getDefault());
            date = dateFormatter.format(value);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date;
    }
}
