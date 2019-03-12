package study.hank.com.myapplication.fragments;


import android.view.View;
import android.widget.TextView;

import study.hank.com.myapplication.R;
import study.hank.com.myapplication.fragments.base.BaseFragment;


/**
 */
public class MyFragmentC extends BaseFragment {

    private TextView tv;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_c;
    }


    @Override
    protected void initData() {
        tv = root.findViewById(R.id.tv);
        tv.setVisibility(View.VISIBLE);
    }
}
