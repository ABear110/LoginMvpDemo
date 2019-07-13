package com.yzx.loginmvpdemo.view.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.yzx.loginmvpdemo.R;
import com.yzx.mvplibrary.base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainModel, MainView, MainPresenter> implements MainView{

    private Button btn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();

    }

    /**
     * 初始化控件
     */
    private void initView() {

        btn = findViewById(R.id.clickcup);
        textView = findViewById(R.id.textclick);
    }

    /**
     * 处理数据
     */
    private void initData() {

//        if(presenter != null)
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(presenter != null)
                    presenter.getData();
            }
        });

    }

    /**
     * 实现BaseMvp接口中创建Model
     * @return
     */
    @Override
    public MainModel createModel() {
        return new MainModelImpl();
    }

    /**
     * 实现BaseMvp接口中创建View
     * @return
     */
    @Override
    public MainView createView() {
        return this;
    }

    /**
     * 实现BaseMvp接口中创建Presenter
     * @return
     */
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    /**
     * MainView接口中显示UI界面操作(如果有上传等操作可添加一个操作数据的方法)
     * @param str
     */
    @Override
    public void setData(String str) {

        textView.setText(str);
    }

    /**
     * View接口中实现的显示Toast方法
     * @param info
     */
    @Override
    public void showToast(String info) {

        Toast.makeText(this, info, Toast.LENGTH_SHORT).show();
    }

    /**
     * View接口中实现显示Progres方法
     */
    @Override
    public void showProgres() {

    }

}
