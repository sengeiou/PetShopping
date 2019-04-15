package cn.lovepet.shops.view.ui.mvp.contract;

import cn.lovepet.shops.bean.GoodsNewsBean;

/**
 * @author dingcl
 * 商品信息契约类
 */

public interface GoodsNewsContract {
    interface View {
        void setGoodsNewsData(GoodsNewsBean find);
        void setMoreData(GoodsNewsBean find);
        void onNetError(String e);
        void onError(String e);
        void onFailure(String e);
        void onSuccess(String e);
        void onShowProgress(String msg);
        void onCancelProgress(String msg);
    }

    interface Presenter {
        void getGoodsNewsData();
        void getMoreFindData();
    }

}