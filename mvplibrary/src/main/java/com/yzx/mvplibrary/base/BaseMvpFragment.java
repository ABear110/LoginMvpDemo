package com.yzx.mvplibrary.base;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.yzx.mvplibrary.m.Model;
import com.yzx.mvplibrary.v.View;

/**
 * @author bear
 * @time 2019/7/12 14:46
 * @project LoginMvpDemo
 * @class name：com.yzx.mvplibrary.base
 */
abstract class BaseMvpFragment<M extends Model, V extends View, P extends BasePresenter>
        extends Fragment implements BaseMvp<M, V, P> {

    protected P presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        presenter = createPresenter();
        if(presenter != null){

            presenter.registerModel(createModel());
            presenter.registerView(createView());
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if(presenter != null){
            presenter.destroy();
            presenter = null;
        }
    }
}
