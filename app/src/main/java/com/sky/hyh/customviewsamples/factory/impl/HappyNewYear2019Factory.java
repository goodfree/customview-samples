package com.sky.hyh.customviewsamples.factory.impl;

import com.hyh.base_lib.factory.BaseFragmentFactory;
import com.hyh.base_lib.fragment.BaseFragment;
import com.sky.hyh.customviewsamples.fragment.impl.HappyNewYear2019Fragment;

public class HappyNewYear2019Factory extends BaseFragmentFactory {
    @Override
    public BaseFragment createFragment() {
        return new HappyNewYear2019Fragment();
    }
}
