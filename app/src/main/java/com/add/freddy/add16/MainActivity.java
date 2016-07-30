package com.add.freddy.add16;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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



        int id = item.getItemId();

        if (id == R.id.nav_info) {
           // Intent actividad = new Intent(MainActivity.this,informacion.class);
            //startActivity(actividad);
        } else if (id == R.id.nav_asambleas) {
           // Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/asambleasDeDios.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_sociedad) {
            Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/sociedadEsposasDePastores.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_mm) {
            Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/ministerioDeLaMujer.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_escuela) {
            Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/escuelaBiblica.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_misioneritas) {
            Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/misioneritas.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_exploradores) {
            Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/exploradoresDelRey.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_misiones) {
            Toast.makeText(MainActivity.this, "          Cargando...          ", Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(MainActivity.this,Web.class);
            String texto = "http://www.kandamotos.com/fredo_ADD/departamentoDeMisiones.php";
            Bundle bundle = new Bundle();
            bundle.putString("TEXT",texto);
            siguiente.putExtras(bundle);
            startActivity(siguiente);
        } else if (id == R.id.nav_seccion_a) {

        } else if (id == R.id.nav_seccion_b) {

        } else if (id == R.id.nav_seccion_c) {

        } else if (id == R.id.nav_seccion_d) {

        } else if (id == R.id.nav_seccion_aroma) {

        } else if (id == R.id.nav_vigilias) {

        } else if (id == R.id.nav_kermes) {

        } else if (id == R.id.nav_aniversarios) {
        } else if (id == R.id.nav_videos_de_lo_que) {
        } else if (id == R.id.nav_video_de_predicas) {
        } else if (id == R.id.nav_videos_musicales) {
        } else if (id == R.id.nav_videos_de_teatros) {
        } else if (id == R.id.nav_ministerios) {
        } else if (id == R.id.nav_mariachis) {
        } else if (id == R.id.nav_sonido) {
        } else if (id == R.id.nav_gui_telefono) {
        } else if (id == R.id.nav_Libros) {
        } else if (id == R.id.nav_mensajes) {
        } else if (id == R.id.nav_notas_musicales) {
        } else if (id == R.id.nav_tv) {
        } else if (id == R.id.nav_radio) {
        } else if (id == R.id.nav_noticias) {
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
