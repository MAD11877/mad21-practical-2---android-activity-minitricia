package sg.edu.np.mad_practical2_s10203209;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "Create");

        Button button = findViewById(R.id.follow_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button.getText()=="Follow"){
                    button.setText("Unfollow");
                }
                else{
                    button.setText("Follow");
                }
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "Start");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(TAG, "Resume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "Stop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "Destroy");
    }
}