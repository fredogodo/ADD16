package com.add.freddy.add16;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/**
 * Created by FREDDY on 28/07/2016.
 */
public class PaginasWeb extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paginaweb);

        Bundle bundle = getIntent().getExtras();
        String input = bundle.getString("TEXT");

        String url = input;
        WebView view = (WebView) this.findViewById(R.id.webView);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl(url);
    }
}
