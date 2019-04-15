package cn.lovepet.shops.base.global;

import android.content.Context;

import cn.lovepet.shops.net.DataManager;

/**
 * Created by dingcl on 2017/3/10.
 */

public interface AppComponent {
    Context getContext();
    DataManager getDataManager();
}
