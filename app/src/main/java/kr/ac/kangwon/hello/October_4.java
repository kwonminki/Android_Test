package kr.ac.kangwon.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class October_4 extends AppCompatActivity {

    public void Mamamoo(View view){
        Intent mIntent = new Intent(getApplicationContext(),Lab_04_mamamoo.class);
        startActivity(mIntent);
    }

    public void Payment(View view){
        Intent mIntent = new Intent(getApplicationContext(),Lab_04_payment.class);
        startActivity(mIntent);
    }

    public void Circulate(View view){
        Intent mIntent = new Intent(getApplicationContext(),Lab_04_circulate.class);
        startActivity(mIntent);
    }




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_october_4);
    }
}
