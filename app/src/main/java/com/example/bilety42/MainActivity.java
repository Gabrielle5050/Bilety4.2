package com.example.bilety42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText id_user, name, lastName, startingLocation, startingHour, startingMin,
            endLocation, endHour, endMin, price;
    Button button, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_user = findViewById(R.id.id_user);
        name = findViewById(R.id.name);
        lastName = findViewById(R.id.lastName);
        startingLocation = findViewById(R.id.startingLocation);
        startingHour = findViewById(R.id.startingHour);
        startingMin = findViewById(R.id.startingMin);
        endLocation = findViewById(R.id.endLocation);
        endHour = findViewById(R.id.endHour);
        endMin = findViewById(R.id.endMin);
        price = findViewById(R.id.price);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                int stHour = new Integer(String.valueOf(startingHour.getText()));
                int stMin = new Integer(String.valueOf(startingMin.getText()));
                int enHour =new Integer(String.valueOf(endHour.getText()));
                int enMin = new Integer(String.valueOf(endMin.getText()));
                float price1 = new Float(String.valueOf(price.getText()));
                int id = new Integer(String.valueOf(id_user.getText()));
                User user_obj1 = new User(id,name.getText().toString(),
                        lastName.getText().toString(), startingLocation.toString(),
                        stHour, stMin, endLocation.toString(), enHour, enMin, price1);
                Intent intent = new Intent(getApplicationContext(), twoActivity.class);
                intent.putExtra(User.class.getSimpleName(), user_obj1);
                startActivity(intent);
                break;
            case R.id.button2:
                id_user.getText().clear();
                break;
        }
    }
}