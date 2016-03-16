package haibuzou.mvpsample.biz;

/**
 * Created by Dante on 2016/3/16.
 */
public class RequestBiziml implements RequestBiz{

    @Override
    public void requestForDate(final OnRequestListener listener) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    if(null != listener){
                        listener.onSuccess();
                    }
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
