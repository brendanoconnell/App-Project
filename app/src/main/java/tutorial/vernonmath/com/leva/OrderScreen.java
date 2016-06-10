package tutorial.vernonmath.com.leva;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class OrderScreen extends AppCompatActivity implements View.OnClickListener {

    EditText locationText;
    EditText destinationText;
    EditText totalText;
    EditText yChildrenText;
    EditText timeText;
    EditText dateText;
    TextView nullErrorText;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);

        locationText = (EditText) findViewById(R.id.locationText);
        destinationText = (EditText) findViewById(R.id.destinationText);
        totalText = (EditText) findViewById(R.id.totalText);
        yChildrenText = (EditText) findViewById(R.id.yChildrenText);
        timeText = (EditText) findViewById(R.id.timeText);
        dateText = (EditText) findViewById(R.id.dateText);

        locationText.setOnClickListener(this);
        destinationText.setOnClickListener(this);
        totalText.setOnClickListener(this);
        yChildrenText.setOnClickListener(this);
        timeText.setOnClickListener(this);
        dateText.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(locationText.isPressed()){
            locationText.setText("");
        }

        if(destinationText.isPressed()){
            destinationText.setText("");
        }

        if(totalText.isPressed()){
            totalText.setText("");
        }

        if(yChildrenText.isPressed()){
            yChildrenText.setText("");
        }

        if(timeText.isPressed()){
            timeText.setText("");
        }

        if(dateText.isPressed()){
            dateText.setText("");
        }
    }

    public void Complete(View view){
        Intent complete = new Intent(this, RecieptScreen.class);


        String location = locationText.getText().toString();
        String destination = destinationText.getText().toString();
        String total = totalText.getText().toString();
        String yChildren= yChildrenText.getText().toString();
        String time= timeText.getText().toString();
        String date = dateText.getText().toString();

        complete.putExtra("location", location);
        complete.putExtra("destination", destination);
        complete.putExtra("total", total);
        complete.putExtra("yChildren", yChildren);
        complete.putExtra("time", time);
        complete.putExtra("date", date);

        startActivity(complete);

    }



    public void back(View view){
        Intent back = new Intent(this, MapScreen.class);
        startActivity(back);
    }



}
