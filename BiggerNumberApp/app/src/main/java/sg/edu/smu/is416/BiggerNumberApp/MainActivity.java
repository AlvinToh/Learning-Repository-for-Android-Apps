package sg.edu.smu.is416.BiggerNumberApp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int rand1, rand2;
    private int points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chooseRandomNumbers();
    }

    public void chooseRandomNumbers(){
        Random random = new Random();
        rand1 = random.nextInt( 10);
        rand2 = random.nextInt( 10);

        Button lbutton = (Button) findViewById(R.id.left_button);
        Button rbutton = (Button) findViewById(R.id.right_button);

        lbutton.setText(Integer.toString(rand1));
        rbutton.setText(Integer.toString(rand2));
    }

    public void leftButtonClick(View view) {
        if(rand1 > rand2){
            points++;
            Toast.makeText(this, "Yay! You ‘ re good!",Toast.LENGTH_SHORT).show();
        } else if (rand1 == rand2){
            Toast.makeText(this, "Both numbers are the same!, Repeat!",Toast.LENGTH_SHORT).show();
            chooseRandomNumbers();
        } else {
            points--;
            Toast.makeText(this, "Oh Ooh!",Toast.LENGTH_SHORT).show();
        }
        TextView tv = (TextView) findViewById(R.id.points);
        tv.setText("Points: " + points);
        chooseRandomNumbers();
    }

    public void rightButtonClick(View view) {
        if(rand2 > rand1){
            points++;
            Toast.makeText(this, "Yay! You ‘ re good!",Toast.LENGTH_SHORT).show();
        } else if (rand2 == rand1){
            Toast.makeText(this, "Both numbers are the same!, Repeat!",Toast.LENGTH_SHORT).show();
            chooseRandomNumbers();
        } else {
            points--;
            Toast.makeText(this, "Oh Ooh!",Toast.LENGTH_SHORT).show();
        }
        TextView tv = (TextView) findViewById(R.id.points);
        tv.setText("Points: " + points);
        chooseRandomNumbers();
    }
}
