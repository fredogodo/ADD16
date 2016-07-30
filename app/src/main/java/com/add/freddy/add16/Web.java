package com.add.freddy.add16;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.Toast;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);

        Bundle bundle = getIntent().getExtras();
        String input = bundle.getString("TEXT");

        ConnectivityManager cManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo nInfo = cManager.getActiveNetworkInfo();
        if(nInfo!=null && nInfo.isConnected()){
          //  Toast.makeText(this, "Cuenta con Internet", Toast.LENGTH_LONG).show();
            String url = input;
            WebView view = (WebView) this.findViewById(R.id.webView);
            view.getSettings().setJavaScriptEnabled(true);
            view.loadUrl(url);
        }else  {
            Toast.makeText(this,"No hay conexion a Internet", Toast.LENGTH_LONG).show();
            WebView view = (WebView) this.findViewById(R.id.webView);
            view.setVisibility(View.INVISIBLE);

            ImageView imageView = (ImageView)findViewById(R.id.imageView2);
            imageView.setVisibility(View.VISIBLE);
        }


    }
}
