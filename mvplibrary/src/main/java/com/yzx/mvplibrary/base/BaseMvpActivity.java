package com.yzx.mvplibrary.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yzx.mvplibrary.m.Model;
import com.yzx.mvplibrary.v.View;

/**
 * @author bear
 * @time 2019/7/12 13:49
 * @project LoginMvpDemo
 * @class name：com.yzx.mvplibrary.base
 */
public abstract class BaseMvpActivity<M extends Model, V extends View, P extends BasePresenter>
        extends AppCompatActivity implements BaseMvp<M, V, P> {

    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 创建Presenter
        presenter = createPresenter();
        if(presenter != null){

            // 在Presenter注册Model
            presenter.registerModel(createModel());
            // 在Presenter注册View
            presenter.registerView(createView());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(presenter != null) {
            // Activity销毁时的调用，让具体实现BasePresenter中onViewDestroy()方法做出决定
            presenter.destroy();
            presenter = null;
        }
    }
}
