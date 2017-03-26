package ro.mobileacademy.hellomobileacademy;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnHello = (Button) findViewById(R.id.btn_hello);
        final EditText etHello = (EditText) findViewById(R.id.et_hello);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("name", etHello.getText().toString());
                startActivity(intent);
            }
        });


        Log.i("LifecycleTest","onCreate");
    }


    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifecycleTest","onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("LifecycleTest","onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifecycleTest","onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifecycleTest","onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifecycleTest","onDestroy");
    }


}
