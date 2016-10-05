package za.co.codetribe.bmiapp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private RadioGroup radioGroup;
    private EditText etHeight;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        etHeight = (EditText) findViewById(R.id.etHeight);
        textView = (TextView) findViewById(R.id.textView);
    }



    public void onChoiceView(View view) {


        int id = view.getId();
        if (etHeight.getText().toString().equals(""))

        {

            Toast.makeText(MainActivity.this,"Enter your height in meters",Toast.LENGTH_LONG).show();




        }else {
            double height = Double.parseDouble(etHeight.getText().toString());
            double bmi = 0;




            if (id == R.id.radioButton) {

                bmi = 50 * (height * height);

                displayBMI(bmi);
            } else if (id == R.id.radioButton2) {

                bmi = 60 * (height * height);
                displayBMI(bmi);
            } else if (id == R.id.radioButton3) {

                bmi = 100 * (height * height);

                displayBMI(bmi);
            }
        }

    }


    public void displayBMI(double bmi)
    {

        textView.setText("" + bmi);
    }
}
