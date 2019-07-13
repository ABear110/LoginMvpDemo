package com.yzx.loginmvpdemo.view.main;

import android.widget.Toast;

import com.yzx.mvplibrary.base.BasePresenter;

/**
 * @author bear
 * @time 2019/7/12 21:03
 * @project LoginMvpDemo
 * @class name：com.yzx.loginmvpdemo.view.main
 */
public class MainPresenter extends BasePresenter<MainModel, MainView> {

    public void getData(){

        // 这里要注意判空（view和model可能为空）
        if(model != null){

            String dataFromString = model.getDataFromString();
            if(getView() != null){
                getView().setData(dataFromString);
            }
        } else {

            if(getView() != null){
                getView().showToast("model为空");
            } else {
//                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onViewDestroy() {

    }
}
