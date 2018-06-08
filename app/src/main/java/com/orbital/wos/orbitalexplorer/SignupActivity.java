package com.orbital.wos.orbitalexplorer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    private TextView mGoSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mGoSignin = findViewById(R.id.textViewGoSignup);
        mGoSignin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goSignin(v);
            }
        });
    }

    /**
     * Method that takes the user to the Signin page if they already
     * have an account.
     * @param view The view it is coming from.
     */
    public void goSignin(View view){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }


}
