package cn.lovepet.shops.view.ui.mvp.contract;

import cn.lovepet.shops.view.ui.activity.content.albumhomegoods.HomeIndex;

/**
 * @author dingcl
 * 首页契约类
 */

public interface GoodsJDHomeContract {
    interface View {
        void setHomeIndexData(HomeIndex find);
        void setRecommendedWares(HomeIndex find);
        void setMoreRecommendedWares(HomeIndex find);
    }
    interface Presenter {
        void getHomeIndexData(int flag);
        void getRecommendedWares();
        void getMoreRecommendedWares();
    }

}