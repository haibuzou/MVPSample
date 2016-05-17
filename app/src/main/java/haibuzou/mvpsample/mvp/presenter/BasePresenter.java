package haibuzou.mvpsample.mvp.presenter;


public abstract class BasePresenter<T> {
    T mView;

    public void attach(T mView){
        this.mView = mView;
    }

    public void dettach(){
        mView = null;
    }
}
