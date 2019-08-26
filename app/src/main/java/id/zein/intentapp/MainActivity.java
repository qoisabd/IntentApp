package id.zein.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonActivity = findViewById(R.id.intent_activity);
        buttonActivity.setOnClickListener(this);

        Button buttonMoveData = findViewById(R.id.intent_explicit);
        buttonMoveData.setOnClickListener(this);

        Button buttonDial = findViewById(R.id.intent_implict);
        buttonDial.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.intent_activity:
                android.content.Intent intent1 = new android.content.Intent(MainActivity.this, IntentActivity.class);
                startActivity(intent1);
                break;

            case R.id.intent_explicit:
                android.content.Intent intent2 = new android.content.Intent(MainActivity.this, IntentExplicitActivity.class);
                intent2.putExtra(IntentExplicitActivity.EXTRA_NAME, "qoisabdq");
                intent2.putExtra(IntentExplicitActivity.EXTRA_AGE, 30);
                startActivity(intent2);
                break;

            case R.id.intent_implict:
                String dialPhone = "0895332410677";
                android.content.Intent intent3 = new android.content.Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:"+dialPhone));
                startActivity(intent3);
                break;
        }
    }
}
