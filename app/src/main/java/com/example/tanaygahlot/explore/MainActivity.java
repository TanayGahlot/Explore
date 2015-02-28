//oggpnosn
//hkhr

package com.example.tanaygahlot.explore;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends Activity {

    public  String previous="";
    public String[] subjects;
    public double[] probabilities;
    TextView tv;
    Random generator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        generator = new Random();
        subjects = new String[7];
        subjects[0] = "DS";
        subjects[1] = "DAAA";
        subjects[2] = "Compiler";
        subjects[3] = "WT";
        subjects[4] = "EE";
        subjects[5] = "AI";
        subjects[6] = "DCS";
        probabilities = new double[7];
        probabilities[0] = .218;
        probabilities[1] = .444;
        probabilities[2] = .564;
        probabilities[3] = .684;
        probabilities[4] = .737;
        probabilities[5] = .872;
        probabilities[6] = 1;

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void selectSubject(View view){
        String subject = chooseSubject();
        while(subject == previous)
            subject = chooseSubject();
        previous = subject;
        tv.setText(subject);
        System.out.println(subject);
    }
    public String chooseSubject(){
        float no = generator.nextFloat();
        if(no < probabilities[0])
            return subjects[0];
        else if(no < probabilities[1])
            return subjects[1];
        else if(no < probabilities[2])
            return subjects[2];
        else if(no < probabilities[3])
            return subjects[3];
        else if(no < probabilities[4])
            return subjects[4];
        else if(no < probabilities[5])
            return subjects[5];
        else if(no < probabilities[6])
            return subjects[6];
        return "";
    }
}
