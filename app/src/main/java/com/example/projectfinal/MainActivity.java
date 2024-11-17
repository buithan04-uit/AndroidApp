package com.example.projectfinal;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.projectfinal.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        findViewById(R.id.buttonLogin).setOnClickListener(this);
        findViewById(R.id.buttonSignUp).setOnClickListener(this);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void userSignUp (){
        startActivity(new Intent (this , SignUpActivity.class));
    }
    private void userLogin (){
        startActivity(new Intent (this , LoginActivity.class));
    }

    @Override
    public void onClick (View view){
        switch (view.getId()){
            case R.id.:
                userSignUp();
                break;
            case R.id.:
                userLogin();
                break;
        }
    }

}