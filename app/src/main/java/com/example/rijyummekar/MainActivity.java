package com.example.rijyummekar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.rijyummekar.R;
import com.example.rijyummekar.second;

public class MainActivity extends AppCompatActivity {

    EditText name,no,email,location,home,dob,gender,gra,xll,x,lfa,csw,pl;
    Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn);
        name=findViewById(R.id.name);
        no=findViewById(R.id.no);
        email=findViewById(R.id.email);
        location=findViewById(R.id.location);
        home=findViewById(R.id.home);
        dob=findViewById(R.id.dob);
        gender=findViewById(R.id.gender);
        gra=findViewById(R.id.gra);
        xll=findViewById(R.id.xll);
        x=findViewById(R.id.x);
        lfa=findViewById(R.id.lfa);
        csw=findViewById(R.id.csw);
        pl=findViewById(R.id.pl);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Name=name.getText().toString();
                String No=no.getText().toString();
                String Email=email.getText().toString();
                String Loction=location.getText().toString();
                String Home=home.getText().toString();
                String Dob=dob.getText().toString();
                String Gender=gender.getText().toString();
                String Gra=gra.getText().toString();
                String Xll=xll.getText().toString();
                String X=x.getText().toString();
                String Lfa=lfa.getText().toString();
                String Csw=csw.getText().toString();
                String Pl=pl.getText().toString();


                Intent intent=new Intent(MainActivity.this, second.class);
                intent.putExtra("name",Name);
                intent.putExtra("no",No);
                intent.putExtra("email",Email);
                intent.putExtra("loction",Loction);
                intent.putExtra("home",Home);
                intent.putExtra("dob",Dob);
                intent.putExtra("gender",Gender);
                intent.putExtra("gra",Gra);
                intent.putExtra("xll",Xll);
                intent.putExtra("x",X);
                intent.putExtra("lfa",Lfa);
                intent.putExtra("csw",Csw);
                intent.putExtra("pl",Pl);
                startActivity(intent);


            }
        });
    }
}