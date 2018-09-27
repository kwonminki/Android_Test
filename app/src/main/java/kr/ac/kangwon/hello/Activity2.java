package kr.ac.kangwon.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button ID_1;

    public void Cancle(View view){
        Intent mIntent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(mIntent);
    }

    public void Ok(View view){
        //ID_1.setText("@string/login_ID");

        Intent mIntent = new Intent(getApplicationContext(),Activity3.class);
        startActivity(mIntent);
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ID_1=(Button)findViewById(R.id.Ok);
    }
}
