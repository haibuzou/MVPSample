package haibuzou.mvpsample.mvp.presenter;


import android.os.Handler;
import android.os.Looper;

import java.util.List;

import haibuzou.mvpsample.biz.OnRequestListener;
import haibuzou.mvpsample.biz.RequestBiz;
import haibuzou.mvpsample.biz.RequestBiziml;
import haibuzou.mvpsample.mvp.view.NewMvpView;

public class NewMvpPresenter extends BasePresenter<NewMvpView> {

    private RequestBiz requestBiz;
    private Handler mHandler;

    public NewMvpPresenter() {
        requestBiz = new RequestBiziml();
        mHandler = new Handler(Looper.getMainLooper());
    }

    public void onResume(){
        requestBiz.requestForData(new OnRequestListener() {

            @Override
            public void onSuccess(final List<String> data) {
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        mView.hideLoading();
                        mView.setListItem(data);
                    }
                });
            }

            @Override
            public void onFailed() {
                mView.showMessage("请求失败");
            }
        });
    }

    public void onItemClick(int position){
        mView.showMessage("点击了item"+position);
    }
}
