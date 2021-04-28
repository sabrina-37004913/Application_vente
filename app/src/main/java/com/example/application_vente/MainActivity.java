package com.example.application_vente;

import android.os.Bundle;
import android.widget.TextView;

import com.example.application_vente.dataBase.DateBaseManager;
import com.example.application_vente.object.Boutique;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TextView BoutiquesView;
    private DateBaseManager databaseManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);

        BoutiquesView = (TextView) findViewById( R.id.BoutiquesView );
        databaseManager = new DateBaseManager( this );

        databaseManager.insertBoutique( " La féerie des fleurs " , "Saint-André" );
        databaseManager.insertBoutique( " Interflora " , "Saint-Suzanne" );

       // BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
     //   AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
       //         R.id.navigation_home, R.id.navigation_liste_boutiques, R.id.navigation_liste_fleurs)
    //             .build();
    //    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
   //     NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    //    NavigationUI.setupWithNavController(navView, navController);
    List<Boutique> boutiques = databaseManager.read();

        for ( Boutique boutique : boutiques ) {
            BoutiquesView.append( boutique.toString() + "\n\n" );
        }

        databaseManager.close();
    }

}