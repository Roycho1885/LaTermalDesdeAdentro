package com.roycho.latermaldadentro;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Roycho on 1/11/2018.
 */

public class FotosCiudad extends AppCompatActivity {

    private Integer[] images={R.drawable.mural,R.drawable.plazaensan,R.drawable.catedral,
            R.drawable.zoo,R.drawable.termal,R.drawable.fiesta,R.drawable.aeropuerto,R.drawable.bandera,R.drawable.pasarela,R.drawable.estaciontren,R.drawable.estaciontren1};
    private ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fotosciudad);

        Gallery imgGallery = (Gallery) findViewById(R.id.gallery);

        imgGallery.setAdapter(new ImageAdapter(this));
        imageview = (ImageView) findViewById(R.id.imageView);
        imgGallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,long arg3) {
                //Toast.makeText(getApplicationContext(), "Image " + arg2,Toast.LENGTH_SHORT).show();
                imageview.setImageResource(images[arg2]);

                if (arg2==0){
                    Toast.makeText(getApplicationContext(), R.string.mural, Toast.LENGTH_SHORT).show();
                }
                if (arg2==1){
                    Toast.makeText(getApplicationContext(), R.string.plaza, Toast.LENGTH_SHORT).show();
                }
                if (arg2==2){
                    Toast.makeText(getApplicationContext(), R.string.catedral, Toast.LENGTH_SHORT).show();
                }
                if (arg2==3){
                    Toast.makeText(getApplicationContext(), R.string.zoo, Toast.LENGTH_SHORT).show();
                }
                if (arg2==4){
                    Toast.makeText(getApplicationContext(), R.string.termal, Toast.LENGTH_SHORT).show();
                }
                if (arg2==5){
                    Toast.makeText(getApplicationContext(), R.string.fiesta, Toast.LENGTH_SHORT).show();
                }
                if (arg2==6){
                    Toast.makeText(getApplicationContext(), R.string.aero, Toast.LENGTH_SHORT).show();
                }
                if (arg2==7){
                    Toast.makeText(getApplicationContext(), R.string.band, Toast.LENGTH_SHORT).show();
                }
                if (arg2==8){
                    Toast.makeText(getApplicationContext(), R.string.pasarela1, Toast.LENGTH_SHORT).show();
                }
                if (arg2==9){
                    Toast.makeText(getApplicationContext(), R.string.pasarela2, Toast.LENGTH_SHORT).show();
                }
                if (arg2==10){
                    Toast.makeText(getApplicationContext(), R.string.pasarela3, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }



    public class ImageAdapter extends BaseAdapter {
        private Context context;
        int imageBackground;

        public ImageAdapter(Context context) {

            this.context = context;
        }

        @Override
        public int getCount() {

            return images.length;
        }

        @Override
        public Object getItem(int arg0) {

            return arg0;
        }

        @Override
        public long getItemId(int arg0) {

            return arg0;
        }

        @Override
        public View getView(int arg0, View arg1, ViewGroup arg2) {

            ImageView imageView = new ImageView(context);
            imageView.setImageResource(images[arg0]);
            return imageView;
        }
    }

}
