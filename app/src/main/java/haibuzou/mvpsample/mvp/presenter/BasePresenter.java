package haibuzou.mvpsample.mvp.presenter;

import haibuzou.mvpsample.mvp.view.BaseView;

/**
 * Created by Dante on 2016/5/15.
 */
public class BasePresenter<T extends BaseView> {
    T mView;

    public void attach(T mView){
        this.mView = mView;
    }

    public void dettach(){
        mView = null;
    }
}
