package com.yzx.mvplibrary.p;

import com.yzx.mvplibrary.m.Model;
import com.yzx.mvplibrary.v.View;

/**
 * @author bear
 * @time 2019/7/12 12:56
 * @project LoginMvpDemo
 * @class name：com.yzx.mvplibrary.p
 */
public interface Presenter<M extends Model, V extends View> {

    /**
     * 注册Model层
     * @param model
     */
    void registerModel(M model);

    /**
     * 注册View层
     * @param view
     */
    void registerView(V view);

    /**
     * 获取View
     * @return
     */
    V getView();

    /**
     * 销毁动作（如Activity、Fragment的卸载）
     */
    void destroy();
}
