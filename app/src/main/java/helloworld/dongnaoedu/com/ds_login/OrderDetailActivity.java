package helloworld.dongnaoedu.com.ds_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderDetailActivity extends AppCompatActivity {
Button return_order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_detail);
        return_order=(Button)findViewById(R.id.return_order);

        return_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OrderDetailActivity.this,FirstPageActivity.class);
                startActivity(intent);

            }
        });



    }
}
