package techmarket.uno.lessonfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etMessageText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMessageText = findViewById(R.id.etMessageText);

    }

    public void onClickSendMessage(View view) {
        String message = etMessageText.getText().toString();
//        Intent intent = new Intent(this,ReceivedMessageActivity.class);
//        intent.putExtra("msg",message);
//        startActivity(intent);
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,message);
        Intent chosenIntent = Intent.createChooser(intent,getString(R.string.choose_messenger));
        startActivity(chosenIntent);

    }
}