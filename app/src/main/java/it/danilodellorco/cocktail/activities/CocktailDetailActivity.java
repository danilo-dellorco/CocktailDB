package it.danilodellorco.cocktail.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;


import com.android.volley.Response;
import com.android.volley.toolbox.ImageRequest;

import it.danilodellorco.cocktail.R;
import it.danilodellorco.cocktail.database.Cocktail;

public class CocktailDetailActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    final ImageView photo;
    super.onCreate(savedInstanceState);
    Intent data = getIntent();
    Cocktail cocktail = data.getParcelableExtra("cocktail");
    setContentView(R.layout.activity_cocktail_detail);
    setTitle(cocktail.strDrink);
    photo = findViewById(R.id.photo);
    photo.setImageResource(R.drawable.default_image);
    String url = "https://www.thecocktaildb.com/images/media/drink/vrwquq1478252802.jpg/preview";

    ImageRequest ir = new ImageRequest(url, new Response.Listener<Bitmap>() {
      @Override
      public void onResponse(Bitmap response) {
        photo.setImageBitmap(response);
      }
    }, 0, 0, null, null);
  }

}