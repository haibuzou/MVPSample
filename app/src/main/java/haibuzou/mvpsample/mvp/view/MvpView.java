package haibuzou.mvpsample.mvp.view;


import java.util.List;

public interface MvpView {
     void showLoading();
     void hideLoading();
     void setListItem(List<String> data);
     void showMessage(String message);
}
