package haibuzou.mvpsample.mvp.presenter;


import android.os.Handler;
import android.os.Looper;

import java.util.List;

import haibuzou.mvpsample.biz.OnRequestListener;
import haibuzou.mvpsample.biz.RequestBiz;
import haibuzou.mvpsample.biz.RequestBiziml;
import haibuzou.mvpsample.mvp.view.MvpView;

public class MvpPresenter {

    private MvpView mvpView;
    RequestBiz requestBiz;
    private Handler mHandler;

    public MvpPresenter(MvpView mvpView) {
        this.mvpView = mvpView;
        requestBiz = new RequestBiziml();
        mHandler = new Handler(Looper.getMainLooper());
    }

    public void onResume(){
        mvpView.showLoading();
        requestBiz.requestForData(new OnRequestListener() {
            @Override
            public void onSuccess(final List<String> data) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mvpView.hideLoading();
                        mvpView.setListItem(data);
                    }
                });

            }

            @Override
            public void onFailed() {
                mvpView.showMessage("请求失败");
            }
        });
    }

    public void onItemClick(int position){
        mvpView.showMessage("点击了item"+position);
    }

}
