package ice_pbru.chusang.apisit.electronics;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Button aboutmeButton;
    private ListView eleclistview;


     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         //Bind Widget
         bindWidget();
         buttonController();
    }

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/profile.php?id=100009058446760"));
                startActivity(intent);
            }
        });

    }

    private void bindWidget() {
        aboutmeButton = (Button)findViewById(R.id.button);
        eleclistview = (ListView) findViewById(R.id.listView);
    }


}



