package haibuzou.mvpsample.mvp.presenter;


import haibuzou.mvpsample.mvp.view.MvpView;

public class MvpPresenter {

    private MvpView mvpView;

    public MvpPresenter(MvpView mvpView) {
        this.mvpView = mvpView;
    }

    public void onResume(){
        mvpView.showLoading();
    }


}
