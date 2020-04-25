package com.example.texttospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    EditText editText;
    Button speak;
    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.station_id);
        speak=findViewById(R.id.speak_id);
        tts=new TextToSpeech(MainActivity.this,this);
        speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stationname=editText.getText().toString();
                String text="Next Station Is "+stationname;
                tts.speak(text,TextToSpeech.QUEUE_FLUSH,null);

            }
        });
    }

    public void  onInit(int status){

    }
}
