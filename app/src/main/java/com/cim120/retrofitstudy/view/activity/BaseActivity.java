package com.cim120.retrofitstudy.view.activity;

import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;

import com.cim120.retrofitstudy.viewmodel.ViewModel;

/**
 * <pre>
 * 项目名称：cim120
 * 类名称：BaseActivity
 * 类描述：
 * 创建人：xx
 * 创建时间：2015年x月xx日 下午4:02:25
 * 修改人：liqing
 * 修改时间：2015年7月28日 下午4:02:25
 * 修改备注：    添加onDestory方法 关闭数据库
 * 修改人：liqing
 * 修改时间：2015年7月28日 下午4:02:25
 * 修改备注：添加判断是否绑定血压设备方法。
 *
 * 修改人：liqing
 * 修改时间：2015年9月17日 10:12:25
 * 修改备注:
 *              java.lang.NullPointerException
 *              BaseActivity.onDestroy(BaseActivity.java:106)
 *
 * @version </pre>
 */
public class BaseActivity<VM extends ViewModel, B extends ViewDataBinding> extends FragmentActivity {
    private VM viewModel;
    private B binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void setViewModel(@NonNull VM viewModel) {
        this.viewModel = viewModel;
    }

    public VM getViewModel() {
        if (viewModel == null) {
            throw new NullPointerException("You should setViewModel first!");
        }
        return viewModel;
    }

    public void setBinding(@NonNull B binding) {
        this.binding = binding;
    }

    public B getBinding() {
        if (binding == null) {
            throw new NullPointerException("You should setBinding first!");
        }
        return binding;
    }
}
