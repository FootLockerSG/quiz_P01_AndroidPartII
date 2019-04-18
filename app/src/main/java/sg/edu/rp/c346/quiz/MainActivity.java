package sg.edu.rp.c346.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button btn;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        rg = findViewById(R.id.rgchoices);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        switch(checkedId){
                            case R.id.radioButton:
                                // do operations specific to this selection
                                String chosen = "Lawn - Thai Food";
                                break;
                            case R.id.radioButton2:
                                // do operations specific to this selection
                                break;
                            case R.id.radioButton3:
                                // do operations specific to this selection
                                break;
                        }
                    }
                });

                Intent i = new Intent(getApplicationContext(), ChosenActivity.class);
                i.putExtra("id", selectedId);

                startActivity(i);


            }
        });
    }
}
