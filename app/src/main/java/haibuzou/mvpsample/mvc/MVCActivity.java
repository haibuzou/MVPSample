package haibuzou.mvpsample.mvc;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import haibuzou.mvpsample.R;
import haibuzou.mvpsample.biz.OnRequestListener;
import haibuzou.mvpsample.biz.RequestBiz;
import haibuzou.mvpsample.biz.RequestBiziml;

public class MVCActivity extends AppCompatActivity{

    private ListView mvcListView;
    private RequestBiz requestBiz;
    private ProgressBar pb;
    private Handler handler;
    private TextView titleTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvc);
        mvcListView = (ListView)findViewById(R.id.mvc_listview);
        titleTxt = (TextView)findViewById(R.id.mvc_title);
        pb = (ProgressBar) findViewById(R.id.mvc_loading);
        pb.setVisibility(View.VISIBLE);
        handler = new Handler(Looper.getMainLooper());
        requestBiz = new RequestBiziml();
        requestForData();
    }

    public void requestForData(){
        requestBiz.requestForDate(new OnRequestListener() {
            @Override
            public void onSuccess(final List<String> data) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        pb.setVisibility(View.GONE);
                        ArrayAdapter adapter = new ArrayAdapter(MVCActivity.this,android.R.layout.simple_list_item_1,data);
                        mvcListView.setAdapter(adapter);
                        mvcListView.setOnItemClickListener(itemClickListener);
                    }
                });

            }

            @Override
            public void onFailed() {
                pb.setVisibility(View.GONE);
                Toast.makeText(MVCActivity.this,"加载失败",Toast.LENGTH_SHORT).show();
            }
        });
    }

    AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MVCActivity.this,"点击了item"+(position+1),Toast.LENGTH_SHORT).show();
        }
    };
}
