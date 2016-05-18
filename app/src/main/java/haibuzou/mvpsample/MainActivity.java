package haibuzou.mvpsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import haibuzou.mvpsample.mvc.MVCActivity;
import haibuzou.mvpsample.mvp.MVPActivity;
import haibuzou.mvpsample.newmvp.NewMvpActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toMvc(View view){
        startActivity(new Intent(MainActivity.this, MVCActivity.class));
    }

    public void toMvp(View view){
        startActivity(new Intent(MainActivity.this, MVPActivity.class));
    }

    public void toNewMvp(View view){
        startActivity(new Intent(MainActivity.this, NewMvpActivity.class));
    }
}
