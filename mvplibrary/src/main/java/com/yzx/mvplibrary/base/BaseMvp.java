package com.yzx.mvplibrary.base;

import com.yzx.mvplibrary.m.Model;
import com.yzx.mvplibrary.p.Presenter;
import com.yzx.mvplibrary.v.View;

/**
 * @author bear
 * @time 2019/7/12 13:41
 * @project LoginMvpDemo
 * @class name：com.yzx.mvplibrary.base
 */
public interface BaseMvp<M extends Model, V extends View, P extends Presenter> {

    /**
     * 创建Model
     * @return
     */
    M createModel();

    /**
     * 创建View
     * @return
     */
    V createView();

    /**
     * 创建Presenter
     * @return
     */
    P createPresenter();
}
