package edu.ggc.epatter1.currencyconversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button)findViewById(R.id.btnConvert);
        final TextView resultView = (TextView)findViewById(R.id.txtResult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FetchConversionRateTask task = new FetchConversionRateTask(resultView);
                resultView.setText("fetching ...");
                task.execute("GBP", "EUR");
            }
        });
    }
}
