package helloworld.dongnaoedu.com.ds_login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPageActivity extends AppCompatActivity {
    /*---------------------------------胎压监测--------------------------------------*/
    ListView lstTire1, lstTire2, lstTire3, lstTire4;
    String[] datasources_car_monrtoring = {"胎压数据1", "胎压数据2", "胎压数据3", "胎压数据4"};

    /*---------------------------------胎压监测结束-----------------------------------*/

    /*---------------------------------我的双星---------------------------------------*/

    ImageView iVmyorder, iVfeedback, iVversion;


    /*---------------------------------我的双星结束------------------------------------*/

    ListView lst1, lst2;
    Spinner sp1;
    String[] datasources = {"救援订单1", "救援订单2", "救援订单3", "救援订单4", "救援订单5", "救援订单6", "救援订单7", "救援订单8", "救援订单9", "救援订单10", "救援订单11", "救援订单12", "救援订单13", "救援订单14", "救援订单15", "救援订单16", "救援订单17", "救援订单18", "救援订单19", "救援订单20", "救援订单21", "救援订单22", "救援订单23", "救援订单24", "救援订单25", "救援订单26", "救援订单27", "救援订单28", "救援订单29", "救援订单30", "救援订单31", "救援订单32", "救援订单33", "救援订单34", "救援订单35", "救援订单36", "救援订单37", "救援订单38", "救援订单39", "救援订单40", "救援订单41", "救援订单42", "救援订单43", "救援订单44", "救援订单45", "救援订单46", "救援订单47", "救援订单48", "救援订单49", "救援订单50", "救援订单7", "救援订单1", "救援订单2", "救援订单3", "救援订单4", "救援订单5", "救援订单6", "救援订单7", "救援订单1", "救援订单2", "救援订单3", "救援订单4", "救援订单5", "救援订单6", "救援订单7"};
    String[] datasources3 = {"双星产品推广1", "双星产品推广2", "双星产品推广3", "双星产品推广4", "双星产品推广5", "双星产品推广6", "双星产品推广7", "双星产品推广8", "双星产品推广9", "双星产品推广10", "双星产品推广11", "双星产品推广12", "双星产品推广13", "双星产品推广14", "双星产品推广15", "双星产品推广16"};
    String[] datasources2 = {"", "集团简介", "团队介绍", "招聘信息"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage_tablehost);
        lst1 = (ListView) findViewById(R.id.lst1);
        lst2 = (ListView) findViewById(R.id.lst2);
        sp1 = (Spinner) findViewById(R.id.sp1);

        /*---------------------------------胎压监测-------------------------------------*/

        lstTire1 = (ListView) findViewById(R.id.lstTire_1);
        lstTire2 = (ListView) findViewById(R.id.lstTire_2);
        lstTire3 = (ListView) findViewById(R.id.lstTire_3);
        lstTire4 = (ListView) findViewById(R.id.lstTire_4);

        ArrayAdapter<String> adapter_car1 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                datasources_car_monrtoring
        );

        lstTire1.setAdapter(adapter_car1);


        ArrayAdapter<String> adapter_car2 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                datasources_car_monrtoring
        );

        lstTire2.setAdapter(adapter_car2);


        ArrayAdapter<String> adapter_car3 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                datasources_car_monrtoring
        );

        lstTire3.setAdapter(adapter_car3);

        ArrayAdapter<String> adapter_car4 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                datasources_car_monrtoring
        );

        lstTire4.setAdapter(adapter_car4);


        /*-------------------------------胎压监测结束------------------------------------*/


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                R.layout.rescue_record_item,
                R.id.tv1,
               /* android.R.layout.simple_list_item_1,
                android.R.id.text1,*/
                datasources
        );
        lst1.setAdapter(adapter);

        lst1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String BHAZ=datasources[i]+"永远做不好了";
                Toast.makeText(FirstPageActivity.this, BHAZ, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(FirstPageActivity.this,OrderDetailActivity.class);
                startActivity(intent);
            }
        });





        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(
                this,
                R.layout.firstpage_item,
                R.id.tv2,
               /* android.R.layout.simple_list_item_1,
                android.R.id.text1,*/
                datasources3
        );
        lst2.setAdapter(adapter2);

        lst2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(FirstPageActivity.this,OrderDetailActivity.class);
                startActivity(intent);
                String ss=datasources3[i]+"没有上线";
                Toast.makeText(FirstPageActivity.this, ss, Toast.LENGTH_LONG).show();
                startActivity(intent);
            }
        });


        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
               /* android.R.layout.simple_list_item_1,
                android.R.id.text1,*/
                datasources2
        );

        sp1.setAdapter(adapter3);


         /*--------------------------------我的双星------------------------------------*/
        iVmyorder = (ImageView) findViewById(R.id.iVmyorder);

        iVmyorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstPageActivity.this, MyOrderActivity.class);
                startActivity(intent);
            }
        });


         /*-------------------------------我的双星结束----------------------------------*/

         /*--------------------------------意见反馈------------------------------------*/
        iVfeedback = (ImageView) findViewById(R.id.iVfeedback);
        iVfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstPageActivity.this, FeedbackActivity.class);
                startActivity(intent);
            }
        });
        /*--------------------------------意见反馈结束------------------------------------*/

        /*--------------------------------tabhost选项卡--------------------------------*/

        TabHost tHost = (TabHost) findViewById(R.id.tabhost);
        //在tabhost上添加选项卡
        tHost.setup();

        TabHost.TabSpec tabSpec = tHost.newTabSpec("Test");
        //选项卡上的标签或文字
        tabSpec.setIndicator("", getResources().getDrawable(R.drawable.sxfb));
        //选项卡对应的内容
        tabSpec.setContent(R.id.tab1);
        tHost.addTab(tabSpec);

        tHost.addTab(tHost.newTabSpec("TEST2")
                .setIndicator("", getResources().getDrawable(R.drawable.tyjc))
                .setContent(R.id.tab2)
        );

        tHost.addTab(tHost.newTabSpec("TEST3")
                .setIndicator("", getResources().getDrawable(R.drawable.jyjl))
                .setContent(R.id.tab3)
        );

        tHost.addTab(tHost.newTabSpec("TEST4")
                .setIndicator("", getResources().getDrawable(R.drawable.wdsx))
                .setContent(R.id.tab4)
        );

        /*--------------------------------tabhost选项卡结束--------------------------------*/


    }
}
