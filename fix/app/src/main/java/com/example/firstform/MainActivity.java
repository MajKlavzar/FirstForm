package com.example.firstform;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextFullName;
    private EditText editTextCountry;
    private EditText editTextEmail;
    private EditText editTextPhone;
    private EditText editTextPassword;
    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale;
    private RadioButton radioButtonFemale;
    private CheckBox checkBoxTerms;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextUsername = findViewById(R.id.editTextText);
        editTextFullName = findViewById(R.id.editTextText2);
        editTextCountry = findViewById(R.id.editTextText3);
        editTextEmail = findViewById(R.id.editTextTextEmailAddress);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextPassword = findViewById(R.id.editTextTextPassword);
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButton);
        radioButtonFemale = findViewById(R.id.radioButton2);
        checkBoxTerms = findViewById(R.id.checkBox);
        buttonSubmit = findViewById(R.id.button);

        buttonSubmit.setOnClickListener(v -> showRegistrationDetails());
    }

    private void showRegistrationDetails() {
        String username = editTextUsername.getText().toString().trim();
        String fullName = editTextFullName.getText().toString().trim();
        String country = editTextCountry.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();

        String gender = "Not specified";
        int selectedGenderId = radioGroupGender.getCheckedRadioButtonId();
        if (selectedGenderId == R.id.radioButton) {
            gender = radioButtonMale.getText().toString();
        } else if (selectedGenderId == R.id.radioButton2) {
            gender = radioButtonFemale.getText().toString();
        }

        boolean isTermsAccepted = checkBoxTerms.isChecked();
        String termsAcceptedText = "Terms Accepted: " + (isTermsAccepted ? "Yes" : "No");

        String details = "Username: " + username + "\n" +
                "Full Name: " + fullName + "\n" +
                "Country: " + country + "\n" +
                "Email: " + email + "\n" +
                "Phone: " + phone + "\n" +
                "Gender: " + gender + "\n" +
                "Password: " + password + "\n" +
                termsAcceptedText;

        new AlertDialog.Builder(this)
                .setTitle("Registration Details")
                .setMessage(details)
                .setPositiveButton("OK", null)
                .show();
    }
}
