package haibuzou.mvpsample.biz;

import java.util.List;

/**
 * Created by Dante on 2016/3/16.
 */
public interface OnRequestListener {

    void onSuccess(List<String> data);
    void onFailed();
}
