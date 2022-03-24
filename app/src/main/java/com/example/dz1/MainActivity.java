package com.example.dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView username;
    private TextView rectangle1;
    private TextView rectangle2;
    private TextView rectangle3;
    private TextView password;
    private Button enter;
    private ImageView facebook;
    private ImageView google;
    private ImageView contact;
    private EditText key;
    private EditText car;
    private TextView textView;
    private TextWatcher textWatcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        enter = findViewById(R.id.enter_ic);
        rectangle1 = findViewById(R.id.rectangle1);
        rectangle2 = findViewById(R.id.rectangle2);
        rectangle3 = findViewById(R.id.rectangle3);
        facebook = findViewById(R.id.facebook);
        google = findViewById(R.id.google);
        contact = findViewById(R.id.contact);
        key = findViewById(R.id.key);
        car = findViewById(R.id.car);
        textView = findViewById(R.id.text10_ic);

        textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (key.getText().toString().length() > 0 && car.getText().toString().length() > 0) {
                    enter.setBackground(getDrawable(R.drawable.orange));
                } else {
                    enter.setBackground(getDrawable(R.drawable.button_ic));
                    enter.setBackgroundColor(getColor(R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        };
        key.addTextChangedListener(textWatcher);
        car.addTextChangedListener(textWatcher);
        enter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (key.getText().toString().equals("123") && car.getText().toString().equals("123")) {
                    Toast.makeText(MainActivity.this, "Вы успешно зарегистрировались", Toast.LENGTH_LONG).show();
                    username.setVisibility(View.INVISIBLE);
                    textView.setVisibility(View.INVISIBLE);
                    facebook.setVisibility(View.INVISIBLE);
                    rectangle1.setVisibility(View.INVISIBLE);
                    rectangle2.setVisibility(View.INVISIBLE);
                    rectangle3.setVisibility(View.INVISIBLE);
                    google.setVisibility(View.INVISIBLE);
                    contact.setVisibility(View.INVISIBLE);
                    key.setVisibility(View.INVISIBLE);
                    car.setVisibility(View.INVISIBLE);
                    password.setVisibility(View.INVISIBLE);
                    enter.setVisibility(View.INVISIBLE);
                } else {
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}