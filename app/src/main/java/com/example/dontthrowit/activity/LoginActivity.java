package com.example.dontthrowit.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dontthrowit.R;
import com.example.dontthrowit.db.UsersDb;
import com.example.dontthrowit.helper.SharedPreferenceManager;
import com.example.dontthrowit.helper.Validation;
import com.example.dontthrowit.model.Users;

import java.util.List;

import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity {


    EditText edtUserEmail;
    EditText edtPassword;
    private Validation validation;
    private SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(LoginActivity.this);
        validation = new Validation(LoginActivity.this);
              edtUserEmail=   findViewById(R.id.edt_UserEmail);
        edtPassword=   findViewById(R.id.edt_Password);

        sharedPreferenceManager = new SharedPreferenceManager(LoginActivity.this);
    }

    public void gotToHome(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();

    }

    public void login(View view) {
        validation();
    }

    public void signUp(View view) {
        startActivity(new Intent(LoginActivity.this, SignUpActivity.class));

    }



    public void validation() {


        if ((validation.setEmailValidation2(edtUserEmail)) && (validation.setPasswordValidation(edtPassword))) {
            String password = edtPassword.getText().toString();
            String edtuserName = edtUserEmail.getText().toString();

            List<Users> userName = UsersDb.getUserName();
            if (UsersDb.getUserName() != null && UsersDb.getUserName().size() > 0) {
                for (int i=0;i<userName.size();i++){
                    String email = userName.get(i).getEmail();
                    String password1 = userName.get(i).getPassword();
                    if (email.equals(edtuserName) || password1.equals(password)) {
                        sharedPreferenceManager.saveUserIsSigned(true);

                        startActivity(new Intent(LoginActivity.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
                        finish();
                        break;
                    }  else {
                        Toast.makeText(this, getString(R.string.loginError), Toast.LENGTH_LONG).show();
                    }
                }

            }

        }


    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
