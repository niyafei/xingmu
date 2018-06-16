package com.example.niyafei.niyafei0616.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by niyafei on 2018/6/16.
 */

public class MyAdapter extends FragmentPagerAdapter {
    public MyAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }
    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        Fragment fragment=null;
        switch (arg0) {
            case 0:
                fragment=new Fragment01();
                break;
            case 1:
                fragment=new Fragment02();
                break;
            case 2:
                fragment=new Fragment03();
                break;
        }
        return fragment;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }
}
