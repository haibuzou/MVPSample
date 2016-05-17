package haibuzou.mvpsample.mvp.view;

import java.util.List;


public interface NewMvpView extends BaseView{
    void setListItem(List<String> data);
    void showMessage(String message);
}
