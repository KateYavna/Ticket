package com.example.ticket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String str4 = "It's free for you. You can come in";
        String str5 = "It's free for you. Let me check your ID";
        String str6 = "Your ID is OK. You can come in";
        String str7 = "It costs 8 UAH. You can pay by 1, 2, 5, 10, 20, 50 bills";
        String str8 = "Your change is 2 UAH. You can come in";
        String str9 = "Your change is 12 UAH. You can come in";
        String str10 = "Your change is 42 UAH. You can come in";
        String str11 = "Thank you for paying without change. You can come in";
        /*input age = "adult", or "child" or "beneficiary" */

        String age = "adult";

        if (age == "child") {
            Log.d("MyLog", str4);
            TextView textView = findViewById((R.id.tvText));
            textView.setText("It's free for you. You can come in");
            textView.setBackgroundColor(Color.GREEN);
        }
        if (age == "adult") {
            Log.d("MyLog", str7);
            int UAH;
            int UAH1;
            int UAH2;
            /*input UAH, UAH1, UAH2 =0, 1, 2, 5, 10, 20, 50 */


            UAH = 10;
            UAH1 = 0;
            UAH2 = 0;



           if (UAH + UAH1 + UAH2 == 8) {
                Log.d("MyLog", str11);
                TextView textView = findViewById((R.id.tvText));
                textView.setText(str11);
                textView.setBackgroundColor(Color.GREEN);
            }
            if (UAH + UAH1 + UAH2 == 10) {
                Log.d("MyLog", str8);
                TextView textView = findViewById((R.id.tvText));
                textView.setText(str8);
                textView.setBackgroundColor(Color.GREEN);
            }
            if (UAH + UAH1 + UAH2 == 20) {
                Log.d("MyLog", str9);
                TextView textView = findViewById((R.id.tvText));
                textView.setText(str9);
                textView.setBackgroundColor(Color.GREEN);
            }
            if (UAH + UAH1 + UAH2 == 50) {
                Log.d("MyLog", str10);
                TextView textView = findViewById((R.id.tvText));
                textView.setText(str10);
                textView.setBackgroundColor(Color.GREEN);
            }
        }
        if (age == "beneficiary") {
            Log.d("MyLog", str5);
            String ID;
            /*input ID = "OK" or "BAD"*/

            ID = "BAD";

            if ((ID == "OK") && (age == "beneficiary")) { Log.d("MyLog", str6);
                TextView textView = findViewById((R.id.tvText));
                textView.setText(str6);
                textView.setBackgroundColor(Color.GREEN);}
            if ((ID == "BAD") && (age == "beneficiary")) {Log.d("MyLog", "Try again or pay");
                TextView textView = findViewById((R.id.tvText));
                textView.setText("Try again or pay");
                textView.setBackgroundColor(Color.RED);}
        }


    }
}
