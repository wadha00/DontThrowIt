package com.example.dontthrowit.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dontthrowit.R;
import com.example.dontthrowit.db.UsersDb;
import com.example.dontthrowit.helper.SharedPreferenceManager;
import com.example.dontthrowit.helper.Validation;
import com.example.dontthrowit.model.Users;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity {

    @BindView(R.id.edt_userName)
    EditText edtUserName;
    @BindView(R.id.edt_email)
    EditText edtEmail;
    @BindView(R.id.edt_phoneNumber)
    EditText edtPhoneNumber;
    @BindView(R.id.sp_gender)
    Spinner spGender;
    @BindView(R.id.edt_password)
    EditText edtPassword;
    @BindView(R.id.img_Signin)
    Button imgSignin;
    private Validation validation;
    private SharedPreferenceManager sharedPreferenceManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //        StatusBarUtil.setTransparent(SignUpActivity.this);
        ButterKnife.bind(this);

        init();
        // Spinner Drop down elements
        setGenderSpinner();


    }

    private void init() {
        sharedPreferenceManager = new SharedPreferenceManager(SignUpActivity.this);
        validation = new Validation(SignUpActivity.this);

    }


    private void setGenderSpinner() {

        String[] genderList = getResources().getStringArray(R.array.gender);
        // Creating adapter for spinner
        ArrayAdapter<String> genderAdapter = new ArrayAdapter<String>(SignUpActivity.this, R.layout.item_spinner, genderList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View v = super.getView(position, convertView, parent);
                if (position == getCount()) {
                    ((TextView) v.findViewById(android.R.id.text1)).setText(getText(R.string.gender));
                    ((TextView) v.findViewById(android.R.id.text1)).setHint(getItem(getCount())); //"Hint to be displayed"
                }

                return v;
            }

            @Override
            public int getCount() {
                return super.getCount() - 1; // you dont display last item. It is used as hint.
            }

        };

        // Drop down layout style - list view with radio button
        genderAdapter.setDropDownViewResource(R.layout.drpdn_qual);


        // attaching data adapter to spinner
        spGender.setAdapter(genderAdapter);
        spGender.setSelection(genderAdapter.getCount()); //set the hint the default selection so it appears on launch.


        spGender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // On selecting a spinner item
                String gender = parent.getItemAtPosition(position).toString();
                if (position > 0) {
                    // Showing selected spinner item
//                    Toast.makeText(parent.getContext(), "Selected: " + Speciality, Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }


    public void gotToHome(View view) {

        validation();
    }


    public void validation() {


        if ((validation.setUserNameValidation(edtUserName)) && (validation.setEmailValidation2(edtEmail)) && (validation.setPasswordValidation(edtPassword))) {
            String email = edtEmail.getText().toString();
            String password = edtPassword.getText().toString();
            String edtuserName = edtUserName.getText().toString();
            List<Users> userName = UsersDb.getUserName();

            UsersDb.saveUserName(new Users(edtuserName, password, email, ""));
            sharedPreferenceManager.saveUserIsSigned(true);
            startActivity(new Intent(SignUpActivity.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
            finish();
        }


    }

  /*  public void gotToHome(View view) {
        startActivity(new Intent(SignUpActivity.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP));
        finish();

    }*/

    public void onBackPress(View view) {
        onBackPressed();
    }
}
