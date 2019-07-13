package com.yzx.mvplibrary.base;

import com.yzx.mvplibrary.m.Model;
import com.yzx.mvplibrary.p.Presenter;
import com.yzx.mvplibrary.v.View;

import java.lang.ref.WeakReference;

/**
 * @author bear
 * @time 2019/7/12 13:43
 * @project LoginMvpDemo
 * @class name：com.yzx.mvplibrary.base
 */
public abstract class BasePresenter<M extends Model, V extends View> implements Presenter<M, V> {

    /**
     * 使用弱引用来防止内存泄露
     */
    private WeakReference<V> wrf;
    protected M model;

    /**
     * 注册Model
     * @param model
     */
    @Override
    public void registerModel(M model) {

        this.model = model;
    }

    /**
     * 注册View
     * @param view
     */
    @Override
    public void registerView(V view) {

        wrf = new WeakReference<V>(view);
    }

    /**
     * 获取View
     * @return
     */
    @Override
    public V getView() {

        return wrf == null ? null : wrf.get();
    }

    /**
     * 在Activity或Fragment卸载时调用View结束的方法
     */
    @Override
    public void destroy() {

        if(wrf != null){
            wrf.clear();
            wrf = null;
        }
    }

    /**
     * 调用销毁
     */
    protected abstract void onViewDestroy();
}
