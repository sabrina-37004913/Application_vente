package com.example.application_vente;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.ActionBar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainContact extends AppCompatActivity {

    //declare les vues
    EditText  myTextSubject, myTextMessage;
    Button mySendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ActionBar actionBar = getSupportActionBar();

     if (actionBar != null) {
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
    }

    Intent intent = getIntent();
    String aTitle = intent.getStringExtra("title");
        actionBar.setTitle(aTitle);



    myTextSubject = findViewById(R.id.edit_text_subject);
    myTextMessage = findViewById(R.id.edit_text_message);
    mySendButton = findViewById(R.id.btn_send);

    // cliquez sur le bouton pour obtenir des informations et appelez la méthode sendEmail
        mySendButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sendMail();
        }
    });
}
    public void sendMail(){
        String[] mails = { "nomprenom@gmail.com" };

        Intent email = new Intent(Intent.ACTION_SEND);
        email.setType("text/plain");
        email.putExtra(Intent.EXTRA_EMAIL,mails);
        email.putExtra(Intent.EXTRA_SUBJECT, myTextSubject.getText().toString().trim());
        email.putExtra(Intent.EXTRA_TEXT, myTextMessage.getText().toString().trim());


        try {
            //paas d'erreur , on start notre intent
            startActivity(Intent.createChooser(email,"Choix de l'application"));
        }
        catch (Exception e){
            //si il y aun probleme, soit internet ne fonctionne pas, ou soit le mail est inconnu ou un truc du genre
            //on affiche un messsage d'exception
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}

