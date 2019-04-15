package com.sky.hyh.customviewsamples.factory.impl;

import com.hyh.base_lib.factory.BaseFragmentFactory;
import com.hyh.base_lib.fragment.BaseFragment;
import com.sky.hyh.customviewsamples.fragment.impl.RoundMaskViewFragment;

/**
 * Created by hyh on 2018/9/29 18:12
 * E-Mail Address：fjnuhyh122@gmail.com
 */
public class RoundMaskViewFactory extends BaseFragmentFactory {
    @Override
    public BaseFragment createFragment() {
        return new RoundMaskViewFragment();
    }
}
