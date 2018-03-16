package helloworld.dongnaoedu.com.ds_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int SPLASH_DISPLAY_LENGHT = 3000; // 3秒后进入系统
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        new android.os.Handler().postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this,
                        MainActivity.class);
                SplashActivity.this.startActivity(mainIntent);
                SplashActivity.this.finish();
            }

        }, SPLASH_DISPLAY_LENGHT);


    }
}
