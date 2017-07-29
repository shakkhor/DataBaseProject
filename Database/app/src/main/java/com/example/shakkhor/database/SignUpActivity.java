package com.example.shakkhor.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    MakeDatabase helper = new MakeDatabase(this);

    private static EditText name;
    private static EditText email;
    private static EditText password;
    private static EditText confirmPassword;
    private static Button signUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        SignupClick();
    }

    public void SignupClick(){
        name = (EditText)findViewById(R.id.editText_username);
        email = (EditText)findViewById(R.id.editText_email);
        password = (EditText)findViewById(R.id.editText_pass);
        confirmPassword = (EditText)findViewById(R.id.editText_con_pass);
        signUp = (Button)findViewById(R.id.button_sign_up);

        signUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String namestr = name.getText().toString();
                String emailstr = email.getText().toString();
                String pass1str = password.getText().toString();
                String pass2str = confirmPassword.getText().toString();
                if(!pass1str.equals(pass2str)) {
                    Toast pass = Toast.makeText(SignUpActivity.this, "Passwords don't match!", Toast.LENGTH_SHORT);
                    pass.show();
                }else {
                    //insert details in database.
                    User c = new User();
                    c.setUname(namestr);
                    c.setEmail(emailstr);
                    c.setPass(pass1str);

                    helper.insertUserDetails(c);
                    Toast pass = Toast.makeText(SignUpActivity.this, "Your Account is created", Toast.LENGTH_SHORT);
                    pass.show();
                }
            }
        });
    }
}
