package tutorial.vernonmath.com.leva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecieptScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciept_screen);

        Intent complete = getIntent();
        String sLocationText = complete.getStringExtra("location");
        String destination = complete.getStringExtra("destination");

        TextView destinationText = (TextView) findViewById(R.id.destination);

        destinationText.setText(destination);
    }

    public void backToMapScreen(View view){
        Intent back = new Intent(this, MapScreen.class);
        startActivity(back);
    }
}
