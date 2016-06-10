package tutorial.vernonmath.com.leva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    String login;
    String password;
    public EditText usernameField;
    public EditText passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        usernameField = (EditText) findViewById(R.id.usernameField);
        passwordField = (EditText) findViewById(R.id.passwordField);

        usernameField.setOnClickListener(this);
        passwordField.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (usernameField.isPressed()) {
            usernameField.setText("");

        }
        if (passwordField.isPressed()) {
            passwordField.setText("");
        }
    }

    public void moveToMainScreen(View view) {
        Intent goToMapScreen = new Intent(this, MapScreen.class);


        TextView errorText = (TextView) findViewById(R.id.errorText);



        // Get values from form
        login = usernameField.getText().toString();
        password = passwordField.getText().toString();



        if (login.equals("user1") && password.equals("password")) {
            startActivity(goToMapScreen);
        } else {
                errorText.setText("Incorrect Password Try again");
        }
    }
}
