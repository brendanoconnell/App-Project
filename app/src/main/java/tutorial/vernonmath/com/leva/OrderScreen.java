package tutorial.vernonmath.com.leva;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OrderScreen extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_screen);

    }

    public void Complete(View view){
        Intent complete = new Intent(this, RecieptScreen.class);

        EditText locationText = (EditText) findViewById(R.id.locationText);
        EditText destinationText = (EditText) findViewById(R.id.locationText);
        EditText adultNumberText = (EditText) findViewById(R.id.locationText);
        EditText yChildrenText = (EditText) findViewById(R.id.locationText);
        EditText oChildrenText = (EditText) findViewById(R.id.locationText);
        EditText timeText = (EditText) findViewById(R.id.locationText);
        EditText dateText = (EditText) findViewById(R.id.locationText);

        String location = locationText.getText().toString();
        String destination = destinationText.getText().toString();
        String sAdultNumberText= adultNumberText.getText().toString();
        String sYChildrenText= yChildrenText.getText().toString();
        String sOChildrenText= oChildrenText.getText().toString();
        String sTimeText= timeText.getText().toString();
        String sDateText= dateText.getText().toString();

        complete.putExtra("location", location);
        complete.putExtra("destination", destination);
        complete.putExtra("adultNumberText", sAdultNumberText);
        complete.putExtra("yChildrenText", sYChildrenText);
        complete.putExtra("oChildrenText", sOChildrenText);
        complete.putExtra("timeText", sTimeText);
        complete.putExtra("dateText", sDateText);

        startActivity(complete);
    }

    public void back(View view){
        Intent back = new Intent(this, MapScreen.class);
        startActivity(back);
    }


}
