package kr.ac.kangwon.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Lab_04_circulate extends AppCompatActivity {
    EditText e1, e2;
    TextView e3;
    public void plus(View view){

        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText);
        e3=(TextView)findViewById(R.id.circulate_result1);

        double x = Double.parseDouble(e1.getText().toString());
        double y = Double.parseDouble(e2.getText().toString());
        Double result = x+y;

        e3.setText("   "+result.toString());

    }

    public void minus(View view){

        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText);
        e3=(TextView)findViewById(R.id.circulate_result1);

        double x = Double.parseDouble(e1.getText().toString());
        double y = Double.parseDouble(e2.getText().toString());
        Double result = x-y;

        e3.setText("   "+result.toString());

    }

    public void times(View view){

        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText);
        e3=(TextView)findViewById(R.id.circulate_result1);

        double x = Double.parseDouble(e1.getText().toString());
        double y = Double.parseDouble(e2.getText().toString());
        Double result = x*y;

        e3.setText("   "+result.toString());

    }

    public void divided(View view){

        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText);
        e3=(TextView)findViewById(R.id.circulate_result1);

        Double x = Double.parseDouble(e1.getText().toString());
        Double y = Double.parseDouble(e2.getText().toString());
        double z = Double.parseDouble(e1.getText().toString());
        double w = Double.parseDouble(e2.getText().toString());
        Double result = Double.parseDouble(String.format("%.3f",z/w)) ;
        Integer u = (int)(x/y);
        Integer v = (int)(x%y);
        if(u>1) {
            e3.setText("   " + result.toString() + " 몫 : " + u.toString() + " 나머지 : " + v.toString());
        }
        else{
            e3.setText("   " + result.toString());
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulate);
    }
}
