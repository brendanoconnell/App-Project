package tutorial.vernonmath.com.leva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MapScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);
    }

    public void goToOrderScreen(View view){
        Intent goToOrderScreen = new Intent(this,OrderScreen.class );

        startActivity(goToOrderScreen);
    }


    public void logout(View view){
        Intent logout = new Intent(this, LoginScreen.class);
        startActivity(logout);
    }

}
