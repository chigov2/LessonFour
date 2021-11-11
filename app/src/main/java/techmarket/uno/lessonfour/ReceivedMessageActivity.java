package techmarket.uno.lessonfour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceivedMessageActivity extends AppCompatActivity {

    TextView receivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_received_message);
        receivedMessage = findViewById(R.id.tvReceivedMassage);
        Intent intent = getIntent();//получаем инфо из активити, который вызвал данное активити
        //получаем данные, прикрепленные к интенту
        String receivedMsg = intent.getStringExtra("msg");
        receivedMessage.setText(receivedMsg);
    }
}