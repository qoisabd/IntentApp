package id.zein.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IntentExplicitActivity extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_explicit_activity);

        TextView textDataReceiver = findViewById(R.id.texView_data);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);

        String text = "Name : " + name + "\nYour age : " + age;
        textDataReceiver.setText(text);
    }
}
