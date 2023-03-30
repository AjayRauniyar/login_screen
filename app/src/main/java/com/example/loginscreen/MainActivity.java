package com.example.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   public void OnClickButton(View view){
       EditText nameEditText=findViewById(R.id.nameEditText);
       Log.i("button","On click of button");
       String UName=nameEditText.getText().toString();
       EditText passwordEdit=findViewById(R.id.passwordEdit);
       String Password= passwordEdit.getText().toString();
       Log.i("button","User name :"+UName+" \nPassword"+Password);
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}