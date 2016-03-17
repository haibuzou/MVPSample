package haibuzou.mvpsample.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import haibuzou.mvpsample.R;
import haibuzou.mvpsample.mvp.view.MvpView;

public class MVPActivity extends AppCompatActivity implements MvpView{

    ListView mvpListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);
        mvpListView = (ListView)findViewById(R.id.mvp_listview);
    }

    @Override
    public void loadData() {

    }
}
