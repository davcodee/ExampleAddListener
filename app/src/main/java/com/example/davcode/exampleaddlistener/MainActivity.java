package com.example.davcode.exampleaddlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*Button a ser clickeado mediante la interfaz View.onClickListener*/
    private Button btnClick;

    /*Button a ser clickeado mediante el setteo de listeners */
    private Button btnClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Busqueda del btnCLick mediante el id */
        btnClick = (Button) findViewById(R.id.btnClick);

        /*Busqueda dell btnClick2 mediante el id*/
        btnClick2 =(Button)findViewById(R.id.btnClick2);

        /*Agregamos el listener mediante la palabre reservada this*/
        btnClick.setOnClickListener(this);

        /*Setteamos el listener a nuestro button2*/
        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has clickeado la opción 2", Toast.LENGTH_SHORT).show();
            }
        });

    }

    /*
    * Método onClick que se ejecuta cuando se clickea
    * un view
    */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnClick:
                //Notificamos a nuestro user que el button fue clickeado
                Toast.makeText(this, "Has clickeado el button", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    /*
    *
    * */
    public void click(View view) {
        Toast.makeText(this, "Has clikeado la opción 2", Toast.LENGTH_SHORT).show();
    }
}
