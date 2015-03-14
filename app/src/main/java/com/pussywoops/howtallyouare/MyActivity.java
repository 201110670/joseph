package com.pussywoops.howtallyouare;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends Activity {
    EditText amount1;

    TextView tt;
    Button calculate;
    double x=0;
    double y=0;
    double z=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        initControls();
    }

    private void initControls()
    {
        amount1=(EditText)findViewById(R.id.editText);

        tt=(TextView)findViewById(R.id.textView4);
        calculate=(Button)findViewById(R.id.button);
        calculate.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                calculate();}
        });
    }
    private void calculate()
    {
        x=Integer.parseInt(amount1.getText().toString());
        if (x<=30.48)
        {
            z=1;

        } else if (x>30.48 && x<60.96)
        {
            z=2;
        }else if (x>60.96 && x<91.44)
        {
            z=3;
        }else if (x>91.44 && x<121.92)
        {
            z=4;
        }else if (x>121.92 && x<152.4)
        {
            z=5;
        }else if (x>152.4 && x<182.88)
        {
            z=6;
        }else if (x>182.88 && x<213.36)
        {
            z=7;
        }else if (x>213.36 && x<243.84)
        {
            z=8;
        }else if (x>243.84 && x<274.32)
        {
            z=9;
        }
        tt.setText(Double.toString(z));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
