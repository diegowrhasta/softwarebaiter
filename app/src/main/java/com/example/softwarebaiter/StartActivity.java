package com.example.softwarebaiter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
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

public class StartActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setTitle("Bienvenido");
        BienvenidoFragment bienvenidoFragment = new BienvenidoFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.FragmentHolder, bienvenidoFragment).commit();

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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_crear_persona) {
            setTitle("Crear Persona");
            CrearPersonaFragment crearPersonaFragment = new CrearPersonaFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, crearPersonaFragment).commit();
        }
        else if (id == R.id.nav_mostrar_personas) {
            setTitle("Mostrar Personas");
            MostrarPersonasFragment mostrarPersonasFragment = new MostrarPersonasFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, mostrarPersonasFragment).commit();
        }
        else if (id == R.id.nav_buscar_persona) {
            setTitle("Buscar Persona");
            BuscarPersonaFragment buscarPersonaFragment = new BuscarPersonaFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, buscarPersonaFragment).commit();
        }
        else if (id == R.id.nav_actualizar_persona) {
            setTitle("Actualizar Persona");
            ActualizarPersonaFragment actualizarPersonaFragment = new ActualizarPersonaFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, actualizarPersonaFragment).commit();
        }
        else if (id == R.id.nav_eliminar_persona) {
            setTitle("Eliminar Persona");
            EliminarPersonaFragment eliminarPersonaFragment = new EliminarPersonaFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, eliminarPersonaFragment).commit();
        }
        else if (id == R.id.nav_crear_usuario) {
            setTitle("Crear Usuario");
            CrearUsuarioFragment crearUsuarioFragment = new CrearUsuarioFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, crearUsuarioFragment).commit();
        }
        else if (id == R.id.nav_mostrar_usuarios) {
            setTitle("Mostrar Usuarios");
            MostrarUsuariosFragment mostrarUsuariosFragment = new MostrarUsuariosFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, mostrarUsuariosFragment).commit();
        }
        else if (id == R.id.nav_buscar_usuario) {
            setTitle("Buscar Usuario");
            BuscarUsuarioFragment buscarUsuarioFragment = new BuscarUsuarioFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, buscarUsuarioFragment).commit();
        }
        else if (id == R.id.nav_actualizar_usuario) {
            setTitle("Actualizar Usuario");
            ActualizarUsuarioFragment actualizarUsuarioFragment = new ActualizarUsuarioFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, actualizarUsuarioFragment).commit();
        }
        else if (id == R.id.nav_eliminar_usuario) {
            setTitle("Eliminar Usuario");
            EliminarUsuarioFragment eliminarUsuarioFragment = new EliminarUsuarioFragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.FragmentHolder, eliminarUsuarioFragment).commit();
        }
        else if (id == R.id.nav_salir) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
            Toast.makeText(this, "Hell Yeah Brother", Toast.LENGTH_SHORT).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
