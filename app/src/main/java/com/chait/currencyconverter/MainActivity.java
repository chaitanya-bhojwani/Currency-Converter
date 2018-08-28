package com.chait.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText dollarField = (EditText) findViewById(R.id.dollarField);
        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());
        Double rupeeAmount = dollarAmount * 64.71 ;
        Log.i("Rupee Amount", rupeeAmount.toString());
        Toast.makeText(getApplicationContext(), "₹ " + rupeeAmount.toString(), Toast.LENGTH_LONG).show();
        TextView output = (TextView) findViewById(R.id.output);
        output.setText(rupeeAmount.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
