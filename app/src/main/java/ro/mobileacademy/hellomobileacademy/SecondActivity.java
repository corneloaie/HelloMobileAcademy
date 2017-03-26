package ro.mobileacademy.hellomobileacademy;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String name = getIntent().getStringExtra("name");

        TextView tvHello = (TextView)  findViewById(R.id.tv_hello);
        tvHello.setText(String.format("Hello %s!", name));


    }
}
