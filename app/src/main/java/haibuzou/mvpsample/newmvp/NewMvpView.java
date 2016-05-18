package haibuzou.mvpsample.newmvp;

import java.util.List;

import haibuzou.mvpsample.basemvp.BaseView;


public interface NewMvpView extends BaseView {
    void setListItem(List<String> data);
    void showMessage(String message);
}
