package tutorial.vernonmath.com.leva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginScreen extends AppCompatActivity {

    String login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);


    }



    public void moveToMainScreen(View view){
        Intent goToMapScreen = new Intent(this, MapScreen.class);

        EditText usernameField = (EditText) findViewById(R.id.usernameField);
        EditText passwordField = (EditText) findViewById(R.id.passwordField);
        TextView errorText = (TextView) findViewById(R.id.errorText);

        // Declare Debug Fields
        TextView loginDebug = (TextView) findViewById(R.id.loginDebug);
        TextView passwordDebug = (TextView) findViewById(R.id.passwordDebug);

        // Get values from form
        login = usernameField.getText().toString();
        String password = passwordField.getText().toString();

        // Make sure they are what we expect.
        loginDebug.setText(login);
        passwordDebug.setText(password);



        if(login == "user1" && password == "password"){
            startActivity(goToMapScreen);
        }else {
            errorText.setText("Incorrect Password Try again");
        }



    }

}
