package helloworld.dongnaoedu.com.ds_login;

import android.content.Intent;
import android.support.annotation.BinderThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    EditText etPhone, etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ds_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etPhone = (EditText) findViewById(R.id.etPhone);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((etPhone.getText().toString().equals("188010") == true && etPassword.getText().toString().equals("123456") == true)||
                        (etPhone.getText().toString().equals("519519") == true && etPassword.getText().toString().equals("123456") == true)){
                    Intent intent = new Intent(MainActivity.this, FirstPageActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
