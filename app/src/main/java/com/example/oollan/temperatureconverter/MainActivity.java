package com.example.oollan.temperatureconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edit_text)
    EditText editText;
    @BindView(R.id.radio_celsius)
    RadioButton celsius;
    @BindView(R.id.radio_fahrenheit)
    RadioButton fahrenheit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_calculate)
    public void onClick() {
        if (editText.getText().length() == 0) {
            Toast.makeText(this, "Please enter a valid number",
                    Toast.LENGTH_LONG).show();
        }
        if (celsius.isChecked()) {
            editText.setText(String
                    .valueOf(ConverterUtil.convertFahrenheitToCelsius
                            (Float.parseFloat(editText.getText().toString()))));
            celsius.setChecked(false);
            fahrenheit.setChecked(true);
        } else {
            editText.setText(String
                    .valueOf(ConverterUtil.convertCelsiusToFahrenheit
                            (Float.parseFloat(editText.getText().toString()))));
            fahrenheit.setChecked(false);
            celsius.setChecked(true);
        }
    }
}