package com.yzx.loginmvpdemo.view.main;


import com.yzx.mvplibrary.m.Model;

/**
 * @author bear
 * @time 2019/7/12 15:03
 * @project LoginMvpDemo
 * @class name：com.yzx.loginmvpdemo.view.main
 */
public interface MainModel extends Model {

    /**
     * 处理网络和其它操作
     */
    String getDataFromString();

    /**
     * 停止请求
     */
    void stopRequest();

}
