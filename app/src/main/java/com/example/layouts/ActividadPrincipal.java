package com.example.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.SQLOutput;

public class ActividadPrincipal extends AppCompatActivity {


    private EditText usuario;
    private EditText password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        usuario = (EditText)findViewById(R.id.input_usuario);
        password = (EditText)findViewById(R.id.input_contrasena);

        Login = (Button)findViewById(R.id.boton_iniciar_sesion);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), MainActivity.class);

                if ( usuario.getText().toString().equals("antonio")){
                    Log.d("mytag", "usuarioCorrecto");
                    startActivityForResult(intent, 0);
                }else{
                    Log.d("mytag", "error");
                }
            }
        });



 /*       if (usuario.getText().toString() == "antonio"){
            Log.d("my tag", "usuario correcto");
            if( password.getText().toString() == "123456"){
                Login.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(v.getContext(), MainActivity.class);
                        startActivityForResult(intent, 0);
                    }
                });
            }
        }else {
            Log.d("my tag", "no funciona y usuario tiene" +  usuario.getText().toString());
        }
  */
    }

}
