package tutorial.vernonmath.com.leva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RecieptScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciept_screen);

        Intent complete = getIntent();

        String location = complete.getStringExtra("location");
        String destination = complete.getStringExtra("destination");
        String total = complete.getStringExtra("total");
        String yChildren = complete.getStringExtra("yChildren");
        String time = complete.getStringExtra("time");
        String date = complete.getStringExtra("date");

        TextView locationText = (TextView) findViewById(R.id.locationText);
        TextView destinationText = (TextView) findViewById(R.id.destinationText);
        TextView totalText = (TextView) findViewById(R.id.totalText);
        TextView yChildrenText = (TextView) findViewById(R.id.yChildrenText);
        TextView timeText = (TextView) findViewById(R.id.timeText);

     
        locationText.setText("Pickup Location: " + location);
        destinationText.setText("Destination: " + destination);
        totalText.setText("Number of Passengers: " + total);
        yChildrenText.setText("Number of Booster Seats Required: " + yChildren);
        timeText.setText("Pickup Time: " + time + " on " + date);
    }

    public void backToMapScreen(View view){
        Intent back = new Intent(this, MapScreen.class);
        startActivity(back);
    }
}
