package com.sky.hyh.customviewsamples.fragment.impl;

import android.view.View;

import com.hyh.annotation.InjectFragment;
import com.hyh.base_lib.BaseFragment;
import com.hyh.base_lib.annotation.FindViewByIdAno;
import com.sky.hyh.customviewsamples.R;
import com.sky.hyh.customviewsamples.customview.customviewpager.GraduleTitleViewpagerV2;
import com.sky.hyh.customviewsamples.customview.customviewpager.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;
@InjectFragment()
public class GraduleTitleViewPagerFragment extends BaseFragment {
    @FindViewByIdAno(R.id.gtv_view_pager)
    private GraduleTitleViewpagerV2 mGraduleTitleViewpager;

    @Override
    protected int getResId() {
        return R.layout.fragment_gradule_title_view_pager;
    }

    @Override
    protected void initViews(View rootView) {
        //准备数据源
        List<String> datas=new ArrayList<>();
        datas.add("#990000");
        datas.add("#271309");
        datas.add("#213456");
        datas.add("#016716");
        datas.add("#170456");
        datas.add("#ff11ff");
        datas.add("#016755");
        datas.add("#170111");
        datas.add("#3001ff");

        String[] titleContents = new String[datas.size()];
        for(int i=0;i<datas.size();i++){
            titleContents[i] = "哈哈"+i;
        }
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getContext(),datas);

        mGraduleTitleViewpager.setAdapter(titleContents,viewPagerAdapter);
    }
}
