package com.example.alumno.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        TextView txt = (TextView)(super.findViewById(R.id.texto));
        Button btn = (Button)(super.findViewById(R.id.botonsito));
        EditText edt = (EditText)(super.findViewById(R.id.edt));

        btn.setOnClickListener(new MyListener(txt,edt));
*/

        Button btnGuardar = (Button)super.findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(new MyListener(DESPUESPONERACAELRESTO);
    }
}
