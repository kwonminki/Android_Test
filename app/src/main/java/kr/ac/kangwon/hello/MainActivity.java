package kr.ac.kangwon.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /*
    public void ClickedBt1(View view){
        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(mIntent);
    }
    public void ClickedBt2(View view){
        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01053458929"));
        startActivity(mIntent);
    }
    public void ClickedBt3(View view){
        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
        startActivity(mIntent);
    }
    public void ClickedBt4(View view){
        finish();
    }
    */

    public void onClicked_login(View view){
        Intent mIntent = new Intent(getApplicationContext(),Activity2.class);
        startActivity(mIntent);
    }


   // int number =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


          final TextView st;
        st=(TextView)findViewById(R.id.string);
        Button mk;
        mk = (Button)findViewById(R.id.button4);
        mk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button mk2;
        mk2 = (Button)findViewById(R.id.button2);
        mk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01053458929"));
                startActivity(mIntent);

            }
        });

        Button mk1;
        mk1 = (Button)findViewById(R.id.button1);
        mk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(mIntent);
            }
        });

        Button mk3;
        mk3 = (Button)findViewById(R.id.button3);
        mk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });
    }
}
