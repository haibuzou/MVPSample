package haibuzou.mvpsample.basemvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import haibuzou.mvpsample.basemvp.BasePresenter;

public abstract class BaseMvpActivity<V,T extends BasePresenter<V>> extends AppCompatActivity {

    T presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = initPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attach((V)this);
    }

    @Override
    protected void onDestroy() {
        presenter.dettach();
        super.onDestroy();
    }

    public abstract T initPresenter();

}
