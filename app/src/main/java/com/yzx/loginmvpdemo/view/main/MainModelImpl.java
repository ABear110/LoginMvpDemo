package com.yzx.loginmvpdemo.view.main;

/**
 * @author bear
 * @time 2019/7/12 20:58
 * @project LoginMvpDemo
 * @class name：com.yzx.loginmvpdemo.view.main
 */
public class MainModelImpl implements MainModel {

    @Override
    public String getDataFromString() {
        return "string data";
    }

    @Override
    public void stopRequest() {

        // 结束网络请求
    }
}
